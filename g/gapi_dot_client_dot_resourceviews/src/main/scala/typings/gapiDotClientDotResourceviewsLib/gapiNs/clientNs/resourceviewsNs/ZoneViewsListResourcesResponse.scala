package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsListResourcesResponse extends js.Object {
  /** The formatted JSON that is requested by the user. */
  var items: js.UndefOr[js.Array[ListResourceResponseItem]] = js.undefined
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** A token used for pagination. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneViewsListResourcesResponse {
  @scala.inline
  def apply(
    items: js.Array[ListResourceResponseItem] = null,
    network: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): ZoneViewsListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (network != null) __obj.updateDynamic("network")(network)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ZoneViewsListResourcesResponse]
  }
}


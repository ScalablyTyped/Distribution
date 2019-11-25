package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsListResourcesResponse extends js.Object {
  /** The formatted JSON that is requested by the user. */
  var items: js.UndefOr[js.Array[ListResourceResponseItem]] = js.undefined
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[String] = js.undefined
  /** A token used for pagination. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ZoneViewsListResourcesResponse {
  @scala.inline
  def apply(
    items: js.Array[ListResourceResponseItem] = null,
    network: String = null,
    nextPageToken: String = null
  ): ZoneViewsListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneViewsListResourcesResponse]
  }
}


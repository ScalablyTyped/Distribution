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


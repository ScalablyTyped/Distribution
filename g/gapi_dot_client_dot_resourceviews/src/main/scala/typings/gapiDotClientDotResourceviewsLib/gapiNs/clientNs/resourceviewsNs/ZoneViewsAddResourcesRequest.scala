package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsAddResourcesRequest extends js.Object {
  /** The list of resources to be added. */
  var resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ZoneViewsAddResourcesRequest {
  @scala.inline
  def apply(resources: js.Array[java.lang.String] = null): ZoneViewsAddResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ZoneViewsAddResourcesRequest]
  }
}


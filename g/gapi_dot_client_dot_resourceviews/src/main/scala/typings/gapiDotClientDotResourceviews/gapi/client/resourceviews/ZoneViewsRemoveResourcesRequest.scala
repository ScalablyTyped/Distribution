package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsRemoveResourcesRequest extends js.Object {
  /** The list of resources to be removed. */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}

object ZoneViewsRemoveResourcesRequest {
  @scala.inline
  def apply(resources: js.Array[String] = null): ZoneViewsRemoveResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ZoneViewsRemoveResourcesRequest]
  }
}


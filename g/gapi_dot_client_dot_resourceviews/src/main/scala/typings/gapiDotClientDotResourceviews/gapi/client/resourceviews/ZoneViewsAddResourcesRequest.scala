package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsAddResourcesRequest extends js.Object {
  /** The list of resources to be added. */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}

object ZoneViewsAddResourcesRequest {
  @scala.inline
  def apply(resources: js.Array[String] = null): ZoneViewsAddResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneViewsAddResourcesRequest]
  }
}


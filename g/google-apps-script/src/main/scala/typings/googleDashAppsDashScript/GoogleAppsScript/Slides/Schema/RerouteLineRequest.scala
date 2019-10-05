package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RerouteLineRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object RerouteLineRequest {
  @scala.inline
  def apply(objectId: String = null): RerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[RerouteLineRequest]
  }
}


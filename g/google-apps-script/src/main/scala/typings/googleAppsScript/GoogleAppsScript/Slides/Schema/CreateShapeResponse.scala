package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShapeResponse extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
}

object CreateShapeResponse {
  @scala.inline
  def apply(objectId: String = null): CreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateShapeResponse]
  }
}


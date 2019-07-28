package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShapeRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var shapeType: js.UndefOr[String] = js.undefined
}

object CreateShapeRequest {
  @scala.inline
  def apply(elementProperties: PageElementProperties = null, objectId: String = null, shapeType: String = null): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType)
    __obj.asInstanceOf[CreateShapeRequest]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShapePropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
}

object UpdateShapePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, objectId: String = null, shapeProperties: ShapeProperties = null): UpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
}


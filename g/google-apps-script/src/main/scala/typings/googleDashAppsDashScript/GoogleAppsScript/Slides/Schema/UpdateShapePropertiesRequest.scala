package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

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
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
}


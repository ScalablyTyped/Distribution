package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShapePropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
}

object UpdateShapePropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    shapeProperties: ShapeProperties = null
  ): UpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShapeRequest extends js.Object {
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var shapeType: js.UndefOr[java.lang.String] = js.undefined
}

object CreateShapeRequest {
  @scala.inline
  def apply(
    elementProperties: PageElementProperties = null,
    objectId: java.lang.String = null,
    shapeType: java.lang.String = null
  ): CreateShapeRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeType != null) __obj.updateDynamic("shapeType")(shapeType)
    __obj.asInstanceOf[CreateShapeRequest]
  }
}


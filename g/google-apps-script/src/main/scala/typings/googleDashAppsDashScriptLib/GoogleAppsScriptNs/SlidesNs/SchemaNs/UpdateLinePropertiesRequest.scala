package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLinePropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateLinePropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    lineProperties: LineProperties = null,
    objectId: java.lang.String = null
  ): UpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[UpdateLinePropertiesRequest]
  }
}


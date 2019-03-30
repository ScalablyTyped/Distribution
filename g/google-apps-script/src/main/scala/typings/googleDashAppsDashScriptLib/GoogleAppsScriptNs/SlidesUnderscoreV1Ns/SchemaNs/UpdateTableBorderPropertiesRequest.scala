package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableBorderPropertiesRequest extends js.Object {
  var borderPosition: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UpdateTableBorderPropertiesRequest {
  @scala.inline
  def apply(
    borderPosition: java.lang.String = null,
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    tableBorderProperties: TableBorderProperties = null,
    tableRange: TableRange = null
  ): UpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (borderPosition != null) __obj.updateDynamic("borderPosition")(borderPosition)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableColumnPropertiesRequest extends js.Object {
  var columnIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.undefined
}

object UpdateTableColumnPropertiesRequest {
  @scala.inline
  def apply(
    columnIndices: js.Array[scala.Double] = null,
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    tableColumnProperties: TableColumnProperties = null
  ): UpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (columnIndices != null) __obj.updateDynamic("columnIndices")(columnIndices)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableColumnProperties != null) __obj.updateDynamic("tableColumnProperties")(tableColumnProperties)
    __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
  }
}


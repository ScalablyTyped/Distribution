package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableColumnPropertiesRequest extends js.Object {
  var columnIndices: js.UndefOr[js.Array[Double]] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.undefined
}

object UpdateTableColumnPropertiesRequest {
  @scala.inline
  def apply(
    columnIndices: js.Array[Double] = null,
    fields: String = null,
    objectId: String = null,
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


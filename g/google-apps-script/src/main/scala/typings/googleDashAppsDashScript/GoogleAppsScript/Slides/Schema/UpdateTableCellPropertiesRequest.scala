package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableCellPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(
    fields: String = null,
    objectId: String = null,
    tableCellProperties: TableCellProperties = null,
    tableRange: TableRange = null
  ): UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
  }
}


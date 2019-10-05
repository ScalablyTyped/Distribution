package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  var endIndex: js.UndefOr[Double] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedTableRowStyleChanges: js.UndefOr[js.Object] = js.undefined
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
}

object TableRow {
  @scala.inline
  def apply(
    endIndex: Int | Double = null,
    startIndex: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTableRowStyleChanges: js.Object = null,
    tableCells: js.Array[TableCell] = null,
    tableRowStyle: TableRowStyle = null
  ): TableRow = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (suggestedTableRowStyleChanges != null) __obj.updateDynamic("suggestedTableRowStyleChanges")(suggestedTableRowStyleChanges)
    if (tableCells != null) __obj.updateDynamic("tableCells")(tableCells)
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle)
    __obj.asInstanceOf[TableRow]
  }
}


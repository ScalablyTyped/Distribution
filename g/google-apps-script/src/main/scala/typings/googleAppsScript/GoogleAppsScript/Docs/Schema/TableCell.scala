package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  var suggestedTableCellStyleChanges: js.UndefOr[js.Object] = js.undefined
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
}

object TableCell {
  @scala.inline
  def apply(
    content: js.Array[StructuralElement] = null,
    endIndex: Int | Double = null,
    startIndex: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTableCellStyleChanges: js.Object = null,
    tableCellStyle: TableCellStyle = null
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTableCellStyleChanges != null) __obj.updateDynamic("suggestedTableCellStyleChanges")(suggestedTableCellStyleChanges.asInstanceOf[js.Any])
    if (tableCellStyle != null) __obj.updateDynamic("tableCellStyle")(tableCellStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}


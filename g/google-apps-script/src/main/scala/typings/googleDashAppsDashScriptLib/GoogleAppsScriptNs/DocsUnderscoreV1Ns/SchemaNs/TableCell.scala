package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var suggestedDeletionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedInsertionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var suggestedTableCellStyleChanges: js.UndefOr[js.Object] = js.undefined
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.undefined
}

object TableCell {
  @scala.inline
  def apply(
    content: js.Array[StructuralElement] = null,
    endIndex: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    suggestedDeletionIds: js.Array[java.lang.String] = null,
    suggestedInsertionIds: js.Array[java.lang.String] = null,
    suggestedTableCellStyleChanges: js.Object = null,
    tableCellStyle: TableCellStyle = null
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds)
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds)
    if (suggestedTableCellStyleChanges != null) __obj.updateDynamic("suggestedTableCellStyleChanges")(suggestedTableCellStyleChanges)
    if (tableCellStyle != null) __obj.updateDynamic("tableCellStyle")(tableCellStyle)
    __obj.asInstanceOf[TableCell]
  }
}


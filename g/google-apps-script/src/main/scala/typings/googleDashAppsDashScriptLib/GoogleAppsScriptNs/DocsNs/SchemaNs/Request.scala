package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.undefined
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
  var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.undefined
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.undefined
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
  var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.undefined
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
  var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.undefined
  var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.undefined
  var insertTable: js.UndefOr[InsertTableRequest] = js.undefined
  var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.undefined
  var insertText: js.UndefOr[InsertTextRequest] = js.undefined
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    createNamedRange: CreateNamedRangeRequest = null,
    createParagraphBullets: CreateParagraphBulletsRequest = null,
    deleteContentRange: DeleteContentRangeRequest = null,
    deleteNamedRange: DeleteNamedRangeRequest = null,
    deleteParagraphBullets: DeleteParagraphBulletsRequest = null,
    deletePositionedObject: DeletePositionedObjectRequest = null,
    deleteTableColumn: DeleteTableColumnRequest = null,
    deleteTableRow: DeleteTableRowRequest = null,
    insertInlineImage: InsertInlineImageRequest = null,
    insertPageBreak: InsertPageBreakRequest = null,
    insertTable: InsertTableRequest = null,
    insertTableRow: InsertTableRowRequest = null,
    insertText: InsertTextRequest = null,
    replaceAllText: ReplaceAllTextRequest = null,
    updateParagraphStyle: UpdateParagraphStyleRequest = null,
    updateTextStyle: UpdateTextStyleRequest = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange)
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets)
    if (deleteContentRange != null) __obj.updateDynamic("deleteContentRange")(deleteContentRange)
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange)
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets)
    if (deletePositionedObject != null) __obj.updateDynamic("deletePositionedObject")(deletePositionedObject)
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn)
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow)
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage)
    if (insertPageBreak != null) __obj.updateDynamic("insertPageBreak")(insertPageBreak)
    if (insertTable != null) __obj.updateDynamic("insertTable")(insertTable)
    if (insertTableRow != null) __obj.updateDynamic("insertTableRow")(insertTableRow)
    if (insertText != null) __obj.updateDynamic("insertText")(insertText)
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText)
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle)
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle)
    __obj.asInstanceOf[Request]
  }
}


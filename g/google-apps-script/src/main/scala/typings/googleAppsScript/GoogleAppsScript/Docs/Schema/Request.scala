package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

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
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange.asInstanceOf[js.Any])
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets.asInstanceOf[js.Any])
    if (deleteContentRange != null) __obj.updateDynamic("deleteContentRange")(deleteContentRange.asInstanceOf[js.Any])
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange.asInstanceOf[js.Any])
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets.asInstanceOf[js.Any])
    if (deletePositionedObject != null) __obj.updateDynamic("deletePositionedObject")(deletePositionedObject.asInstanceOf[js.Any])
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn.asInstanceOf[js.Any])
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow.asInstanceOf[js.Any])
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage.asInstanceOf[js.Any])
    if (insertPageBreak != null) __obj.updateDynamic("insertPageBreak")(insertPageBreak.asInstanceOf[js.Any])
    if (insertTable != null) __obj.updateDynamic("insertTable")(insertTable.asInstanceOf[js.Any])
    if (insertTableRow != null) __obj.updateDynamic("insertTableRow")(insertTableRow.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle.asInstanceOf[js.Any])
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}


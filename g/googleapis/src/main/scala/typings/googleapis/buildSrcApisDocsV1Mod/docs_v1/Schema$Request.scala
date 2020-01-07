package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single update to apply to a document.
  */
@js.native
trait Schema$Request extends js.Object {
  /**
    * Creates a named range.
    */
  var createNamedRange: js.UndefOr[Schema$CreateNamedRangeRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[Schema$CreateParagraphBulletsRequest] = js.native
  /**
    * Deletes content from the document.
    */
  var deleteContentRange: js.UndefOr[Schema$DeleteContentRangeRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[Schema$DeleteNamedRangeRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[Schema$DeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a positioned object from the document.
    */
  var deletePositionedObject: js.UndefOr[Schema$DeletePositionedObjectRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[Schema$DeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[Schema$DeleteTableRowRequest] = js.native
  /**
    * Inserts an inline image at the specified location.
    */
  var insertInlineImage: js.UndefOr[Schema$InsertInlineImageRequest] = js.native
  /**
    * Inserts a page break at the specified location.
    */
  var insertPageBreak: js.UndefOr[Schema$InsertPageBreakRequest] = js.native
  /**
    * Inserts a table at the specified location.
    */
  var insertTable: js.UndefOr[Schema$InsertTableRequest] = js.native
  /**
    * Inserts an empty row into a table.
    */
  var insertTableRow: js.UndefOr[Schema$InsertTableRowRequest] = js.native
  /**
    * Inserts text at the specified location.
    */
  var insertText: js.UndefOr[Schema$InsertTextRequest] = js.native
  /**
    * Replaces all instances of the specified text.
    */
  var replaceAllText: js.UndefOr[Schema$ReplaceAllTextRequest] = js.native
  /**
    * Updates the paragraph style at the specified range.
    */
  var updateParagraphStyle: js.UndefOr[Schema$UpdateParagraphStyleRequest] = js.native
  /**
    * Updates the text style at the specified range.
    */
  var updateTextStyle: js.UndefOr[Schema$UpdateTextStyleRequest] = js.native
}

object Schema$Request {
  @scala.inline
  def apply(
    createNamedRange: Schema$CreateNamedRangeRequest = null,
    createParagraphBullets: Schema$CreateParagraphBulletsRequest = null,
    deleteContentRange: Schema$DeleteContentRangeRequest = null,
    deleteNamedRange: Schema$DeleteNamedRangeRequest = null,
    deleteParagraphBullets: Schema$DeleteParagraphBulletsRequest = null,
    deletePositionedObject: Schema$DeletePositionedObjectRequest = null,
    deleteTableColumn: Schema$DeleteTableColumnRequest = null,
    deleteTableRow: Schema$DeleteTableRowRequest = null,
    insertInlineImage: Schema$InsertInlineImageRequest = null,
    insertPageBreak: Schema$InsertPageBreakRequest = null,
    insertTable: Schema$InsertTableRequest = null,
    insertTableRow: Schema$InsertTableRowRequest = null,
    insertText: Schema$InsertTextRequest = null,
    replaceAllText: Schema$ReplaceAllTextRequest = null,
    updateParagraphStyle: Schema$UpdateParagraphStyleRequest = null,
    updateTextStyle: Schema$UpdateTextStyleRequest = null
  ): Schema$Request = {
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
    __obj.asInstanceOf[Schema$Request]
  }
}


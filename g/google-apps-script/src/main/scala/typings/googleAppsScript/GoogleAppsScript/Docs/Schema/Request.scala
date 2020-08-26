package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.native
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.native
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.native
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.native
  var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.native
  var insertTable: js.UndefOr[InsertTableRequest] = js.native
  var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.native
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateNamedRange(value: CreateNamedRangeRequest): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    @scala.inline
    def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = this.set("createParagraphBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateParagraphBullets: Self = this.set("createParagraphBullets", js.undefined)
    @scala.inline
    def setDeleteContentRange(value: DeleteContentRangeRequest): Self = this.set("deleteContentRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteContentRange: Self = this.set("deleteContentRange", js.undefined)
    @scala.inline
    def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = this.set("deleteNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteNamedRange: Self = this.set("deleteNamedRange", js.undefined)
    @scala.inline
    def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = this.set("deleteParagraphBullets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteParagraphBullets: Self = this.set("deleteParagraphBullets", js.undefined)
    @scala.inline
    def setDeletePositionedObject(value: DeletePositionedObjectRequest): Self = this.set("deletePositionedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletePositionedObject: Self = this.set("deletePositionedObject", js.undefined)
    @scala.inline
    def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = this.set("deleteTableColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTableColumn: Self = this.set("deleteTableColumn", js.undefined)
    @scala.inline
    def setDeleteTableRow(value: DeleteTableRowRequest): Self = this.set("deleteTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTableRow: Self = this.set("deleteTableRow", js.undefined)
    @scala.inline
    def setInsertInlineImage(value: InsertInlineImageRequest): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    @scala.inline
    def setInsertPageBreak(value: InsertPageBreakRequest): Self = this.set("insertPageBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertPageBreak: Self = this.set("insertPageBreak", js.undefined)
    @scala.inline
    def setInsertTable(value: InsertTableRequest): Self = this.set("insertTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTable: Self = this.set("insertTable", js.undefined)
    @scala.inline
    def setInsertTableRow(value: InsertTableRowRequest): Self = this.set("insertTableRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTableRow: Self = this.set("insertTableRow", js.undefined)
    @scala.inline
    def setInsertText(value: InsertTextRequest): Self = this.set("insertText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextRequest): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
    @scala.inline
    def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = this.set("updateParagraphStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateParagraphStyle: Self = this.set("updateParagraphStyle", js.undefined)
    @scala.inline
    def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = this.set("updateTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTextStyle: Self = this.set("updateTextStyle", js.undefined)
  }
  
}


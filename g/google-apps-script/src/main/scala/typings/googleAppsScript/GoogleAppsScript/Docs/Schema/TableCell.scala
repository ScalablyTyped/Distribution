package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.native
  var endIndex: js.UndefOr[Double] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedTableCellStyleChanges: js.UndefOr[js.Object] = js.native
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.native
}

object TableCell {
  @scala.inline
  def apply(): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCell]
  }
  @scala.inline
  implicit class TableCellOps[Self <: TableCell] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: StructuralElement*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[StructuralElement]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    @scala.inline
    def setSuggestedTableCellStyleChanges(value: js.Object): Self = this.set("suggestedTableCellStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedTableCellStyleChanges: Self = this.set("suggestedTableCellStyleChanges", js.undefined)
    @scala.inline
    def setTableCellStyle(value: TableCellStyle): Self = this.set("tableCellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellStyle: Self = this.set("tableCellStyle", js.undefined)
  }
  
}


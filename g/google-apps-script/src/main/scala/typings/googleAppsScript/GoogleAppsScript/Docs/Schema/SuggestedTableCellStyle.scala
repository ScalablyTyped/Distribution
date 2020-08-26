package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedTableCellStyle extends js.Object {
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.native
  var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.native
}

object SuggestedTableCellStyle {
  @scala.inline
  def apply(): SuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableCellStyle]
  }
  @scala.inline
  implicit class SuggestedTableCellStyleOps[Self <: SuggestedTableCellStyle] (val x: Self) extends AnyVal {
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
    def setTableCellStyle(value: TableCellStyle): Self = this.set("tableCellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellStyle: Self = this.set("tableCellStyle", js.undefined)
    @scala.inline
    def setTableCellStyleSuggestionState(value: TableCellStyleSuggestionState): Self = this.set("tableCellStyleSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellStyleSuggestionState: Self = this.set("tableCellStyleSuggestionState", js.undefined)
  }
  
}


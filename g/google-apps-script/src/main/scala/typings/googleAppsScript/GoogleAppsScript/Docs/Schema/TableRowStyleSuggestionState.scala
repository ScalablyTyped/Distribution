package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowStyleSuggestionState extends js.Object {
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.native
}

object TableRowStyleSuggestionState {
  @scala.inline
  def apply(): TableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowStyleSuggestionState]
  }
  @scala.inline
  implicit class TableRowStyleSuggestionStateOps[Self <: TableRowStyleSuggestionState] (val x: Self) extends AnyVal {
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
    def setMinRowHeightSuggested(value: Boolean): Self = this.set("minRowHeightSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowHeightSuggested: Self = this.set("minRowHeightSuggested", js.undefined)
  }
  
}


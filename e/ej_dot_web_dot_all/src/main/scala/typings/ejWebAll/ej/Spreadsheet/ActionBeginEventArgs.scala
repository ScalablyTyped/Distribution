package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeginEventArgs extends js.Object {
  /** Returns the applied style format object.
    */
  var afterFormat: js.UndefOr[js.Any] = js.native
  /** Returns the applied style format object.
    */
  var beforeFormat: js.UndefOr[js.Any] = js.native
  /** Returns selected columns while sorting or filtering begins.
    */
  var colSelected: js.UndefOr[Double] = js.native
  /** Return column name while sorting.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns goto index while paging.
    */
  var gotoIdx: js.UndefOr[Double] = js.native
  /** Returns boolean value. If create new sheet it returns true.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  /** Returns the cell range.
    */
  var range: js.UndefOr[js.Array[_]] = js.native
  /** Returns the action format.
    */
  var reqType: js.UndefOr[String] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  /** Returns sort direction while sort action begins.
    */
  var sortDirection: js.UndefOr[String] = js.native
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
  @scala.inline
  implicit class ActionBeginEventArgsOps[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
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
    def setAfterFormat(value: js.Any): Self = this.set("afterFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterFormat: Self = this.set("afterFormat", js.undefined)
    @scala.inline
    def setBeforeFormat(value: js.Any): Self = this.set("beforeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeFormat: Self = this.set("beforeFormat", js.undefined)
    @scala.inline
    def setColSelected(value: Double): Self = this.set("colSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSelected: Self = this.set("colSelected", js.undefined)
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setGotoIdx(value: Double): Self = this.set("gotoIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGotoIdx: Self = this.set("gotoIdx", js.undefined)
    @scala.inline
    def setNewSheet(value: Boolean): Self = this.set("newSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSheet: Self = this.set("newSheet", js.undefined)
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setReqType(value: String): Self = this.set("reqType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqType: Self = this.set("reqType", js.undefined)
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    @scala.inline
    def setSortDirection(value: String): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
  }
  
}


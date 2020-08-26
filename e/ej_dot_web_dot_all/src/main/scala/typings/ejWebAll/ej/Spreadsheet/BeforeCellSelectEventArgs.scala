package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeCellSelectEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current cell range.
    */
  var currRange: js.UndefOr[js.Array[_]] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the previous cell range.
    */
  var prevRange: js.UndefOr[js.Array[_]] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BeforeCellSelectEventArgs {
  @scala.inline
  def apply(): BeforeCellSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeCellSelectEventArgs]
  }
  @scala.inline
  implicit class BeforeCellSelectEventArgsOps[Self <: BeforeCellSelectEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCurrRangeVarargs(value: js.Any*): Self = this.set("currRange", js.Array(value :_*))
    @scala.inline
    def setCurrRange(value: js.Array[_]): Self = this.set("currRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrRange: Self = this.set("currRange", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPrevRangeVarargs(value: js.Any*): Self = this.set("prevRange", js.Array(value :_*))
    @scala.inline
    def setPrevRange(value: js.Array[_]): Self = this.set("prevRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevRange: Self = this.set("prevRange", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


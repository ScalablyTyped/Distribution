package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns auto fill begin cell range.
    */
  var dataRange: js.UndefOr[js.Array[_]] = js.native
  /** Returns which direction drag the auto fill.
    */
  var direction: js.UndefOr[String] = js.native
  /** Returns fill cells range.
    */
  var fillRange: js.UndefOr[js.Array[_]] = js.native
  /** Returns the auto fill type.
    */
  var fillType: js.UndefOr[String] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object AutoFillBeginEventArgs {
  @scala.inline
  def apply(): AutoFillBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillBeginEventArgs]
  }
  @scala.inline
  implicit class AutoFillBeginEventArgsOps[Self <: AutoFillBeginEventArgs] (val x: Self) extends AnyVal {
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
    def setDataRangeVarargs(value: js.Any*): Self = this.set("dataRange", js.Array(value :_*))
    @scala.inline
    def setDataRange(value: js.Array[_]): Self = this.set("dataRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRange: Self = this.set("dataRange", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFillRangeVarargs(value: js.Any*): Self = this.set("fillRange", js.Array(value :_*))
    @scala.inline
    def setFillRange(value: js.Array[_]): Self = this.set("fillRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRange: Self = this.set("fillRange", js.undefined)
    @scala.inline
    def setFillType(value: String): Self = this.set("fillType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillType: Self = this.set("fillType", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


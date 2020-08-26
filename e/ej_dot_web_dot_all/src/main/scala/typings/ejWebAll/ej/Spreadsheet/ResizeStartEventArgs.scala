package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the column index which column you start to resize.
    */
  var colIndex: js.UndefOr[Double] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns type of the request.
    */
  var reqType: js.UndefOr[String] = js.native
  /** Returns the row index which row you start to resize.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ResizeStartEventArgs {
  @scala.inline
  def apply(): ResizeStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeStartEventArgs]
  }
  @scala.inline
  implicit class ResizeStartEventArgsOps[Self <: ResizeStartEventArgs] (val x: Self) extends AnyVal {
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
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setReqType(value: String): Self = this.set("reqType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqType: Self = this.set("reqType", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


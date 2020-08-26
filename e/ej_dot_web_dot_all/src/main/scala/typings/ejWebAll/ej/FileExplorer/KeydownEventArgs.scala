package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeydownEventArgs extends js.Object {
  /** returns altKey value.
    */
  var altKey: js.UndefOr[Boolean] = js.native
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns ctrlKey value.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  /** returns the downed key keyCode value
    */
  var keyCode: js.UndefOr[Double] = js.native
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the event object.
    */
  var originalArgs: js.UndefOr[js.Any] = js.native
  /** returns shiftKey value.
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object KeydownEventArgs {
  @scala.inline
  def apply(): KeydownEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeydownEventArgs]
  }
  @scala.inline
  implicit class KeydownEventArgsOps[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOriginalArgs(value: js.Any): Self = this.set("originalArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalArgs: Self = this.set("originalArgs", js.undefined)
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


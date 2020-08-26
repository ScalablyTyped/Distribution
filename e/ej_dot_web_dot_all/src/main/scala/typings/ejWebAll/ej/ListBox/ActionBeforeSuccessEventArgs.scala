package typings.ejWebAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBeforeSuccessEventArgs extends js.Object {
  /** List of actual object.
    */
  var actual: js.UndefOr[js.Any] = js.native
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[Model] = js.native
  /** Object of ListBox widget which contains DataManager arguments
    */
  var request: js.UndefOr[js.Any] = js.native
  /** List of array object
    */
  var result: js.UndefOr[js.Array[_]] = js.native
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** ExecuteQuery object of DataManager
    */
  var xhr: js.UndefOr[js.Any] = js.native
}

object ActionBeforeSuccessEventArgs {
  @scala.inline
  def apply(): ActionBeforeSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBeforeSuccessEventArgs]
  }
  @scala.inline
  implicit class ActionBeforeSuccessEventArgsOps[Self <: ActionBeforeSuccessEventArgs] (val x: Self) extends AnyVal {
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
    def setActual(value: js.Any): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActual: Self = this.set("actual", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResultVarargs(value: js.Any*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[_]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXhr(value: js.Any): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}


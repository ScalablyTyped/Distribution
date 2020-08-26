package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterUpdateStateChangeEventArgs extends js.Object {
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** The parameter block id.
    */
  var containerId: js.UndefOr[String] = js.native
  /** true, if the event handled by user; otherwise, false.
    */
  var handled: js.UndefOr[Boolean] = js.native
  /** returns the report model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Its only to notify the the current parameter.
    */
  var name: js.UndefOr[String] = js.native
  /** The progress text that is displayed on the loading indicator.
    */
  var progressText: js.UndefOr[String] = js.native
  /** Its only to notify the current parameter prompt value.
    */
  var prompt: js.UndefOr[String] = js.native
  /** The processing state.
    */
  var state: js.UndefOr[String] = js.native
}

object ParameterUpdateStateChangeEventArgs {
  @scala.inline
  def apply(): ParameterUpdateStateChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterUpdateStateChangeEventArgs]
  }
  @scala.inline
  implicit class ParameterUpdateStateChangeEventArgsOps[Self <: ParameterUpdateStateChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandled: Self = this.set("handled", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProgressText(value: String): Self = this.set("progressText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressText: Self = this.set("progressText", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}


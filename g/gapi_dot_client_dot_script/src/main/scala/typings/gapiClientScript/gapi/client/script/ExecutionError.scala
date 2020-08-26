package typings.gapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionError extends js.Object {
  /**
    * The error message thrown by Apps Script, usually localized into the user's
    * language.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error
    * type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[String] = js.native
  /**
    * An array of objects that provide a stack trace through the script to show
    * where the execution failed, with the deepest call first.
    */
  var scriptStackTraceElements: js.UndefOr[js.Array[ScriptStackTraceElement]] = js.native
}

object ExecutionError {
  @scala.inline
  def apply(): ExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionError]
  }
  @scala.inline
  implicit class ExecutionErrorOps[Self <: ExecutionError] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
    @scala.inline
    def setScriptStackTraceElementsVarargs(value: ScriptStackTraceElement*): Self = this.set("scriptStackTraceElements", js.Array(value :_*))
    @scala.inline
    def setScriptStackTraceElements(value: js.Array[ScriptStackTraceElement]): Self = this.set("scriptStackTraceElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptStackTraceElements: Self = this.set("scriptStackTraceElements", js.undefined)
  }
  
}


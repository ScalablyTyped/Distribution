package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that is only visible to admins of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newDebugError()
  *       .setText("This is the debug error text.")
  *       .throwException();
  */
@js.native
trait DebugError extends js.Object {
  def printJson(): String = js.native
  def setText(text: String): DebugError = js.native
  def throwException(): scala.Nothing = js.native
}

object DebugError {
  @scala.inline
  def apply(printJson: () => String, setText: String => DebugError, throwException: () => scala.Nothing): DebugError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
    __obj.asInstanceOf[DebugError]
  }
  @scala.inline
  implicit class DebugErrorOps[Self <: DebugError] (val x: Self) extends AnyVal {
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
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
    @scala.inline
    def setSetText(value: String => DebugError): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def setThrowException(value: () => scala.Nothing): Self = this.set("throwException", js.Any.fromFunction0(value))
  }
  
}


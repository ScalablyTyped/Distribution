package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserError extends js.Object {
  def printJson(): java.lang.String
  def setDebugText(text: java.lang.String): UserError
  def setText(text: java.lang.String): UserError
  def throwException(): scala.Unit
}

object UserError {
  @scala.inline
  def apply(
    printJson: js.Function0[java.lang.String],
    setDebugText: js.Function1[java.lang.String, UserError],
    setText: js.Function1[java.lang.String, UserError],
    throwException: js.Function0[scala.Unit]
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = printJson, setDebugText = setDebugText, setText = setText, throwException = throwException)
  
    __obj.asInstanceOf[UserError]
  }
}


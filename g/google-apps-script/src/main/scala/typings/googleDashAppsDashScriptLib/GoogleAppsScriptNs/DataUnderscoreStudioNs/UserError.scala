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
    printJson: () => java.lang.String,
    setDebugText: java.lang.String => UserError,
    setText: java.lang.String => UserError,
    throwException: () => scala.Unit
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setDebugText = js.Any.fromFunction1(setDebugText), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[UserError]
  }
}


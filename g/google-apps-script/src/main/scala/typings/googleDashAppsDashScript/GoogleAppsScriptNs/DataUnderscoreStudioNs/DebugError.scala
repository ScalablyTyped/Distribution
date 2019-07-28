package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugError extends js.Object {
  def printJson(): String
  def setText(text: String): DebugError
  def throwException(): Unit
}

object DebugError {
  @scala.inline
  def apply(printJson: () => String, setText: String => DebugError, throwException: () => Unit): DebugError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[DebugError]
  }
}


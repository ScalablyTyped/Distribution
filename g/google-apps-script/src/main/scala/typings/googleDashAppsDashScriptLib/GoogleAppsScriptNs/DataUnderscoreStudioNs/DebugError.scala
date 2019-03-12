package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugError extends js.Object {
  def printJson(): java.lang.String
  def setText(text: java.lang.String): DebugError
  def throwException(): scala.Unit
}

object DebugError {
  @scala.inline
  def apply(
    printJson: () => java.lang.String,
    setText: java.lang.String => DebugError,
    throwException: () => scala.Unit
  ): DebugError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[DebugError]
  }
}


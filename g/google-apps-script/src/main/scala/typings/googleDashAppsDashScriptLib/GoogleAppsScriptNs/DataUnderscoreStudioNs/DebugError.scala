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
    printJson: js.Function0[java.lang.String],
    setText: js.Function1[java.lang.String, DebugError],
    throwException: js.Function0[scala.Unit]
  ): DebugError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson)
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("throwException")(throwException)
    __obj.asInstanceOf[DebugError]
  }
}


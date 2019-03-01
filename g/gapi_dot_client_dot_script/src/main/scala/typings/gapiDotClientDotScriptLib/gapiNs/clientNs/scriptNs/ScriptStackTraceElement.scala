package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptStackTraceElement extends js.Object {
  /** The name of the function that failed. */
  var function: js.UndefOr[java.lang.String] = js.undefined
  /** The line number where the script failed. */
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
}

object ScriptStackTraceElement {
  @scala.inline
  def apply(function: java.lang.String = null, lineNumber: scala.Int | scala.Double = null): ScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptStackTraceElement]
  }
}


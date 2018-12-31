package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionError extends js.Object {
  /**
    * The error message thrown by Apps Script, usually localized into the user's
    * language.
    */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error
    * type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of objects that provide a stack trace through the script to show
    * where the execution failed, with the deepest call first.
    */
  var scriptStackTraceElements: js.UndefOr[js.Array[ScriptStackTraceElement]] = js.undefined
}


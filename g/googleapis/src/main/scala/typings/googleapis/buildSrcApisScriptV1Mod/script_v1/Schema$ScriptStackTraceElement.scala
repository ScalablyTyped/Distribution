package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stack trace through the script that shows where the execution failed.
  */
@js.native
trait Schema$ScriptStackTraceElement extends js.Object {
  /**
    * The name of the function that failed.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * The line number where the script failed.
    */
  var lineNumber: js.UndefOr[Double] = js.native
}

object Schema$ScriptStackTraceElement {
  @scala.inline
  def apply(function: String = null, lineNumber: Int | Double = null): Schema$ScriptStackTraceElement = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScriptStackTraceElement]
  }
}


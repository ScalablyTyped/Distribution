package typings.gapiDotClientDotFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCall extends js.Object {
  /** The arguments that were provided to the function. */
  var args: js.UndefOr[js.Array[_]] = js.undefined
  /** Name of the function invoked. */
  var function: js.UndefOr[String] = js.undefined
}

object FunctionCall {
  @scala.inline
  def apply(args: js.Array[_] = null, function: String = null): FunctionCall = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (function != null) __obj.updateDynamic("function")(function)
    __obj.asInstanceOf[FunctionCall]
  }
}


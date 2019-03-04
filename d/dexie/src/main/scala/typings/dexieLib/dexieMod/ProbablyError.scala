package typings
package dexieLib.dexieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProbablyError extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object ProbablyError {
  @scala.inline
  def apply(message: java.lang.String = null, name: java.lang.String = null, stack: java.lang.String = null): ProbablyError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ProbablyError]
  }
}


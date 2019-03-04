package typings
package ensureDashErrorLib.ensureDashErrorMod.ensureErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonError
  extends stdLib.Error {
  @JSName("name")
  var name_NonError: ensureDashErrorLib.ensureDashErrorLibStrings.NonError
}

object NonError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: ensureDashErrorLib.ensureDashErrorLibStrings.NonError,
    stack: java.lang.String = null
  ): NonError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NonError]
  }
}


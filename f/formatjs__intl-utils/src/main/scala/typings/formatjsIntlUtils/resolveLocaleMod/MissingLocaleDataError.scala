package typings.formatjsIntlUtils.resolveLocaleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingLocaleDataError extends Error {
  var `type`: String
}

object MissingLocaleDataError {
  @scala.inline
  def apply(message: String, name: String, `type`: String, stack: String = null): MissingLocaleDataError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingLocaleDataError]
  }
}


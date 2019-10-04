package typings.atFormatjsIntlDashUtils.distPolyfillDashUtilsMod

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
    val __obj = js.Dynamic.literal(message = message, name = name)
    __obj.updateDynamic("type")(`type`)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MissingLocaleDataError]
  }
}


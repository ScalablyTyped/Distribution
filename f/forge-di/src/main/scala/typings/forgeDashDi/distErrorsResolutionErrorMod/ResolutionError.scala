package typings.forgeDashDi.distErrorsResolutionErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionError extends Error

object ResolutionError {
  @scala.inline
  def apply(message: String, name: String, toString: () => String, stack: String = null): ResolutionError = {
    val __obj = js.Dynamic.literal(message = message, name = name, toString = js.Any.fromFunction0(toString))
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResolutionError]
  }
}


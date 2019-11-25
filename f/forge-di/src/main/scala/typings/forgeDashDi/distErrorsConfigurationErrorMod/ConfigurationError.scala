package typings.forgeDashDi.distErrorsConfigurationErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationError extends Error

object ConfigurationError {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): ConfigurationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationError]
  }
}


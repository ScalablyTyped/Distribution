package typings.forgeDi.configurationErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationError extends Error

object ConfigurationError {
  @scala.inline
  def apply(message: String, name: String): ConfigurationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationError]
  }
}


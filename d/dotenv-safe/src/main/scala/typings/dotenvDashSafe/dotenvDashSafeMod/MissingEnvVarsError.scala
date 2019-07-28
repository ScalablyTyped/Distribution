package typings.dotenvDashSafe.dotenvDashSafeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingEnvVarsError extends Error {
  /**
    * Variables which existing in the sample file, but not in the loaded file.
    */
  var missing: js.Array[String]
  /**
    * Path to example environment file.
    */
  var sample: String
}

object MissingEnvVarsError {
  @scala.inline
  def apply(message: String, missing: js.Array[String], name: String, sample: String, stack: String = null): MissingEnvVarsError = {
    val __obj = js.Dynamic.literal(message = message, missing = missing, name = name, sample = sample)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MissingEnvVarsError]
  }
}


package typings
package dotenvDashSafeLib.dotenvDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingEnvVarsError
  extends nodeLib.Error {
  /**
    * Variables which existing in the sample file, but not in the loaded file.
    */
  var missing: js.Array[java.lang.String]
  /**
    * Path to example environment file.
    */
  var sample: java.lang.String
}

object MissingEnvVarsError {
  @scala.inline
  def apply(missing: js.Array[java.lang.String], sample: java.lang.String, stack: java.lang.String = null): MissingEnvVarsError = {
    val __obj = js.Dynamic.literal(missing = missing, sample = sample)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MissingEnvVarsError]
  }
}


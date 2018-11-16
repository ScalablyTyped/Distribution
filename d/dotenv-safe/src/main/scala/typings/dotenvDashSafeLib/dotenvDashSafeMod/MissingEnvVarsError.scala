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


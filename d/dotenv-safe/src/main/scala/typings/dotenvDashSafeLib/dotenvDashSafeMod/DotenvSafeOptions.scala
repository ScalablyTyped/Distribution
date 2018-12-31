package typings
package dotenvDashSafeLib.dotenvDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvSafeOptions extends js.Object {
  /**
    * Enabling this option will not throw an error after loading.
    * @default false
    */
  var allowEmptyValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Encoding of your file containing environment variables.
    * @default "utf8"
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to example environment file. (Option 1)
    * @default ".env.example"
    */
  var example: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can specify a custom path if your file containing environment variables is named or located differently.
    * @default '.env'
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to example environment file. (Option 2 -- example takes precendence)
    * @default ".env.example"
    */
  var sample: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path to environment file.
    * @default ".env"
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}


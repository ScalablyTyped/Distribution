package typings.dotenvDashSafe.dotenvDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvSafeOptions extends js.Object {
  /**
    * Enabling this option will not throw an error after loading.
    * @default false
    */
  var allowEmptyValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Encoding of your file containing environment variables.
    * @default "utf8"
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * Path to example environment file. (Option 1)
    * @default ".env.example"
    */
  var example: js.UndefOr[String] = js.undefined
  /**
    * You can specify a custom path if your file containing environment variables is named or located differently.
    * @default '.env'
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Path to example environment file. (Option 2 -- example takes precendence)
    * @default ".env.example"
    */
  var sample: js.UndefOr[String] = js.undefined
  /**
    * Path to environment file.
    * @default ".env"
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object DotenvSafeOptions {
  @scala.inline
  def apply(
    allowEmptyValues: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    example: String = null,
    path: String = null,
    sample: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): DotenvSafeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyValues)) __obj.updateDynamic("allowEmptyValues")(allowEmptyValues)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (example != null) __obj.updateDynamic("example")(example)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sample != null) __obj.updateDynamic("sample")(sample)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[DotenvSafeOptions]
  }
}


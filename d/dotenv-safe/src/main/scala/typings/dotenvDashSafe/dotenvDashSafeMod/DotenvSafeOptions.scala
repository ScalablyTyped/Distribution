package typings.dotenvDashSafe.dotenvDashSafeMod

import typings.dotenv.dotenvMod.DotenvConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvSafeOptions extends DotenvConfigOptions {
  /**
    * Enabling this option will not throw an error after loading.
    * @default false
    */
  var allowEmptyValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to example environment file. (Option 1)
    * @default ".env.example"
    */
  var example: js.UndefOr[String] = js.undefined
  /**
    * Path to example environment file. (Option 2 -- example takes precedence)
    * @default ".env.example"
    */
  var sample: js.UndefOr[String] = js.undefined
}

object DotenvSafeOptions {
  @scala.inline
  def apply(
    allowEmptyValues: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    example: String = null,
    path: String = null,
    sample: String = null
  ): DotenvSafeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyValues)) __obj.updateDynamic("allowEmptyValues")(allowEmptyValues)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (example != null) __obj.updateDynamic("example")(example)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sample != null) __obj.updateDynamic("sample")(sample)
    __obj.asInstanceOf[DotenvSafeOptions]
  }
}


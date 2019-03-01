package typings
package dotenvLib.dotenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvConfigOptions extends js.Object {
  /**
    * You may turn on logging to help debug why certain keys or values are not being set as you expect.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You may specify the encoding of your file containing environment variables.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You may specify a custom path if your file containing environment variables is located elsewhere.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object DotenvConfigOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    path: java.lang.String = null
  ): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[DotenvConfigOptions]
  }
}


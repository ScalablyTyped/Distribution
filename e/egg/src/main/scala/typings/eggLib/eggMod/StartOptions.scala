package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[java.lang.String] = js.undefined
  /** ignore single process mode warning */
  var ignoreWarning: js.UndefOr[scala.Boolean] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    baseDir: java.lang.String = null,
    framework: java.lang.String = null,
    ignoreWarning: js.UndefOr[scala.Boolean] = js.undefined
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (!js.isUndefined(ignoreWarning)) __obj.updateDynamic("ignoreWarning")(ignoreWarning)
    __obj.asInstanceOf[StartOptions]
  }
}


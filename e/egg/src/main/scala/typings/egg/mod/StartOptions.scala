package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOptions extends js.Object {
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.undefined
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.undefined
  /** ignore single process mode warning */
  var ignoreWarning: js.UndefOr[Boolean] = js.undefined
}

object StartOptions {
  @scala.inline
  def apply(
    baseDir: String = null,
    framework: String = null,
    ignoreWarning: js.UndefOr[Boolean] = js.undefined
  ): StartOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarning)) __obj.updateDynamic("ignoreWarning")(ignoreWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
}


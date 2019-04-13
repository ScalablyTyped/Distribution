package typings
package gitDashUsernameLib.gitDashUsernameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, strict: js.UndefOr[scala.Boolean] = js.undefined): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[BaseOptions]
  }
}


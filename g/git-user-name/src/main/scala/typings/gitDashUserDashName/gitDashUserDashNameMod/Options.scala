package typings.gitDashUserDashName.gitDashUserDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var gitconfig: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, gitconfig: String = null, path: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (gitconfig != null) __obj.updateDynamic("gitconfig")(gitconfig)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Options]
  }
}


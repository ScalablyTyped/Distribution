package typings.gitDashUsername.gitDashUsernameMod

import typings.gitDashUsername.gitDashUsernameNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictOptions extends BaseOptions {
  @JSName("strict")
  var strict_StrictOptions: `true`
}

object StrictOptions {
  @scala.inline
  def apply(strict: `true`, cwd: String = null): StrictOptions = {
    val __obj = js.Dynamic.literal(strict = strict)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[StrictOptions]
  }
}


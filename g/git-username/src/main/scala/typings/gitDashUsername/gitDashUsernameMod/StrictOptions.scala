package typings.gitDashUsername.gitDashUsernameMod

import typings.gitDashUsername.gitDashUsernameBooleans.`true`
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
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictOptions]
  }
}


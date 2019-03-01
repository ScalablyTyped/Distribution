package typings
package gitDashUsernameLib.gitDashUsernameMod.gitUsernameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictOptions extends BaseOptions {
  @JSName("strict")
  var strict_StrictOptions: gitDashUsernameLib.gitDashUsernameLibNumbers.`true`
}

object StrictOptions {
  @scala.inline
  def apply(strict: gitDashUsernameLib.gitDashUsernameLibNumbers.`true`, cwd: java.lang.String = null): StrictOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strict")(strict)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[StrictOptions]
  }
}


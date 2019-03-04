package typings
package foreverDashMonitorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCommand extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var command: java.lang.String
}

object Anon_ArgsCommand {
  @scala.inline
  def apply(command: java.lang.String, args: js.Array[java.lang.String] = null): Anon_ArgsCommand = {
    val __obj = js.Dynamic.literal(command = command)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[Anon_ArgsCommand]
  }
}


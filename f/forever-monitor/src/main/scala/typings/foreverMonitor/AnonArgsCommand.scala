package typings.foreverMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsCommand extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: String
}

object AnonArgsCommand {
  @scala.inline
  def apply(command: String, args: js.Array[String] = null): AnonArgsCommand = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgsCommand]
  }
}


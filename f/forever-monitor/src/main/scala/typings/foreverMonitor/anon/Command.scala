package typings.foreverMonitor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var command: String
}

object Command {
  @scala.inline
  def apply(command: String, args: js.Array[String] = null): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}


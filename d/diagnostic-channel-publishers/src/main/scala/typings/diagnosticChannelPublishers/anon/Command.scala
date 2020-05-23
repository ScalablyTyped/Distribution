package typings.diagnosticChannelPublishers.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var command: js.UndefOr[js.Any] = js.undefined
  var databaseName: js.UndefOr[String] = js.undefined
  var time: Date
}

object Command {
  @scala.inline
  def apply(time: Date, command: js.Any = null, databaseName: String = null): Command = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}


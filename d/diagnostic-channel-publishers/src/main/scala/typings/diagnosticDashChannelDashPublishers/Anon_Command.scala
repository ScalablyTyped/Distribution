package typings.diagnosticDashChannelDashPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command extends js.Object {
  var command: js.UndefOr[js.Any] = js.undefined
  var databaseName: js.UndefOr[String] = js.undefined
}

object Anon_Command {
  @scala.inline
  def apply(command: js.Any = null, databaseName: String = null): Anon_Command = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Command]
  }
}


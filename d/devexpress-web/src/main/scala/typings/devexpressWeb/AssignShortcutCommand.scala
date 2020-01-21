package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to assign a shortcut to the specified client command.
  */
@JSGlobal("AssignShortcutCommand")
@js.native
class AssignShortcutCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the AssignShortcutCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param keyCode A specifically generated code that uniquely identifies the combination of keys specified for a shortcut. This code is specified using the ASPxClientUtils.GetShortcutCode method.
    * @param callback A callback function to execute when a shortcut is activated.
    */
  def execute(keyCode: Double, callback: js.Function0[Unit]): Boolean = js.native
}


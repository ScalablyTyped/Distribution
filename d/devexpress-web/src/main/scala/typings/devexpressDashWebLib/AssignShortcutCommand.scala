package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to assign a shortcut to the specified client command.
  */
trait AssignShortcutCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the AssignShortcutCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param keyCode A specifically generated code that uniquely identifies the combination of keys specified for a shortcut. This code is specified using the GetShortcutCode method.
    * @param callback A callback function to execute when a shortcut is activated.
    */
  def execute(keyCode: scala.Double, callback: js.Function): scala.Boolean
}

object AssignShortcutCommand {
  @scala.inline
  def apply(
    execute: js.Function2[scala.Double, js.Function, scala.Boolean],
    getState: js.Function0[SimpleCommandState]
  ): AssignShortcutCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[AssignShortcutCommand]
  }
}


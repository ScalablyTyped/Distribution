package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's text wrapping settings.
  */
trait ChangeFloatingObjectTextWrappingCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  def execute(settings: FloatingObjectTextWrappingSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectTextWrappingCommand {
  @scala.inline
  def apply(
    execute: js.Function1[FloatingObjectTextWrappingSettings, scala.Boolean],
    getState: js.Function0[js.Any]
  ): ChangeFloatingObjectTextWrappingCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeFloatingObjectTextWrappingCommand]
  }
}


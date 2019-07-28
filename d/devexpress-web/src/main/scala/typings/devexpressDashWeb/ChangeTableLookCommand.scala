package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's style options.
  */
trait ChangeTableLookCommand extends CommandBase {
  /**
    * Executes the ChangeTableLookCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  def execute(settings: TableLookSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableLookCommand {
  @scala.inline
  def apply(execute: TableLookSettings => Boolean, getState: () => js.Any): ChangeTableLookCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeTableLookCommand]
  }
}


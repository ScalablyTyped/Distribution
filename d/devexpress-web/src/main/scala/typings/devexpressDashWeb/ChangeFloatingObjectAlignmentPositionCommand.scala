package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's alignment position.
  */
trait ChangeFloatingObjectAlignmentPositionCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectAlignmentPositionCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectAlignmentPositionSettings object specifying alignment position settings.
    */
  def execute(settings: FloatingObjectAlignmentPositionSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectAlignmentPositionCommand {
  @scala.inline
  def apply(execute: FloatingObjectAlignmentPositionSettings => Boolean, getState: () => js.Any): ChangeFloatingObjectAlignmentPositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectAlignmentPositionCommand]
  }
}


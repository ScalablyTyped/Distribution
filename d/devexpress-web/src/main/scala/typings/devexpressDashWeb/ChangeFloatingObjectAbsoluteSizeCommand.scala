package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change a floating object's absolute size.
  */
trait ChangeFloatingObjectAbsoluteSizeCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectAbsoluteSizeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A FloatingObjectAbsoluteSizeSettings object specifying absolute size settings.
    */
  def execute(settings: FloatingObjectAbsoluteSizeSettings): Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectAbsoluteSizeCommand {
  @scala.inline
  def apply(execute: FloatingObjectAbsoluteSizeSettings => Boolean, getState: () => js.Any): ChangeFloatingObjectAbsoluteSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectAbsoluteSizeCommand]
  }
}


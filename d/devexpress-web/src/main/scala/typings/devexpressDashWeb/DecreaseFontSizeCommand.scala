package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to decrease the font size of characters in a selected range to the closest smaller predefined value.
  */
trait DecreaseFontSizeCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DecreaseFontSizeCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean
}

object DecreaseFontSizeCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DecreaseFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[DecreaseFontSizeCommand]
  }
}


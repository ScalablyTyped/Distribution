package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increase the font size of characters in a selected range to the closest larger predefined value.
  */
trait IncreaseFontSizeCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the IncreaseFontSizeCommand command.
    */
  def execute(): Boolean
}

object IncreaseFontSizeCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncreaseFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncreaseFontSizeCommand]
  }
}


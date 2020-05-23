package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove spacing before the selected paragraph.
  */
trait RemoveSpacingBeforeParagraphCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemoveSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean
}

object RemoveSpacingBeforeParagraphCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveSpacingBeforeParagraphCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to remove spacing after the selected paragraph.
  */
trait RemoveSpacingAfterParagraphCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the RemoveSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean
}

object RemoveSpacingAfterParagraphCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveSpacingAfterParagraphCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add spacing after a paragraph.
  */
trait AddSpacingAfterParagraphCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the AddSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean
}

object AddSpacingAfterParagraphCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): AddSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AddSpacingAfterParagraphCommand]
  }
}


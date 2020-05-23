package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to add spacing before a paragraph.
  */
trait AddSpacingBeforeParagraphCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the AddSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean
}

object AddSpacingBeforeParagraphCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): AddSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AddSpacingBeforeParagraphCommand]
  }
}


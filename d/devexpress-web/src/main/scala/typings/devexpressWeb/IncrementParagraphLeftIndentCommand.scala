package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increment the left indentation of paragraphs in a selected range.
  */
trait IncrementParagraphLeftIndentCommand extends CommandBase {
  /**
    * Executes the IncrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}

object IncrementParagraphLeftIndentCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncrementParagraphLeftIndentCommand]
  }
}


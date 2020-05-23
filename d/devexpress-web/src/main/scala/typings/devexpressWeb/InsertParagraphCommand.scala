package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a paragraph break at the current position in the document.
  */
trait InsertParagraphCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertParagraphCommand command.
    */
  def execute(): Boolean
}

object InsertParagraphCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertParagraphCommand]
  }
}


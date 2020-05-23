package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to paste the text from the clipboard over the selection.
  */
trait PasteCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the PasteCommand command.
    */
  def execute(): Boolean
}

object PasteCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): PasteCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[PasteCommand]
  }
}


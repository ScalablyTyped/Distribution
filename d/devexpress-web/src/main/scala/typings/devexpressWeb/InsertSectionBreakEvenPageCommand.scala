package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a section break and start a new section on the next even-numbered page.
  */
trait InsertSectionBreakEvenPageCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertSectionBreakEvenPageCommand command.
    */
  def execute(): Boolean
}

object InsertSectionBreakEvenPageCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakEvenPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakEvenPageCommand]
  }
}


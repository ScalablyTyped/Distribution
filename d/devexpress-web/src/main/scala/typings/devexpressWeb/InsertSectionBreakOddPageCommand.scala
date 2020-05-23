package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a section break and start a new section on the next odd-numbered page.
  */
trait InsertSectionBreakOddPageCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertSectionBreakOddPageCommand command.
    */
  def execute(): Boolean
}

object InsertSectionBreakOddPageCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakOddPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakOddPageCommand]
  }
}


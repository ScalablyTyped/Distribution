package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a section break and start a new section on the next page.
  */
trait InsertSectionBreakNextPageCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertSectionBreakNextPageCommand command.
    */
  def execute(): Boolean
}

object InsertSectionBreakNextPageCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakNextPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakNextPageCommand]
  }
}


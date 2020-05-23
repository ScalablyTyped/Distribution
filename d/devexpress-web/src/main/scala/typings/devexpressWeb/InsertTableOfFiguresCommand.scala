package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to create a table of figures.
  */
trait InsertTableOfFiguresCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableOfFiguresCommand command.
    */
  def execute(): Boolean
}

object InsertTableOfFiguresCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfFiguresCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfFiguresCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the last data record of the bound data source.
  */
trait GoToLastDataRecordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToLastDataRecordCommand command.
    */
  def execute(): Boolean
}

object GoToLastDataRecordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToLastDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToLastDataRecordCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the first data record of the bound data source.
  */
trait GoToFirstDataRecordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToFirstDataRecordCommand command.
    */
  def execute(): Boolean
}

object GoToFirstDataRecordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToFirstDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToFirstDataRecordCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next data record of the bound data source.
  */
trait GoToNextDataRecordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToNextDataRecordCommand command.
    */
  def execute(): Boolean
}

object GoToNextDataRecordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToNextDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToNextDataRecordCommand]
  }
}


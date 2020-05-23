package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the previous data record of the bound data source.
  */
trait GoToPreviousDataRecordCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToPreviousDataRecordCommand command.
    */
  def execute(): Boolean
}

object GoToPreviousDataRecordCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToPreviousDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToPreviousDataRecordCommand]
  }
}


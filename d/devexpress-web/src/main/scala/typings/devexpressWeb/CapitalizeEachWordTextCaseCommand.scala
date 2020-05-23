package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to capitalize each word in the selected sentence.
  */
trait CapitalizeEachWordTextCaseCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CapitalizeEachWordTextCaseCommand command.
    */
  def execute(): Boolean
}

object CapitalizeEachWordTextCaseCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CapitalizeEachWordTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CapitalizeEachWordTextCaseCommand]
  }
}


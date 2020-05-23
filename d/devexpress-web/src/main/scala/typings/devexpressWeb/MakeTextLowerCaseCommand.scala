package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to convert the selected text to lower case.
  */
trait MakeTextLowerCaseCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MakeTextLowerCaseCommand command.
    */
  def execute(): Boolean
}

object MakeTextLowerCaseCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextLowerCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextLowerCaseCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to convert the text of all selected sentences to sentence case.
  */
trait MakeTextSentenceCaseCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MakeTextSentenceCaseCommand command.
    */
  def execute(): Boolean
}

object MakeTextSentenceCaseCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextSentenceCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextSentenceCaseCommand]
  }
}


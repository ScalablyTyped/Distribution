package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a caption for a table.
  */
trait InsertTablesCaptionCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTablesCaptionCommand command.
    */
  def execute(): Boolean
}

object InsertTablesCaptionCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTablesCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTablesCaptionCommand]
  }
}


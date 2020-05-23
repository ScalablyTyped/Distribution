package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to update a table of contents.
  */
trait UpdateTableOfContentsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the UpdateTableOfContentsCommand command.
    */
  def execute(): Boolean
}

object UpdateTableOfContentsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): UpdateTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[UpdateTableOfContentsCommand]
  }
}


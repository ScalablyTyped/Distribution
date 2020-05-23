package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a table of contents.
  */
trait InsertTableOfContentsCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableOfContentsCommand command.
    */
  def execute(): Boolean
}

object InsertTableOfContentsCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableOfContentsCommand]
  }
}


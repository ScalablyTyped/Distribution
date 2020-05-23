package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete the selected hyperlink.
  */
trait DeleteHyperlinkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteHyperlinkCommand command.
    */
  def execute(): Boolean
}

object DeleteHyperlinkCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteHyperlinkCommand]
  }
}


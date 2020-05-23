package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the document bookmark or URI (uniform resource identifier) specified for the hyperlink.
  */
trait OpenHyperlinkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenHyperlinkCommand command.
    */
  def execute(): Boolean
}

object OpenHyperlinkCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenHyperlinkCommand]
  }
}


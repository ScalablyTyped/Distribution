package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Search Panel allowing end-users to search text and navigate through search results.
  */
trait OpenFindPanelCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenFindPanelCommand command.
    */
  def execute(): Boolean
}

object OpenFindPanelCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenFindPanelCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenFindPanelCommand]
  }
}


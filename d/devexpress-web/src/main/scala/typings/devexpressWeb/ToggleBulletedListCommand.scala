package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
trait ToggleBulletedListCommand extends CommandBase {
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  def execute(): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}

object ToggleBulletedListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleBulletedListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleBulletedListCommand]
  }
}


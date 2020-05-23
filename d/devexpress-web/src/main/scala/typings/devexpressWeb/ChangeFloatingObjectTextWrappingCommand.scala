package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's text wrapping settings.
  */
trait ChangeFloatingObjectTextWrappingCommand extends js.Object {
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  def execute(settings: FloatingObjectTextWrappingSettings): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FloatingObjectTextWrappingSettings]
}

object ChangeFloatingObjectTextWrappingCommand {
  @scala.inline
  def apply(
    execute: FloatingObjectTextWrappingSettings => Boolean,
    getState: () => CommandState[FloatingObjectTextWrappingSettings]
  ): ChangeFloatingObjectTextWrappingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectTextWrappingCommand]
  }
}


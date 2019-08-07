package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base class for commands that modify floating object settings.
  */
@JSGlobal("ChangeFloatingObjectPropertyCommandBase")
@js.native
class ChangeFloatingObjectPropertyCommandBase[T] () extends js.Object {
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  def execute(settings: T): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[T] = js.native
}


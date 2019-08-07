package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's background fill color.
  */
@JSGlobal("ChangeFloatingObjectFillColorCommand")
@js.native
class ChangeFloatingObjectFillColorCommand () extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectFillColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}


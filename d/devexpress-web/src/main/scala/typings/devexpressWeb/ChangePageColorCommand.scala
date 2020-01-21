package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the background color of the page.
  */
@JSGlobal("ChangePageColorCommand")
@js.native
class ChangePageColorCommand () extends CommandBase {
  /**
    * Executes the ChangePageColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying a background color of all pages contained in the document. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}


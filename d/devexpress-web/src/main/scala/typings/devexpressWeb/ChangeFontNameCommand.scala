package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font name of characters in a selected range.
  */
@JSGlobal("ChangeFontNameCommand")
@js.native
class ChangeFontNameCommand () extends CommandBase {
  /**
    * Lists names of fonts available in the control.
    */
  val fontNames: js.Array[String] = js.native
  /**
    * Executes the ChangeFontNameCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontName A string specifying the font name.
    */
  def execute(fontName: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the font name of characters in a selected range.
  */
trait ChangeFontNameCommand extends CommandBase {
  /**
    * Lists names of fonts available in the control.
    */
  val fontNames: js.Array[String]
  /**
    * Executes the ChangeFontNameCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontName A string specifying the font name.
    */
  def execute(fontName: String): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}

object ChangeFontNameCommand {
  @scala.inline
  def apply(execute: String => Boolean, fontNames: js.Array[String], getState: () => CommandState[String]): ChangeFontNameCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), fontNames = fontNames.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontNameCommand]
  }
}


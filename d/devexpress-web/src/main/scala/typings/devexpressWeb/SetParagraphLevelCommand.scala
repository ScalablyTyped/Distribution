package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply a paragraph level to the selected text
  */
@JSGlobal("SetParagraphLevelCommand")
@js.native
class SetParagraphLevelCommand () extends CommandBase {
  /**
    * Executes the SetParagraphLevelCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param level An integer value specifying the applied style. The value should be in the range from 0 to 9.
    */
  def execute(level: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double] = js.native
}


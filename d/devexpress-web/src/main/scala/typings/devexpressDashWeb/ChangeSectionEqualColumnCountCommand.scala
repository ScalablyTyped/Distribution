package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the number of section columns having the same width.
  */
@JSGlobal("ChangeSectionEqualColumnCountCommand")
@js.native
class ChangeSectionEqualColumnCountCommand () extends CommandBase {
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double] = js.native
}


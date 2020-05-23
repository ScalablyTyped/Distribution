package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle right borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellRightBorderCommand")
@js.native
class ToggleTableCellRightBorderCommand ()
  extends typings.devexpressWeb.ToggleTableCellRightBorderCommand {
  /**
    * Executes the ToggleTableCellRightBorderCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}


package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle inner vertical borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellInsideVerticalBordersCommand")
@js.native
class ToggleTableCellInsideVerticalBordersCommand ()
  extends typings.devexpressWeb.ToggleTableCellInsideVerticalBordersCommand {
  /**
    * Executes the ToggleTableCellInsideVerticalBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}


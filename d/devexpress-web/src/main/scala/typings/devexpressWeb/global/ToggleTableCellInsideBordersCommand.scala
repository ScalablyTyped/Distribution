package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle inner borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellInsideBordersCommand")
@js.native
class ToggleTableCellInsideBordersCommand ()
  extends typings.devexpressWeb.ToggleTableCellInsideBordersCommand {
  /**
    * Executes the ToggleTableCellInsideBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}


package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle top borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellTopBorderCommand")
@js.native
class ToggleTableCellTopBorderCommand ()
  extends typings.devexpressWeb.ToggleTableCellTopBorderCommand {
  /**
    * Executes the ToggleTableCellTopBorderCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}


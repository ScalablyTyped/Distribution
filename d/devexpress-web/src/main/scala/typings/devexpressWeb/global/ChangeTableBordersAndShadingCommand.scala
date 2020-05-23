package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change borders and shading of the selected table elements.
  */
@JSGlobal("ChangeTableBordersAndShadingCommand")
@js.native
class ChangeTableBordersAndShadingCommand ()
  extends typings.devexpressWeb.ChangeTableBordersAndShadingCommand {
  /**
    * Executes the ChangeTableBordersAndShadingCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object with settings specifying table borders.
    * @param applyToWholeTable true to apply the border settings to the whole table, false to apply the border settings to the selected cells.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.TableBordersSettings, applyToWholeTable: Boolean): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TableBordersSettings] = js.native
}


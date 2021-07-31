package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the preferred cell width of the selected table rows.
  */
@JSGlobal("ChangeTableCellPreferredWidthCommand")
@js.native
class ChangeTableCellPreferredWidthCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTableCellPreferredWidthCommand {
  
  /**
    * Executes the ChangeTableCellPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table rows.
    */
  /* CompleteClass */
  override def execute(preferredWidth: typings.devexpressWeb.TableWidthUnit): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TableWidthUnit] = js.native
}

package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's style options.
  */
@JSGlobal("ChangeTableLookCommand")
@js.native
class ChangeTableLookCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTableLookCommand {
  
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.TableLookSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TableLookSettings] = js.native
}

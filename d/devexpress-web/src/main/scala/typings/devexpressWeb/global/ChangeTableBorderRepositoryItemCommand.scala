package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the repository item's table border style.
  */
@JSGlobal("ChangeTableBorderRepositoryItemCommand")
@js.native
open class ChangeTableBorderRepositoryItemCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTableBorderRepositoryItemCommand {
  
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.TableBorderSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TableBorderSettings] = js.native
}

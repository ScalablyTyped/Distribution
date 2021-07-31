package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' content margins.
  */
@JSGlobal("ChangeTextBoxContentMarginsCommand")
@js.native
class ChangeTextBoxContentMarginsCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTextBoxContentMarginsCommand {
  
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.Margins): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.Margins] = js.native
}

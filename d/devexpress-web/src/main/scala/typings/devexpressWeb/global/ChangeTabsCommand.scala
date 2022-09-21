package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change paragraph tab stops.
  */
@JSGlobal("ChangeTabsCommand")
@js.native
open class ChangeTabsCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTabsCommand {
  
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  /* CompleteClass */
  override def execute(settings: typings.devexpressWeb.TabsSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[typings.devexpressWeb.TabsSettings] = js.native
}

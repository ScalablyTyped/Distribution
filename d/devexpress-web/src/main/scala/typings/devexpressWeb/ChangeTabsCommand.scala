package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change paragraph tab stops.
  */
trait ChangeTabsCommand extends StObject {
  
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TabsSettings]
}
object ChangeTabsCommand {
  
  inline def apply(execute: TabsSettings => Boolean, getState: () => CommandState[TabsSettings]): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTabsCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeTabsCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: TabsSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[TabsSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

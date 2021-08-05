package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a hyperlink at the current position in the document.
  */
trait InsertHyperlinkCommand extends StObject {
  
  /**
    * Executes the InsertHyperlinkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  def execute(settings: HyperlinkSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[HyperlinkSettings]
}
object InsertHyperlinkCommand {
  
  inline def apply(execute: HyperlinkSettings => Boolean, getState: () => CommandState[HyperlinkSettings]): InsertHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHyperlinkCommand]
  }
  
  extension [Self <: InsertHyperlinkCommand](x: Self) {
    
    inline def setExecute(value: HyperlinkSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[HyperlinkSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

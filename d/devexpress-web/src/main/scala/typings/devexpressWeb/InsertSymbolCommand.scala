package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a character into the document.
  */
trait InsertSymbolCommand extends StObject {
  
  /**
    * Executes the InsertSymbolCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param symbol A string value specifying symbols to insert.
    * @param fontName A string value specifying the font of symbols to insert.
    */
  def execute(symbol: String, fontName: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object InsertSymbolCommand {
  
  inline def apply(execute: (String, String) => Boolean, getState: () => SimpleCommandState): InsertSymbolCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSymbolCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertSymbolCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: (String, String) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
    
    inline def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

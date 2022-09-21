package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font name of characters in a selected range.
  */
trait ChangeFontNameCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFontNameCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontName A string specifying the font name.
    */
  def execute(fontName: String): Boolean
  
  /**
    * Lists names of fonts available in the control.
    */
  val fontNames: js.Array[String]
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}
object ChangeFontNameCommand {
  
  inline def apply(execute: String => Boolean, fontNames: js.Array[String], getState: () => CommandState[String]): ChangeFontNameCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), fontNames = fontNames.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontNameCommand]
  }
  
  extension [Self <: ChangeFontNameCommand](x: Self) {
    
    inline def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setFontNames(value: js.Array[String]): Self = StObject.set(x, "fontNames", value.asInstanceOf[js.Any])
    
    inline def setFontNamesVarargs(value: String*): Self = StObject.set(x, "fontNames", js.Array(value*))
    
    inline def setGetState(value: () => CommandState[String]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font color of characters in a selected range.
  */
trait ChangeFontForeColorCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFontForeColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the font color. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}
object ChangeFontForeColorCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFontForeColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontForeColorCommand]
  }
  
  @scala.inline
  implicit class ChangeFontForeColorCommandMutableBuilder[Self <: ChangeFontForeColorCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[String]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

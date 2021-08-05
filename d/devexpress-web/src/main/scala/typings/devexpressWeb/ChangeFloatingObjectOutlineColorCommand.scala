package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's outline color.
  */
trait ChangeFloatingObjectOutlineColorCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFloatingObjectOutlineColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}
object ChangeFloatingObjectOutlineColorCommand {
  
  inline def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFloatingObjectOutlineColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectOutlineColorCommand]
  }
  
  extension [Self <: ChangeFloatingObjectOutlineColorCommand](x: Self) {
    
    inline def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[String]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's outline width.
  */
trait ChangeFloatingObjectOutlineWidthCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFloatingObjectOutlineWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param width An integer value specifying the outline width.
    */
  def execute(width: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}
object ChangeFloatingObjectOutlineWidthCommand {
  
  inline def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeFloatingObjectOutlineWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectOutlineWidthCommand]
  }
  
  extension [Self <: ChangeFloatingObjectOutlineWidthCommand](x: Self) {
    
    inline def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[Double]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the page orientation.
  */
trait ChangePageOrientationCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangePageOrientationCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param orientation The page orientation.
    */
  def execute(orientation: Orientation): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Orientation]
}
object ChangePageOrientationCommand {
  
  @scala.inline
  def apply(execute: Orientation => Boolean, getState: () => CommandState[Orientation]): ChangePageOrientationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangePageOrientationCommand]
  }
  
  @scala.inline
  implicit class ChangePageOrientationCommandMutableBuilder[Self <: ChangePageOrientationCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Orientation => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Orientation]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

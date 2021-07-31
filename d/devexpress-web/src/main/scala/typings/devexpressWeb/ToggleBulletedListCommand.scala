package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
trait ToggleBulletedListCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  def execute(): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object ToggleBulletedListCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleBulletedListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleBulletedListCommand]
  }
  
  @scala.inline
  implicit class ToggleBulletedListCommandMutableBuilder[Self <: ToggleBulletedListCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Boolean]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

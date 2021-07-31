package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class for commands that modify floating object settings.
  */
trait ChangeFloatingObjectPropertyCommandBase[T] extends StObject {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  def execute(settings: T): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[T]
}
object ChangeFloatingObjectPropertyCommandBase {
  
  @scala.inline
  def apply[T](execute: T => Boolean, getState: () => CommandState[T]): ChangeFloatingObjectPropertyCommandBase[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectPropertyCommandBase[T]]
  }
  
  @scala.inline
  implicit class ChangeFloatingObjectPropertyCommandBaseMutableBuilder[Self <: ChangeFloatingObjectPropertyCommandBase[?], T] (val x: Self & ChangeFloatingObjectPropertyCommandBase[T]) extends AnyVal {
    
    @scala.inline
    def setExecute(value: T => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[T]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

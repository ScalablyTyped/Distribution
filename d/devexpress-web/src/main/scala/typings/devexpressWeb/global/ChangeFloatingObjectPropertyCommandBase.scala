package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class for commands that modify floating object settings.
  */
@JSGlobal("ChangeFloatingObjectPropertyCommandBase")
@js.native
open class ChangeFloatingObjectPropertyCommandBase[T] ()
  extends StObject
     with typings.devexpressWeb.ChangeFloatingObjectPropertyCommandBase[T] {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  /* CompleteClass */
  override def execute(settings: T): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[T] = js.native
}

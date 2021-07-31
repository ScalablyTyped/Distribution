package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to navigate to the specified bookmark in the document.
  */
trait GoToBookmarkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying the bookmark's name
    */
  def execute(name: String): Boolean
}
object GoToBookmarkCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): GoToBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToBookmarkCommand]
  }
  
  @scala.inline
  implicit class GoToBookmarkCommandMutableBuilder[Self <: GoToBookmarkCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}

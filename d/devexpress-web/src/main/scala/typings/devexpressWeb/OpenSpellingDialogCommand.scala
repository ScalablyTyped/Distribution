package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Spelling dialog window.
  */
@js.native
trait OpenSpellingDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenSpellingDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenSpellingDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenSpellingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenSpellingDialogCommand]
  }
  
  @scala.inline
  implicit class OpenSpellingDialogCommandMutableBuilder[Self <: OpenSpellingDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add spacing before a paragraph.
  */
trait AddSpacingBeforeParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the AddSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean
}
object AddSpacingBeforeParagraphCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): AddSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AddSpacingBeforeParagraphCommand]
  }
  
  @scala.inline
  implicit class AddSpacingBeforeParagraphCommandMutableBuilder[Self <: AddSpacingBeforeParagraphCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add spacing after a paragraph.
  */
@js.native
trait AddSpacingAfterParagraphCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the AddSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean = js.native
}
object AddSpacingAfterParagraphCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): AddSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AddSpacingAfterParagraphCommand]
  }
  
  @scala.inline
  implicit class AddSpacingAfterParagraphCommandMutableBuilder[Self <: AddSpacingAfterParagraphCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

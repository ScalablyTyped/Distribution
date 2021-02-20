package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove spacing before the selected paragraph.
  */
@js.native
trait RemoveSpacingBeforeParagraphCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean = js.native
}
object RemoveSpacingBeforeParagraphCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveSpacingBeforeParagraphCommand]
  }
  
  @scala.inline
  implicit class RemoveSpacingBeforeParagraphCommandMutableBuilder[Self <: RemoveSpacingBeforeParagraphCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

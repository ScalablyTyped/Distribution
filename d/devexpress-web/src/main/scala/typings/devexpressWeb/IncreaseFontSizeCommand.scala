package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increase the font size of characters in a selected range to the closest larger predefined value.
  */
trait IncreaseFontSizeCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the IncreaseFontSizeCommand command.
    */
  def execute(): Boolean
}
object IncreaseFontSizeCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncreaseFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncreaseFontSizeCommand]
  }
  
  @scala.inline
  implicit class IncreaseFontSizeCommandMutableBuilder[Self <: IncreaseFontSizeCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

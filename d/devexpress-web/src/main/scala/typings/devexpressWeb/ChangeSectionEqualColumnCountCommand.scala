package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the number of section columns having the same width.
  */
trait ChangeSectionEqualColumnCountCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}
object ChangeSectionEqualColumnCountCommand {
  
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeSectionEqualColumnCountCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeSectionEqualColumnCountCommand]
  }
  
  @scala.inline
  implicit class ChangeSectionEqualColumnCountCommandMutableBuilder[Self <: ChangeSectionEqualColumnCountCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Double]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

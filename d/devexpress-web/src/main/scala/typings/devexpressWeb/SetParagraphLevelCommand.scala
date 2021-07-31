package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply a paragraph level to the selected text
  */
trait SetParagraphLevelCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the SetParagraphLevelCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param level An integer value specifying the applied style. The value should be in the range from 0 to 9.
    */
  def execute(level: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}
object SetParagraphLevelCommand {
  
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): SetParagraphLevelCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetParagraphLevelCommand]
  }
  
  @scala.inline
  implicit class SetParagraphLevelCommandMutableBuilder[Self <: SetParagraphLevelCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Double]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

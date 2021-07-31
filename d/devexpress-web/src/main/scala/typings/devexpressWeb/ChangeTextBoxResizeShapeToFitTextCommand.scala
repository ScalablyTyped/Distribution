package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to resize the shape to fit the text in the text box.
  */
trait ChangeTextBoxResizeShapeToFitTextCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  def execute(resizeShapeToFitText: Boolean): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object ChangeTextBoxResizeShapeToFitTextCommand {
  
  @scala.inline
  def apply(execute: Boolean => Boolean, getState: () => CommandState[Boolean]): ChangeTextBoxResizeShapeToFitTextCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxResizeShapeToFitTextCommand]
  }
  
  @scala.inline
  implicit class ChangeTextBoxResizeShapeToFitTextCommandMutableBuilder[Self <: ChangeTextBoxResizeShapeToFitTextCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Boolean => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Boolean]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

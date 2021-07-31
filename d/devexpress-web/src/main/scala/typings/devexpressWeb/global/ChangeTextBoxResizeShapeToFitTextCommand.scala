package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to resize the shape to fit the text in the text box.
  */
@JSGlobal("ChangeTextBoxResizeShapeToFitTextCommand")
@js.native
class ChangeTextBoxResizeShapeToFitTextCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeTextBoxResizeShapeToFitTextCommand {
  
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  /* CompleteClass */
  override def execute(resizeShapeToFitText: Boolean): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font size of characters in a selected range.
  */
@JSGlobal("ChangeFontSizeCommand")
@js.native
class ChangeFontSizeCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeFontSizeCommand {
  
  /**
    * Executes the ChangeFontSizeCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSize An integer number specifying the font size in points.
    */
  /* CompleteClass */
  override def execute(fontSize: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Double] = js.native
}

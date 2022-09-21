package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to decrease the font size of characters in a selected range to the closest smaller predefined value.
  */
@JSGlobal("DecreaseFontSizeCommand")
@js.native
open class DecreaseFontSizeCommand ()
  extends StObject
     with typings.devexpressWeb.DecreaseFontSizeCommand {
  
  /**
    * Executes the DecreaseFontSizeCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}

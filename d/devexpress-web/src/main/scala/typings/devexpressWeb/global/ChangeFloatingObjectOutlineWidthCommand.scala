package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's outline width.
  */
@JSGlobal("ChangeFloatingObjectOutlineWidthCommand")
@js.native
open class ChangeFloatingObjectOutlineWidthCommand ()
  extends StObject
     with typings.devexpressWeb.ChangeFloatingObjectOutlineWidthCommand {
  
  /**
    * Executes the ChangeFloatingObjectOutlineWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param width An integer value specifying the outline width.
    */
  /* CompleteClass */
  override def execute(width: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Double] = js.native
}

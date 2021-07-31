package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's style.
  */
@js.native
trait ChangeTableStyleCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableStyleCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param style A TableStyle object specifying the style applying to the table.
    */
  def execute(style: String): Boolean = js.native
  def execute(style: TableStyle): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableStyle] = js.native
}

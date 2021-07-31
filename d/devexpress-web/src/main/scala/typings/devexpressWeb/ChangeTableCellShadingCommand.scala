package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change cell shading in the selected table elements.
  */
trait ChangeTableCellShadingCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableCellShadingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying the color of the selected cells' shading. May be specified as a color name or a hex color value.
    */
  def execute(color: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String]
}
object ChangeTableCellShadingCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeTableCellShadingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableCellShadingCommand]
  }
  
  @scala.inline
  implicit class ChangeTableCellShadingCommandMutableBuilder[Self <: ChangeTableCellShadingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[String]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Borders and Shading table dialog.
  */
trait OpenTableBordersAndShadingDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenTableBordersAndShadingDialogCommand command.
    */
  def execute(): Boolean
}
object OpenTableBordersAndShadingDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTableBordersAndShadingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTableBordersAndShadingDialogCommand]
  }
  
  @scala.inline
  implicit class OpenTableBordersAndShadingDialogCommandMutableBuilder[Self <: OpenTableBordersAndShadingDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

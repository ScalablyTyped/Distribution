package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the next data record of the bound data source.
  */
trait GoToNextDataRecordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToNextDataRecordCommand command.
    */
  def execute(): Boolean
}
object GoToNextDataRecordCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToNextDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToNextDataRecordCommand]
  }
  
  extension [Self <: GoToNextDataRecordCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

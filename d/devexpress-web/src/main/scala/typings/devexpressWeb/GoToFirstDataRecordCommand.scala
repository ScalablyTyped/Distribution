package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the first data record of the bound data source.
  */
trait GoToFirstDataRecordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToFirstDataRecordCommand command.
    */
  def execute(): Boolean
}
object GoToFirstDataRecordCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToFirstDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToFirstDataRecordCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoToFirstDataRecordCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

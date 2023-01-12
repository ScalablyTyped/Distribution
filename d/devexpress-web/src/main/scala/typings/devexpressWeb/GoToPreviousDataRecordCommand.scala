package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the previous data record of the bound data source.
  */
trait GoToPreviousDataRecordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToPreviousDataRecordCommand command.
    */
  def execute(): Boolean
}
object GoToPreviousDataRecordCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToPreviousDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToPreviousDataRecordCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoToPreviousDataRecordCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

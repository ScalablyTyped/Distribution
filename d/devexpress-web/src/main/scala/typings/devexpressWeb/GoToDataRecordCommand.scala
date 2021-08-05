package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the next data record of the bound data source.
  */
trait GoToDataRecordCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the GoToDataRecordCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param activeRecordIndex An integer value specifying index of the next data record.
    */
  def execute(activeRecordIndex: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[DataRecordOptions]
}
object GoToDataRecordCommand {
  
  inline def apply(execute: Double => Boolean, getState: () => CommandState[DataRecordOptions]): GoToDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToDataRecordCommand]
  }
  
  extension [Self <: GoToDataRecordCommand](x: Self) {
    
    inline def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => CommandState[DataRecordOptions]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}

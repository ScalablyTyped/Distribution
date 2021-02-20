package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the last data record of the bound data source.
  */
@js.native
trait GoToLastDataRecordCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToLastDataRecordCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToLastDataRecordCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToLastDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToLastDataRecordCommand]
  }
  
  @scala.inline
  implicit class GoToLastDataRecordCommandMutableBuilder[Self <: GoToLastDataRecordCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

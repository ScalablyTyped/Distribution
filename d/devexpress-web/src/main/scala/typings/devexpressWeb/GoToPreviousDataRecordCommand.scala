package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the previous data record of the bound data source.
  */
@js.native
trait GoToPreviousDataRecordCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToPreviousDataRecordCommand command.
    */
  def execute(): Boolean = js.native
}
object GoToPreviousDataRecordCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): GoToPreviousDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToPreviousDataRecordCommand]
  }
  
  @scala.inline
  implicit class GoToPreviousDataRecordCommandMutableBuilder[Self <: GoToPreviousDataRecordCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

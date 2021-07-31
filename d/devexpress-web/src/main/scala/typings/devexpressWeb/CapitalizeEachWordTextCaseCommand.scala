package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to capitalize each word in the selected sentence.
  */
trait CapitalizeEachWordTextCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CapitalizeEachWordTextCaseCommand command.
    */
  def execute(): Boolean
}
object CapitalizeEachWordTextCaseCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CapitalizeEachWordTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CapitalizeEachWordTextCaseCommand]
  }
  
  @scala.inline
  implicit class CapitalizeEachWordTextCaseCommandMutableBuilder[Self <: CapitalizeEachWordTextCaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to assign a shortcut to the specified client command.
  */
@js.native
trait AssignShortcutCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the AssignShortcutCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param keyCode A specifically generated code that uniquely identifies the combination of keys specified for a shortcut. This code is specified using the ASPxClientUtils.GetShortcutCode method.
    * @param callback A callback function to execute when a shortcut is activated.
    */
  def execute(keyCode: Double, callback: js.Function0[Unit]): Boolean = js.native
}
object AssignShortcutCommand {
  
  @scala.inline
  def apply(execute: (Double, js.Function0[Unit]) => Boolean, getState: () => SimpleCommandState): AssignShortcutCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[AssignShortcutCommand]
  }
  
  @scala.inline
  implicit class AssignShortcutCommandMutableBuilder[Self <: AssignShortcutCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (Double, js.Function0[Unit]) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
  }
}

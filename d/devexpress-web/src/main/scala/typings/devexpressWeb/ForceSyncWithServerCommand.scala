package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
@js.native
trait ForceSyncWithServerCommand extends CommandBase {
  
  /**
    * Executes the ForceSyncWithServerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when the server model is updated.
    */
  def execute(callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
object ForceSyncWithServerCommand {
  
  @scala.inline
  def apply(execute: js.Function0[Unit] => Boolean, getState: () => SimpleCommandState): ForceSyncWithServerCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ForceSyncWithServerCommand]
  }
  
  @scala.inline
  implicit class ForceSyncWithServerCommandOps[Self <: ForceSyncWithServerCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecute(value: js.Function0[Unit] => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

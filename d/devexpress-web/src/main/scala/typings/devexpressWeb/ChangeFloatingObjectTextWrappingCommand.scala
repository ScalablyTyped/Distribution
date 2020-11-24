package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's text wrapping settings.
  */
@js.native
trait ChangeFloatingObjectTextWrappingCommand extends js.Object {
  
  /**
    * Executes the ChangeFloatingObjectTextWrappingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A FloatingObjectTextWrappingSettings object specifying text wrapping settings.
    */
  def execute(settings: FloatingObjectTextWrappingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FloatingObjectTextWrappingSettings] = js.native
}
object ChangeFloatingObjectTextWrappingCommand {
  
  @scala.inline
  def apply(
    execute: FloatingObjectTextWrappingSettings => Boolean,
    getState: () => CommandState[FloatingObjectTextWrappingSettings]
  ): ChangeFloatingObjectTextWrappingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectTextWrappingCommand]
  }
  
  @scala.inline
  implicit class ChangeFloatingObjectTextWrappingCommandOps[Self <: ChangeFloatingObjectTextWrappingCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: FloatingObjectTextWrappingSettings => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[FloatingObjectTextWrappingSettings]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

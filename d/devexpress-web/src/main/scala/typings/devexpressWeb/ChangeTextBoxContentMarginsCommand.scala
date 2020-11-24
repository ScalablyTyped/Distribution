package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' content margins.
  */
@js.native
trait ChangeTextBoxContentMarginsCommand extends CommandBase {
  
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins] = js.native
}
object ChangeTextBoxContentMarginsCommand {
  
  @scala.inline
  def apply(execute: Margins => Boolean, getState: () => CommandState[Margins]): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
  
  @scala.inline
  implicit class ChangeTextBoxContentMarginsCommandOps[Self <: ChangeTextBoxContentMarginsCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: Margins => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Margins]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

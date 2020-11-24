package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the number of section columns having the same width.
  */
@js.native
trait ChangeSectionEqualColumnCountCommand extends CommandBase {
  
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double] = js.native
}
object ChangeSectionEqualColumnCountCommand {
  
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeSectionEqualColumnCountCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeSectionEqualColumnCountCommand]
  }
  
  @scala.inline
  implicit class ChangeSectionEqualColumnCountCommandOps[Self <: ChangeSectionEqualColumnCountCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: Double => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[Double]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

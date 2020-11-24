package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the settings of individual section columns.
  */
@js.native
trait ChangeSectionColumnsCommand extends js.Object {
  
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  def execute(columns: js.Array[SectionColumn]): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[js.Array[SectionColumn]] = js.native
}
object ChangeSectionColumnsCommand {
  
  @scala.inline
  def apply(execute: js.Array[SectionColumn] => Boolean, getState: () => CommandState[js.Array[SectionColumn]]): ChangeSectionColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeSectionColumnsCommand]
  }
  
  @scala.inline
  implicit class ChangeSectionColumnsCommandOps[Self <: ChangeSectionColumnsCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: js.Array[SectionColumn] => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[js.Array[SectionColumn]]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

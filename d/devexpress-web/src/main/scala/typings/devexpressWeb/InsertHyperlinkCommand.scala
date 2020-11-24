package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a hyperlink at the current position in the document.
  */
@js.native
trait InsertHyperlinkCommand extends js.Object {
  
  /**
    * Executes the InsertHyperlinkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  def execute(settings: HyperlinkSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[HyperlinkSettings] = js.native
}
object InsertHyperlinkCommand {
  
  @scala.inline
  def apply(execute: HyperlinkSettings => Boolean, getState: () => CommandState[HyperlinkSettings]): InsertHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHyperlinkCommand]
  }
  
  @scala.inline
  implicit class InsertHyperlinkCommandOps[Self <: InsertHyperlinkCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: HyperlinkSettings => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[HyperlinkSettings]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

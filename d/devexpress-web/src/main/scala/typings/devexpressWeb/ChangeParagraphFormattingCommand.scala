package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the formatting of paragraphs in a selected range.
  */
@js.native
trait ChangeParagraphFormattingCommand extends CommandBase {
  
  /**
    * Executes the ChangeParagraphFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A ParagraphFormattingSettings object specifying paragraph formatting settings.
    */
  def execute(settings: ParagraphFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[ParagraphFormattingSettings] = js.native
}
object ChangeParagraphFormattingCommand {
  
  @scala.inline
  def apply(
    execute: ParagraphFormattingSettings => Boolean,
    getState: () => CommandState[ParagraphFormattingSettings]
  ): ChangeParagraphFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeParagraphFormattingCommand]
  }
  
  @scala.inline
  implicit class ChangeParagraphFormattingCommandOps[Self <: ChangeParagraphFormattingCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: ParagraphFormattingSettings => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[ParagraphFormattingSettings]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font name of characters in a selected range.
  */
@js.native
trait ChangeFontNameCommand extends CommandBase {
  
  /**
    * Executes the ChangeFontNameCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontName A string specifying the font name.
    */
  def execute(fontName: String): Boolean = js.native
  
  /**
    * Lists names of fonts available in the control.
    */
  val fontNames: js.Array[String] = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}
object ChangeFontNameCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, fontNames: js.Array[String], getState: () => CommandState[String]): ChangeFontNameCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), fontNames = fontNames.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFontNameCommand]
  }
  
  @scala.inline
  implicit class ChangeFontNameCommandOps[Self <: ChangeFontNameCommand] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: String => Boolean): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFontNamesVarargs(value: String*): Self = this.set("fontNames", js.Array(value :_*))
    
    @scala.inline
    def setFontNames(value: js.Array[String]): Self = this.set("fontNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: () => CommandState[String]): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}

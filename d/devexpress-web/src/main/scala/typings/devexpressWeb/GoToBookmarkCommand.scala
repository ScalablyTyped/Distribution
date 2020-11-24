package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to navigate to the specified bookmark in the document.
  */
@js.native
trait GoToBookmarkCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying the bookmark's name
    */
  def execute(name: String): Boolean = js.native
}
object GoToBookmarkCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): GoToBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[GoToBookmarkCommand]
  }
  
  @scala.inline
  implicit class GoToBookmarkCommandOps[Self <: GoToBookmarkCommand] (val x: Self) extends AnyVal {
    
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
  }
}

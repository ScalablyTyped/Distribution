package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to open the file, specifying its path.
  */
@js.native
trait FileOpenCommand extends js.Object {
  /**
    * Executes the FileOpenCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param path A string value specifying path to the opening file.
    */
  def execute(path: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

object FileOpenCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): FileOpenCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileOpenCommand]
  }
  @scala.inline
  implicit class FileOpenCommandOps[Self <: FileOpenCommand] (val x: Self) extends AnyVal {
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
    def setGetState(value: () => SimpleCommandState): Self = this.set("getState", js.Any.fromFunction0(value))
  }
  
}


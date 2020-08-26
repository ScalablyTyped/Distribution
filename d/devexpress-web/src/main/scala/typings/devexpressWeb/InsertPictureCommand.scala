package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a picture from a file.
  */
@js.native
trait InsertPictureCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertPictureCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param imageUrl A string value specifying picture's Url.
    */
  def execute(imageUrl: String): Boolean = js.native
}

object InsertPictureCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): InsertPictureCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPictureCommand]
  }
  @scala.inline
  implicit class InsertPictureCommandOps[Self <: InsertPictureCommand] (val x: Self) extends AnyVal {
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


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a picture from a file.
  */
trait InsertPictureCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertPictureCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param imageUrl A string value specifying picture's Url.
    */
  def execute(imageUrl: String): Boolean
}

object InsertPictureCommand {
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): InsertPictureCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPictureCommand]
  }
}


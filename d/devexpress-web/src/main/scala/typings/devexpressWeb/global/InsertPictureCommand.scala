package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a picture from a file.
  */
@JSGlobal("InsertPictureCommand")
@js.native
class InsertPictureCommand ()
  extends typings.devexpressWeb.InsertPictureCommand {
  /**
    * Executes the InsertPictureCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param imageUrl A string value specifying picture's Url.
    */
  /* CompleteClass */
  override def execute(imageUrl: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}


package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's outline color.
  */
@JSGlobal("ChangeFloatingObjectOutlineColorCommand")
@js.native
class ChangeFloatingObjectOutlineColorCommand ()
  extends typings.devexpressWeb.ChangeFloatingObjectOutlineColorCommand {
  /**
    * Executes the ChangeFloatingObjectOutlineColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  /* CompleteClass */
  override def execute(color: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[String] = js.native
}


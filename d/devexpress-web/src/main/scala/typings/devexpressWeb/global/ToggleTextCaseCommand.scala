package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the case for each character - upper case becomes lower, lower case becomes upper.
  */
@JSGlobal("ToggleTextCaseCommand")
@js.native
class ToggleTextCaseCommand ()
  extends typings.devexpressWeb.ToggleTextCaseCommand {
  /**
    * Executes the ToggleTextCaseCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}


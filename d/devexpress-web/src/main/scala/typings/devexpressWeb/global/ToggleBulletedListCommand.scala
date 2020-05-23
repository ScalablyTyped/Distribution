package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
@JSGlobal("ToggleBulletedListCommand")
@js.native
class ToggleBulletedListCommand ()
  extends typings.devexpressWeb.ToggleBulletedListCommand {
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}


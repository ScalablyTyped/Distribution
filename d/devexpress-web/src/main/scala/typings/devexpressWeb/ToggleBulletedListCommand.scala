package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
@JSGlobal("ToggleBulletedListCommand")
@js.native
class ToggleBulletedListCommand () extends CommandBase {
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean] = js.native
}


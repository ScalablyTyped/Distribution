package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the fullscreen mode.
  */
@JSGlobal("SetFullscreenCommand")
@js.native
class SetFullscreenCommand () extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangePageMarginsCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param show true, to enable fullscreen mode; otherwise, false.
    */
  def execute(): Boolean = js.native
  def execute(show: Boolean): Boolean = js.native
}


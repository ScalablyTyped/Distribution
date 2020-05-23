package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the horizontal ruler's visibility.
  */
@js.native
trait ShowHorizontalRulerCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowHorizontalRulerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param show true, to show the horizontal ruler; otherwise, false.
    */
  def execute(): Boolean = js.native
  def execute(show: Boolean): Boolean = js.native
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to update the field's result.
  */
@js.native
trait UpdateFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the UpdateFieldCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when updating of all fields in the selection is completed.
    */
  def execute(): Boolean = js.native
  def execute(callback: js.Function0[Unit]): Boolean = js.native
}


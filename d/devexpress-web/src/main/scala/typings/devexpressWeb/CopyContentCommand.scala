package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to copy the selected text and place it to the specified position.
  */
@JSGlobal("CopyContentCommand")
@js.native
class CopyContentCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the CopyContentCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param position An integer value specifying a position of the inserted text.
    */
  def execute(position: Double): Boolean = js.native
}


package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to move the selected range to a specific position in the document.
  */
@JSGlobal("MoveContentCommand")
@js.native
class MoveContentCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the MoveContentCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param position An integer value specifying position to insert selected text.
    */
  def execute(position: Double): Boolean = js.native
}


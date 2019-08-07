package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to reverse actions of the previous undo command.
  */
@JSGlobal("RedoCommand")
@js.native
class RedoCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the RedoCommand command.
    */
  def execute(): Boolean = js.native
}


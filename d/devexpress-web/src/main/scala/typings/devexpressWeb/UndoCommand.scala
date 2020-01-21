package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to cancel changes caused by the previous command.
  */
@JSGlobal("UndoCommand")
@js.native
class UndoCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the UndoCommand command.
    */
  def execute(): Boolean = js.native
}


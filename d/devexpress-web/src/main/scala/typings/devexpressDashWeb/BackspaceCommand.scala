package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to move the cursor backwards and erase the character in that space.
  */
@JSGlobal("BackspaceCommand")
@js.native
class BackspaceCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the BackspaceCommand command.
    */
  def execute(): Boolean = js.native
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to copy the selected text and place it to the clipboard.
  */
@JSGlobal("CopyCommand")
@js.native
class CopyCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the CopyCommand command.
    */
  def execute(): Boolean = js.native
}


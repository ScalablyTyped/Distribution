package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to cut the selected text and place it to the clipboard.
  */
@JSGlobal("CutCommand")
@js.native
class CutCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the CutCommand command.
    */
  def execute(): Boolean = js.native
}


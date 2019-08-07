package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to paste the text from the clipboard over the selection.
  */
@JSGlobal("PasteCommand")
@js.native
class PasteCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the PasteCommand command.
    */
  def execute(): Boolean = js.native
}


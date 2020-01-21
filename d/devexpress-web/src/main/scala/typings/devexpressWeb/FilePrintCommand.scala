package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke a browser-specific Print dialog allowing one to print the current document.
  */
@JSGlobal("FilePrintCommand")
@js.native
class FilePrintCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the FilePrintCommand command.
    */
  def execute(): Boolean = js.native
}


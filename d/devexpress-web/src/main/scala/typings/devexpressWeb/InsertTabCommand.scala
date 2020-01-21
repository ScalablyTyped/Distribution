package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a tab character at the current position in the document.
  */
@JSGlobal("InsertTabCommand")
@js.native
class InsertTabCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTabCommand command.
    */
  def execute(): Boolean = js.native
}


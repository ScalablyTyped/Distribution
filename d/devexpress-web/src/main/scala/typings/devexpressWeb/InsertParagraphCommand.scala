package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a paragraph break at the current position in the document.
  */
@JSGlobal("InsertParagraphCommand")
@js.native
class InsertParagraphCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertParagraphCommand command.
    */
  def execute(): Boolean = js.native
}


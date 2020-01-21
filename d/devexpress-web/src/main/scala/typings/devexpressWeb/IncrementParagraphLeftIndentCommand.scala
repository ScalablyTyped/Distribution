package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increment the left indentation of paragraphs in a selected range.
  */
@JSGlobal("IncrementParagraphLeftIndentCommand")
@js.native
class IncrementParagraphLeftIndentCommand () extends CommandBase {
  /**
    * Executes the IncrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}


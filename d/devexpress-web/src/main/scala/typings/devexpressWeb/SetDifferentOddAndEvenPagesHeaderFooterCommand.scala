package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the header/footer edit mode so it allows creation of a different header or footer for odd and even pages of a document or section.
  */
@js.native
trait SetDifferentOddAndEvenPagesHeaderFooterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetDifferentOddAndEvenPagesHeaderFooterCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param differentOddAndEvenPages true to apply a different text for the header and footer of the odd and even pages , false to remove the difference.
    */
  def execute(): Boolean = js.native
  def execute(differentOddAndEvenPages: Boolean): Boolean = js.native
}


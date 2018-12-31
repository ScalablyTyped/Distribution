package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the header/footer edit mode so it allows creation of a different header or footer for odd and even pages of a document or section.
  */
@js.native
trait SetDifferentOddAndEvenPagesHeaderFooterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetDifferentOddAndEvenPagesHeaderFooterCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the SetDifferentOddAndEvenPagesHeaderFooterCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param differentOddAndEvenPages true to apply a different text for the header and footer of the odd and even pages , false to remove the difference.
    */
  def execute(differentOddAndEvenPages: scala.Boolean): scala.Boolean = js.native
}


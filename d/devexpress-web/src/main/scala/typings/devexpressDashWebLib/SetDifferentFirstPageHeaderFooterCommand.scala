package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the header/footer edit mode, so it allows creation of a different header or footer for the first page of a document or section.
  */
@js.native
trait SetDifferentFirstPageHeaderFooterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the SetDifferentFirstPageHeaderFooterCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the SetDifferentFirstPageHeaderFooterCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param differentFirstPage true to apply a different text for the first page's header and footer, false to remove the difference.
    */
  def execute(differentFirstPage: scala.Boolean): scala.Boolean = js.native
}


package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the specified hyperlink.
  */
@js.native
trait ChangeHyperlinkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ChangeHyperlinkCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fieldIndex An integer value specifying the field's index in the specified sub-document.
    * @param hyperlinkSettings An object specifying the hyperlink's properties.
    * @param subDocumentId A nullable value specifying the sub-document.
    */
  def execute(fieldIndex: Double, hyperlinkSettings: HyperlinkSettings): Boolean = js.native
  def execute(fieldIndex: Double, hyperlinkSettings: HyperlinkSettings, subDocumentId: js.Any): Boolean = js.native
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the specified hyperlink.
  */
@js.native
trait ChangeHyperlinkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ChangeHyperlinkCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param fieldIndex An integer value specifying the field's index in the specified sub-document.
    * @param hyperlinkSettings An object specifying the hyperlink's properties.
    * @param subDocumentId A nullable value specifying the sub-document.
    */
  def execute(fieldIndex: Double, hyperlinkSettings: HyperlinkSettings): Boolean = js.native
  def execute(fieldIndex: Double, hyperlinkSettings: HyperlinkSettings, subDocumentId: Double): Boolean = js.native
}


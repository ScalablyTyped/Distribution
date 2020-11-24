package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the header/footer edit mode, so it allows creation of a different header or footer for the first page of a document or section.
  */
@js.native
trait SetDifferentFirstPageHeaderFooterCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the SetDifferentFirstPageHeaderFooterCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param differentFirstPage true to apply a different text for the first page's header and footer, false to remove the difference.
    */
  def execute(): Boolean = js.native
  def execute(differentFirstPage: Boolean): Boolean = js.native
}

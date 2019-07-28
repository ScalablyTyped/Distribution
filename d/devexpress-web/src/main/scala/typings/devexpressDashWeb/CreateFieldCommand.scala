package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert an empty document field at the current position in the document.
  */
@js.native
trait CreateFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CreateFieldCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean = js.native
  /**
    * Executes the CreateFieldCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param code A string value specifying the field code receiving to the created field.
    */
  def execute(code: String): Boolean = js.native
}


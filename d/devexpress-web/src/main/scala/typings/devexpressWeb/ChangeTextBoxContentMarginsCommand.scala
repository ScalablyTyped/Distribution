package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' content margins.
  */
@JSGlobal("ChangeTextBoxContentMarginsCommand")
@js.native
class ChangeTextBoxContentMarginsCommand () extends CommandBase {
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins] = js.native
}


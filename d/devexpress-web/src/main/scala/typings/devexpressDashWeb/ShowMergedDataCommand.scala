package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to display or hide actual data in MERGEFIELD fields.
  */
@js.native
trait ShowMergedDataCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowMergedDataCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): Boolean = js.native
  /**
    * Executes the ShowMergedDataCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param showMergedData true to display merged data, false to hide merged data.
    */
  def execute(showMergedData: Boolean): Boolean = js.native
}


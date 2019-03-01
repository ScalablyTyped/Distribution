package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the repository item's table border style.
  */
trait ChangeTableBorderRepositoryItemCommand extends CommandBase {
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  def execute(settings: TableBorderSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTableBorderRepositoryItemCommand {
  @scala.inline
  def apply(execute: js.Function1[TableBorderSettings, scala.Boolean], getState: js.Function0[js.Any]): ChangeTableBorderRepositoryItemCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeTableBorderRepositoryItemCommand]
  }
}


package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to customize the numbered list parameters.
  */
trait ChangeCustomNumberingListCommand extends CommandBase {
  /**
    * Executes the ChangeCustomNumberingListCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param abstractNumberingListIndex An integer value specifying the numbering list index.
    * @param listLevelSettings An array of ListLevelSettings objects defining settings for list levels.
    */
  def execute(abstractNumberingListIndex: scala.Double, listLevelSettings: js.Array[ListLevelSettings]): scala.Boolean
  /**
    * Gets information about the command state.
    * @param abstractNumberingListIndex An integer value specifying the index of the abstract numbering list item whose state to return.
    */
  def getState(abstractNumberingListIndex: scala.Double): js.Any
}

object ChangeCustomNumberingListCommand {
  @scala.inline
  def apply(
    execute: js.Function2[scala.Double, js.Array[ListLevelSettings], scala.Boolean],
    getState: js.Function1[scala.Double, js.Any]
  ): ChangeCustomNumberingListCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[ChangeCustomNumberingListCommand]
  }
}


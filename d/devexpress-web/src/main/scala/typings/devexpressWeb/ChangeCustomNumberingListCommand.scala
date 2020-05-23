package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to customize the numbered list parameters.
  */
trait ChangeCustomNumberingListCommand extends js.Object {
  /**
    * Executes the ChangeCustomNumberingListCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param abstractNumberingListIndex An integer value specifying the numbering list index.
    * @param listLevelSettings An array of ListLevelSettings objects defining settings for list levels.
    */
  def execute(abstractNumberingListIndex: Double, listLevelSettings: js.Array[ListLevelSettings]): Boolean
  /**
    * Gets information about the command's state. An object that contains the command's state.
    * @param abstractNumberingListIndex An integer value specifying the index of the abstract numbering list item whose state to return.
    */
  def getState(abstractNumberingListIndex: Double): CommandState[js.Array[ListLevelSettings]]
}

object ChangeCustomNumberingListCommand {
  @scala.inline
  def apply(
    execute: (Double, js.Array[ListLevelSettings]) => Boolean,
    getState: Double => CommandState[js.Array[ListLevelSettings]]
  ): ChangeCustomNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction1(getState))
    __obj.asInstanceOf[ChangeCustomNumberingListCommand]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the settings of individual section columns.
  */
trait ChangeSectionColumnsCommand extends js.Object {
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  def execute(columns: js.Array[SectionColumn]): Boolean
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[js.Array[SectionColumn]]
}

object ChangeSectionColumnsCommand {
  @scala.inline
  def apply(execute: js.Array[SectionColumn] => Boolean, getState: () => CommandState[js.Array[SectionColumn]]): ChangeSectionColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeSectionColumnsCommand]
  }
}


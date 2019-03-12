package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the settings of individual section columns.
  */
trait ChangeSectionColumnsCommand extends CommandBase {
  /**
    * Executes the ChangeSectionColumnsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param columns An array of SectionColumn objects.
    */
  def execute(columns: js.Array[SectionColumn]): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeSectionColumnsCommand {
  @scala.inline
  def apply(execute: js.Array[SectionColumn] => scala.Boolean, getState: () => js.Any): ChangeSectionColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeSectionColumnsCommand]
  }
}


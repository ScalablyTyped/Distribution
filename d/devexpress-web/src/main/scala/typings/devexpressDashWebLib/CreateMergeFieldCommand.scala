package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a MERGEFIELD field (with a data source column name) at the current position in the document.
  */
trait CreateMergeFieldCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the CreateMergeFieldCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param fieldName A string value specifying the name of the merge field.
    */
  def execute(fieldName: java.lang.String): scala.Boolean
}

object CreateMergeFieldCommand {
  @scala.inline
  def apply(execute: java.lang.String => scala.Boolean, getState: () => SimpleCommandState): CreateMergeFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[CreateMergeFieldCommand]
  }
}


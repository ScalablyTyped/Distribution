package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next data record of the bound data source.
  */
trait GoToDataRecordCommand extends CommandBase {
  /**
    * Executes the GoToDataRecordCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param activeRecordIndex An integer value specifying index of the next data record.
    */
  def execute(activeRecordIndex: scala.Double): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object GoToDataRecordCommand {
  @scala.inline
  def apply(execute: js.Function1[scala.Double, scala.Boolean], getState: js.Function0[js.Any]): GoToDataRecordCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[GoToDataRecordCommand]
  }
}


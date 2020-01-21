package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the next data record of the bound data source.
  */
@JSGlobal("GoToDataRecordCommand")
@js.native
class GoToDataRecordCommand () extends CommandBase {
  /**
    * Executes the GoToDataRecordCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param activeRecordIndex An integer value specifying index of the next data record.
    */
  def execute(activeRecordIndex: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[DataRecordOptions] = js.native
}


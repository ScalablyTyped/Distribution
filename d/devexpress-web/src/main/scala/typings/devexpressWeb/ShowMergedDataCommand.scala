package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to display or hide actual data in MERGEFIELD fields.
  */
@js.native
trait ShowMergedDataCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ShowMergedDataCommand command. true if the command has been successfully executed; false, if the command execution has failed.
    * @param showMergedData true, to show merged data (field results); false to show field codes.
    */
  def execute(): Boolean = js.native
  def execute(showMergedData: Boolean): Boolean = js.native
}

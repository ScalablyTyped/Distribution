package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the settings of individual section columns.
  */
@JSGlobal("ChangeSectionColumnsCommand")
@js.native
class ChangeSectionColumnsCommand () extends js.Object {
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  def execute(columns: js.Array[SectionColumn]): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[js.Array[SectionColumn]] = js.native
}


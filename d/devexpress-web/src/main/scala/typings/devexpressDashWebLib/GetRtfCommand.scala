package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to receive a document's content in RTF format.
  */
@js.native
trait GetRtfCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the GetRtfCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param interval An object specifying the required interval in the current sub-document.
    * @param callback A function that passes the RTF formatted string as a parameter.
    */
  def execute(interval: Interval, callback: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Boolean = js.native
  /**
    * Executes the GetRtfCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param interval An object specifying the required interval in the specified sub-document.
    * @param callback A function that passes the RTF formatted string as a parameter.
    * @param subDocumentId A value identifying the target sub-document.
    */
  def execute(
    interval: Interval,
    callback: js.Function1[/* arg1 */ java.lang.String, scala.Unit],
    subDocumentId: scala.Double
  ): scala.Boolean = js.native
}


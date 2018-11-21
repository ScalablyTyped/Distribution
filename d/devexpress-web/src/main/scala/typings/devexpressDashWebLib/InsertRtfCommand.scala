package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A command to add an RTF formatted content in the selected position.
 */
@js.native
trait InsertRtfCommand extends CommandWithSimpleStateBase {
  /**
       * Executes the InsertRtfCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param rtfText A string representing the RTF formatted content to insert.
       * @param position A value specifying the position to insert in the active sub-document.
       */
  def execute(rtfText: java.lang.String, position: scala.Double): scala.Boolean = js.native
  /**
       * Executes the InsertRtfCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param rtfText A string representing the RTF formatted content to insert.
       * @param position A value specifying the position to insert in the specified sub-document.
       * @param subDocumentId A value identifying the target sub-document.
       */
  def execute(rtfText: java.lang.String, position: scala.Double, subDocumentId: scala.Double): scala.Boolean = js.native
  /**
       * Executes the InsertRtfCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
       * @param rtfText A string representing the RTF formatted content to insert.
       * @param position A value specifying the position to insert in the specified sub-document.
       * @param subDocumentId A value identifying the target sub-document.
       * @param callback A callback function that passes the inserted content's Interval object and the bool parameter that displays whether the RTF formatted string is valid.
       */
  def execute(
    rtfText: java.lang.String,
    position: scala.Double,
    subDocumentId: scala.Double,
    callback: js.Function2[/* arg1 */ Interval, /* arg2 */ scala.Boolean, scala.Unit]
  ): scala.Boolean = js.native
}


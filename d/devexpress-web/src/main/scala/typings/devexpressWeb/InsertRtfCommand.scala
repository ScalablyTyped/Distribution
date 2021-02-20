package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add an RTF formatted content in the selected position.
  */
@js.native
trait InsertRtfCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertRtfCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param rtfText A string representing the RTF formatted content to insert.
    * @param position A value specifying the position to insert in the specified sub-document.
    * @param subDocumentId A value identifying the target sub-document.
    * @param callback A callback function that passes the inserted content's Interval object and the bool parameter that displays whether the RTF formatted string is valid.
    */
  def execute(rtfText: String, position: Double): Boolean = js.native
  def execute(
    rtfText: String,
    position: Double,
    subDocumentId: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* interval */ Interval, /* isRtfValid */ Boolean, Unit]
  ): Boolean = js.native
  def execute(rtfText: String, position: Double, subDocumentId: Double): Boolean = js.native
  def execute(
    rtfText: String,
    position: Double,
    subDocumentId: Double,
    callback: js.Function2[/* interval */ Interval, /* isRtfValid */ Boolean, Unit]
  ): Boolean = js.native
}

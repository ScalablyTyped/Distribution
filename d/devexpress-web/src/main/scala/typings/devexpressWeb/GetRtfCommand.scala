package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to receive a document's content in RTF format.
  */
@js.native
trait GetRtfCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GetRtfCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param interval An object specifying the required interval in the specified sub-document.
    * @param callback A function that passes the RTF formatted string as a parameter.
    * @param subDocumentId A value identifying the target sub-document (the active sub-document by default).
    */
  def execute(interval: Interval, callback: js.Function1[/* rtf */ String, Unit]): Boolean = js.native
  def execute(interval: Interval, callback: js.Function1[/* rtf */ String, Unit], subDocumentId: Double): Boolean = js.native
}

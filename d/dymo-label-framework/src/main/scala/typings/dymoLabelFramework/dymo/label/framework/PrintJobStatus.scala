package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintJobStatus extends StObject
/** Print Job Status */
@JSGlobal("dymo.label.framework.PrintJobStatus")
@js.native
object PrintJobStatus extends StObject {
  
  @js.native
  sealed trait Error extends PrintJobStatus
  
  @js.native
  sealed trait Finished extends PrintJobStatus
  
  @js.native
  sealed trait InQueue extends PrintJobStatus
  
  @js.native
  sealed trait InvalidJobId extends PrintJobStatus
  
  @js.native
  sealed trait NotSpooled extends PrintJobStatus
  
  @js.native
  sealed trait PaperOut extends PrintJobStatus
  
  @js.native
  sealed trait PrinterBusy extends PrintJobStatus
  
  @js.native
  sealed trait Printing extends PrintJobStatus
  
  @js.native
  sealed trait ProcessingError extends PrintJobStatus
  
  @js.native
  sealed trait Unknown extends PrintJobStatus
}

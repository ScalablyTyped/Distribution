package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintJobStatus extends StObject
/** Print Job Status */
@JSGlobal("dymo.label.framework.PrintJobStatus")
@js.native
object PrintJobStatus extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait Finished
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait InQueue
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait InvalidJobId
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait NotSpooled
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait PaperOut
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait PrinterBusy
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait Printing
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait ProcessingError
    extends StObject
       with PrintJobStatus
  
  @js.native
  sealed trait Unknown
    extends StObject
       with PrintJobStatus
}

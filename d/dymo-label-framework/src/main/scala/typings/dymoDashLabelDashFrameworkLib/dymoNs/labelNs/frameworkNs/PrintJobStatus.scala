package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintJobStatus extends js.Object

/** Print Job Status */
@JSGlobal("dymo.label.framework.PrintJobStatus")
@js.native
object PrintJobStatus extends js.Object {
  @js.native
  sealed trait Error
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait Finished
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait InQueue
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait InvalidJobId
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait NotSpooled
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait PaperOut
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait PrinterBusy
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait Printing
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait ProcessingError
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  @js.native
  sealed trait Unknown
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus
  
  val Error: Error with java.lang.String = js.native
  val Finished: Finished with java.lang.String = js.native
  val InQueue: InQueue with java.lang.String = js.native
  val InvalidJobId: InvalidJobId with java.lang.String = js.native
  val NotSpooled: NotSpooled with java.lang.String = js.native
  val PaperOut: PaperOut with java.lang.String = js.native
  val PrinterBusy: PrinterBusy with java.lang.String = js.native
  val Printing: Printing with java.lang.String = js.native
  val ProcessingError: ProcessingError with java.lang.String = js.native
  val Unknown: Unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus with java.lang.String
  ] = js.native
}


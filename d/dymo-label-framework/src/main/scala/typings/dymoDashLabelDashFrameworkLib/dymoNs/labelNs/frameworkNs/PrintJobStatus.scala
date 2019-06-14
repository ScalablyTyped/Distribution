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
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Finished: Finished with scala.Double = js.native
  /* 2 */ val InQueue: InQueue with scala.Double = js.native
  /* 3 */ val InvalidJobId: InvalidJobId with scala.Double = js.native
  /* 4 */ val NotSpooled: NotSpooled with scala.Double = js.native
  /* 5 */ val PaperOut: PaperOut with scala.Double = js.native
  /* 6 */ val PrinterBusy: PrinterBusy with scala.Double = js.native
  /* 7 */ val Printing: Printing with scala.Double = js.native
  /* 8 */ val ProcessingError: ProcessingError with scala.Double = js.native
  /* 9 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.PrintJobStatus with scala.Double
  ] = js.native
}


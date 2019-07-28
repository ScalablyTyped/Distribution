package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

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
  
  /* 0 */ val Error: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.Error with Double = js.native
  /* 1 */ val Finished: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.Finished with Double = js.native
  /* 2 */ val InQueue: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.InQueue with Double = js.native
  /* 3 */ val InvalidJobId: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.InvalidJobId with Double = js.native
  /* 4 */ val NotSpooled: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.NotSpooled with Double = js.native
  /* 5 */ val PaperOut: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.PaperOut with Double = js.native
  /* 6 */ val PrinterBusy: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.PrinterBusy with Double = js.native
  /* 7 */ val Printing: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.Printing with Double = js.native
  /* 8 */ val ProcessingError: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.ProcessingError with Double = js.native
  /* 9 */ val Unknown: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.PrintJobStatus.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintJobStatus with Double] = js.native
}


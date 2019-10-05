package typings.dymoDashLabelDashFramework.dymo.label.framework

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
  
  /* 0 */ val Error: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.Error with Double = js.native
  /* 1 */ val Finished: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.Finished with Double = js.native
  /* 2 */ val InQueue: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.InQueue with Double = js.native
  /* 3 */ val InvalidJobId: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.InvalidJobId with Double = js.native
  /* 4 */ val NotSpooled: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.NotSpooled with Double = js.native
  /* 5 */ val PaperOut: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.PaperOut with Double = js.native
  /* 6 */ val PrinterBusy: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.PrinterBusy with Double = js.native
  /* 7 */ val Printing: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.Printing with Double = js.native
  /* 8 */ val ProcessingError: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.ProcessingError with Double = js.native
  /* 9 */ val Unknown: typings.dymoDashLabelDashFramework.dymo.label.framework.PrintJobStatus.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintJobStatus with Double] = js.native
}


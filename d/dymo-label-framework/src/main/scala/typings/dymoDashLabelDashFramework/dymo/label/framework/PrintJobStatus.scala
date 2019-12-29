package typings.dymoDashLabelDashFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintJobStatus with Double] = js.native
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Finished extends TopLevel[Finished with Double]
  
  /* 2 */ @js.native
  object InQueue extends TopLevel[InQueue with Double]
  
  /* 3 */ @js.native
  object InvalidJobId extends TopLevel[InvalidJobId with Double]
  
  /* 4 */ @js.native
  object NotSpooled extends TopLevel[NotSpooled with Double]
  
  /* 5 */ @js.native
  object PaperOut extends TopLevel[PaperOut with Double]
  
  /* 6 */ @js.native
  object PrinterBusy extends TopLevel[PrinterBusy with Double]
  
  /* 7 */ @js.native
  object Printing extends TopLevel[Printing with Double]
  
  /* 8 */ @js.native
  object ProcessingError extends TopLevel[ProcessingError with Double]
  
  /* 9 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}


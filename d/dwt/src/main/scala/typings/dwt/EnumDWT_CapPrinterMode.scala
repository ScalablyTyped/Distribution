package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapPrinterMode extends js.Object

/** CAP_PRINTERMODE values. */
@JSGlobal("EnumDWT_CapPrinterMode")
@js.native
object EnumDWT_CapPrinterMode extends js.Object {
  /** Specifies that the printed string will consist of a compound of a String followed by a value followed by a suffix string. */
  @js.native
  sealed trait TWPM_COMPOUNDSTRING extends EnumDWT_CapPrinterMode
  
  /** Specifies that the printed text will consist of an enumerated list of strings to be printed in order. */
  @js.native
  sealed trait TWPM_MULTISTRING extends EnumDWT_CapPrinterMode
  
  /** Specifies that the printed text will consist of a single string. */
  @js.native
  sealed trait TWPM_SINGLESTRING extends EnumDWT_CapPrinterMode
  
  /* 2 */ val TWPM_COMPOUNDSTRING: typings.dwt.EnumDWT_CapPrinterMode.TWPM_COMPOUNDSTRING with Double = js.native
  /* 1 */ val TWPM_MULTISTRING: typings.dwt.EnumDWT_CapPrinterMode.TWPM_MULTISTRING with Double = js.native
  /* 0 */ val TWPM_SINGLESTRING: typings.dwt.EnumDWT_CapPrinterMode.TWPM_SINGLESTRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPrinterMode with Double] = js.native
}


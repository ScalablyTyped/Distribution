package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapPrinterMode.TWPM_COMPOUNDSTRING
import typings.dwt.EnumDWT_CapPrinterMode.TWPM_MULTISTRING
import typings.dwt.EnumDWT_CapPrinterMode.TWPM_SINGLESTRING
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPrinterMode with Double] = js.native
  /* 2 */ @js.native
  object TWPM_COMPOUNDSTRING extends TopLevel[TWPM_COMPOUNDSTRING with Double]
  
  /* 1 */ @js.native
  object TWPM_MULTISTRING extends TopLevel[TWPM_MULTISTRING with Double]
  
  /* 0 */ @js.native
  object TWPM_SINGLESTRING extends TopLevel[TWPM_SINGLESTRING with Double]
  
}


package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapPrinterMode extends js.Object

/** CAP_PRINTERMODE values. */
@JSGlobal("EnumDWT_CapPrinterMode")
@js.native
object EnumDWTCapPrinterMode extends js.Object {
  /** Specifies that the printed string will consist of a compound of a String followed by a value followed by a suffix string. */
  @js.native
  sealed trait TWPM_COMPOUNDSTRING extends EnumDWTCapPrinterMode
  
  /** Specifies that the printed text will consist of an enumerated list of strings to be printed in order. */
  @js.native
  sealed trait TWPM_MULTISTRING extends EnumDWTCapPrinterMode
  
  /** Specifies that the printed text will consist of a single string. */
  @js.native
  sealed trait TWPM_SINGLESTRING extends EnumDWTCapPrinterMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPrinterMode with Double] = js.native
  /* 2 */ @js.native
  object TWPM_COMPOUNDSTRING extends TopLevel[TWPM_COMPOUNDSTRING with Double]
  
  /* 1 */ @js.native
  object TWPM_MULTISTRING extends TopLevel[TWPM_MULTISTRING with Double]
  
  /* 0 */ @js.native
  object TWPM_SINGLESTRING extends TopLevel[TWPM_SINGLESTRING with Double]
  
}


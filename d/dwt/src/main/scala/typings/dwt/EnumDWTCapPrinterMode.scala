package typings.dwt

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
  
}


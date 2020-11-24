package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPrinterMode extends js.Object
/** CAP_PRINTERMODE values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPrinterMode")
@js.native
object EnumDWTCapPrinterMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPrinterMode with Double] = js.native
  
  /** Specifies that the printed string will consist of a compound of a String followed by a value followed by a suffix string. */
  @js.native
  sealed trait TWPM_COMPOUNDSTRING extends EnumDWTCapPrinterMode
  /* 2 */ @js.native
  object TWPM_COMPOUNDSTRING extends TopLevel[TWPM_COMPOUNDSTRING with Double]
  
  /** Specifies that the printed text will consist of an enumerated list of strings to be printed in order. */
  @js.native
  sealed trait TWPM_MULTISTRING extends EnumDWTCapPrinterMode
  /* 1 */ @js.native
  object TWPM_MULTISTRING extends TopLevel[TWPM_MULTISTRING with Double]
  
  /** Specifies that the printed text will consist of a single string. */
  @js.native
  sealed trait TWPM_SINGLESTRING extends EnumDWTCapPrinterMode
  /* 0 */ @js.native
  object TWPM_SINGLESTRING extends TopLevel[TWPM_SINGLESTRING with Double]
}

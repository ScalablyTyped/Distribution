package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPrinterMode extends StObject
/** CAP_PRINTERMODE values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPrinterMode")
@js.native
object EnumDWTCapPrinterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPrinterMode with Double] = js.native
  
  /** Specifies that the printed string will consist of a compound of a String followed by a value followed by a suffix string. */
  @js.native
  sealed trait TWPM_COMPOUNDSTRING extends EnumDWTCapPrinterMode
  /* 2 */ val TWPM_COMPOUNDSTRING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPrinterMode.TWPM_COMPOUNDSTRING with Double = js.native
  
  /** Specifies that the printed text will consist of an enumerated list of strings to be printed in order. */
  @js.native
  sealed trait TWPM_MULTISTRING extends EnumDWTCapPrinterMode
  /* 1 */ val TWPM_MULTISTRING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPrinterMode.TWPM_MULTISTRING with Double = js.native
  
  /** Specifies that the printed text will consist of a single string. */
  @js.native
  sealed trait TWPM_SINGLESTRING extends EnumDWTCapPrinterMode
  /* 0 */ val TWPM_SINGLESTRING: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapPrinterMode.TWPM_SINGLESTRING with Double = js.native
}

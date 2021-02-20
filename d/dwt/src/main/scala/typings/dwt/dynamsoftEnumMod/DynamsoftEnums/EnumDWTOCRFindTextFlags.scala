package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextFlags extends StObject
/** OCRPro Find Text Flags */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWTOCRFindTextFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextFlags with Double] = js.native
  
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWTOCRFindTextFlags
  /* 4 */ val OCRFT_FUZZYMATCH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_FUZZYMATCH with Double = js.native
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWTOCRFindTextFlags
  /* 2 */ val OCRFT_MATCHCASE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_MATCHCASE with Double = js.native
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWTOCRFindTextFlags
  /* 1 */ val OCRFT_WHOLEWORD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_WHOLEWORD with Double = js.native
}

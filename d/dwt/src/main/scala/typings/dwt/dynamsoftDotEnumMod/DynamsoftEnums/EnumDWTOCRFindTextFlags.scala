package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextFlags extends StObject
/** OCRPro Find Text Flags */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWTOCRFindTextFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextFlags & Double] = js.native
  
  @js.native
  sealed trait OCRFT_FUZZYMATCH
    extends StObject
       with EnumDWTOCRFindTextFlags
  /* 4 */ val OCRFT_FUZZYMATCH: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_FUZZYMATCH & Double = js.native
  
  @js.native
  sealed trait OCRFT_MATCHCASE
    extends StObject
       with EnumDWTOCRFindTextFlags
  /* 2 */ val OCRFT_MATCHCASE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_MATCHCASE & Double = js.native
  
  @js.native
  sealed trait OCRFT_WHOLEWORD
    extends StObject
       with EnumDWTOCRFindTextFlags
  /* 1 */ val OCRFT_WHOLEWORD: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags.OCRFT_WHOLEWORD & Double = js.native
}

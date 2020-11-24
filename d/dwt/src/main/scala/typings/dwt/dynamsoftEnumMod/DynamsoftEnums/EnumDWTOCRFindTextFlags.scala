package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextFlags extends js.Object
/** OCRPro Find Text Flags */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWTOCRFindTextFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextFlags with Double] = js.native
  
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWTOCRFindTextFlags
  /* 4 */ @js.native
  object OCRFT_FUZZYMATCH extends TopLevel[OCRFT_FUZZYMATCH with Double]
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWTOCRFindTextFlags
  /* 2 */ @js.native
  object OCRFT_MATCHCASE extends TopLevel[OCRFT_MATCHCASE with Double]
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWTOCRFindTextFlags
  /* 1 */ @js.native
  object OCRFT_WHOLEWORD extends TopLevel[OCRFT_WHOLEWORD with Double]
}

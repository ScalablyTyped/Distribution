package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTOCRFindTextFlags extends js.Object

@JSGlobal("EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWTOCRFindTextFlags extends js.Object {
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWTOCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWTOCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWTOCRFindTextFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextFlags with Double] = js.native
  /* 4 */ @js.native
  object OCRFT_FUZZYMATCH extends TopLevel[OCRFT_FUZZYMATCH with Double]
  
  /* 2 */ @js.native
  object OCRFT_MATCHCASE extends TopLevel[OCRFT_MATCHCASE with Double]
  
  /* 1 */ @js.native
  object OCRFT_WHOLEWORD extends TopLevel[OCRFT_WHOLEWORD with Double]
  
}


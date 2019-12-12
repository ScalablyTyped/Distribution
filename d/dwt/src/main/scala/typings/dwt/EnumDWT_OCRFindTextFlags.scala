package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_OCRFindTextFlags.OCRFT_FUZZYMATCH
import typings.dwt.EnumDWT_OCRFindTextFlags.OCRFT_MATCHCASE
import typings.dwt.EnumDWT_OCRFindTextFlags.OCRFT_WHOLEWORD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRFindTextFlags extends js.Object

@JSGlobal("EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWT_OCRFindTextFlags extends js.Object {
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWT_OCRFindTextFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRFindTextFlags with Double] = js.native
  /* 4 */ @js.native
  object OCRFT_FUZZYMATCH extends TopLevel[OCRFT_FUZZYMATCH with Double]
  
  /* 2 */ @js.native
  object OCRFT_MATCHCASE extends TopLevel[OCRFT_MATCHCASE with Double]
  
  /* 1 */ @js.native
  object OCRFT_WHOLEWORD extends TopLevel[OCRFT_WHOLEWORD with Double]
  
}


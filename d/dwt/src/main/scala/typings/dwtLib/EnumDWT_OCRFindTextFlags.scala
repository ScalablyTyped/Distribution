package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRFindTextFlags extends js.Object

@JSGlobal("EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWT_OCRFindTextFlags extends js.Object {
  @js.native
  sealed trait OCRFT_FUZZYMATCH
    extends dwtLib.EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_MATCHCASE
    extends dwtLib.EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_WHOLEWORD
    extends dwtLib.EnumDWT_OCRFindTextFlags
  
  /* 4 */ val OCRFT_FUZZYMATCH: OCRFT_FUZZYMATCH with scala.Double = js.native
  /* 2 */ val OCRFT_MATCHCASE: OCRFT_MATCHCASE with scala.Double = js.native
  /* 1 */ val OCRFT_WHOLEWORD: OCRFT_WHOLEWORD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_OCRFindTextFlags with scala.Double] = js.native
}


package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRFindTextAction extends js.Object

@JSGlobal("EnumDWT_OCRFindTextAction")
@js.native
object EnumDWT_OCRFindTextAction extends js.Object {
  @js.native
  sealed trait OCRFT_HIGHLIGHT
    extends dwtLib.EnumDWT_OCRFindTextAction
  
  @js.native
  sealed trait OCRFT_MARKFORREDACT
    extends dwtLib.EnumDWT_OCRFindTextAction
  
  @js.native
  sealed trait OCRFT_STRIKEOUT
    extends dwtLib.EnumDWT_OCRFindTextAction
  
  /* 0 */ val OCRFT_HIGHLIGHT: OCRFT_HIGHLIGHT with scala.Double = js.native
  /* 2 */ val OCRFT_MARKFORREDACT: OCRFT_MARKFORREDACT with scala.Double = js.native
  /* 1 */ val OCRFT_STRIKEOUT: OCRFT_STRIKEOUT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_OCRFindTextAction with scala.Double] = js.native
}


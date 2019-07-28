package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRFindTextAction extends js.Object

@JSGlobal("EnumDWT_OCRFindTextAction")
@js.native
object EnumDWT_OCRFindTextAction extends js.Object {
  @js.native
  sealed trait OCRFT_HIGHLIGHT extends EnumDWT_OCRFindTextAction
  
  @js.native
  sealed trait OCRFT_MARKFORREDACT extends EnumDWT_OCRFindTextAction
  
  @js.native
  sealed trait OCRFT_STRIKEOUT extends EnumDWT_OCRFindTextAction
  
  /* 0 */ val OCRFT_HIGHLIGHT: typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_HIGHLIGHT with Double = js.native
  /* 2 */ val OCRFT_MARKFORREDACT: typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_MARKFORREDACT with Double = js.native
  /* 1 */ val OCRFT_STRIKEOUT: typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_STRIKEOUT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRFindTextAction with Double] = js.native
}


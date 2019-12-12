package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_HIGHLIGHT
import typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_MARKFORREDACT
import typings.dwt.EnumDWT_OCRFindTextAction.OCRFT_STRIKEOUT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRFindTextAction with Double] = js.native
  /* 0 */ @js.native
  object OCRFT_HIGHLIGHT extends TopLevel[OCRFT_HIGHLIGHT with Double]
  
  /* 2 */ @js.native
  object OCRFT_MARKFORREDACT extends TopLevel[OCRFT_MARKFORREDACT with Double]
  
  /* 1 */ @js.native
  object OCRFT_STRIKEOUT extends TopLevel[OCRFT_STRIKEOUT with Double]
  
}


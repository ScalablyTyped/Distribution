package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextAction extends js.Object
/** OCRPro Find Text Action */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextAction")
@js.native
object EnumDWTOCRFindTextAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextAction with Double] = js.native
  
  @js.native
  sealed trait OCRFT_HIGHLIGHT extends EnumDWTOCRFindTextAction
  /* 0 */ @js.native
  object OCRFT_HIGHLIGHT extends TopLevel[OCRFT_HIGHLIGHT with Double]
  
  @js.native
  sealed trait OCRFT_MARKFORREDACT extends EnumDWTOCRFindTextAction
  /* 2 */ @js.native
  object OCRFT_MARKFORREDACT extends TopLevel[OCRFT_MARKFORREDACT with Double]
  
  @js.native
  sealed trait OCRFT_STRIKEOUT extends EnumDWTOCRFindTextAction
  /* 1 */ @js.native
  object OCRFT_STRIKEOUT extends TopLevel[OCRFT_STRIKEOUT with Double]
}

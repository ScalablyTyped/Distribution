package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextAction extends StObject
/** OCRPro Find Text Action */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextAction")
@js.native
object EnumDWTOCRFindTextAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextAction & Double] = js.native
  
  @js.native
  sealed trait OCRFT_HIGHLIGHT
    extends StObject
       with EnumDWTOCRFindTextAction
  /* 0 */ val OCRFT_HIGHLIGHT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_HIGHLIGHT & Double = js.native
  
  @js.native
  sealed trait OCRFT_MARKFORREDACT
    extends StObject
       with EnumDWTOCRFindTextAction
  /* 2 */ val OCRFT_MARKFORREDACT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_MARKFORREDACT & Double = js.native
  
  @js.native
  sealed trait OCRFT_STRIKEOUT
    extends StObject
       with EnumDWTOCRFindTextAction
  /* 1 */ val OCRFT_STRIKEOUT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_STRIKEOUT & Double = js.native
}

package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRPageSetMode extends StObject
/** OCR PageSet Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRPageSetMode")
@js.native
object EnumDWTOCRPageSetMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRPageSetMode & Double] = js.native
  
  @js.native
  sealed trait OCRPSM_OSD_ONLY
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 0 */ val OCRPSM_OSD_ONLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.OCRPSM_OSD_ONLY & Double = js.native
  
  @js.native
  sealed trait PSM_AUTO
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 3 */ val PSM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_AUTO & Double = js.native
  
  @js.native
  sealed trait PSM_AUTO_ONLY
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 2 */ val PSM_AUTO_ONLY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_AUTO_ONLY & Double = js.native
  
  @js.native
  sealed trait PSM_AUTO_OSD
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 1 */ val PSM_AUTO_OSD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_AUTO_OSD & Double = js.native
  
  @js.native
  sealed trait PSM_CIRCLE_WORD
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 9 */ val PSM_CIRCLE_WORD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_CIRCLE_WORD & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 6 */ val PSM_SINGLE_BLOCK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_BLOCK & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK_VERT_TEXT
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 5 */ val PSM_SINGLE_BLOCK_VERT_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_BLOCK_VERT_TEXT & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_CHAR
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 10 */ val PSM_SINGLE_CHAR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_CHAR & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_COLUMN
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 4 */ val PSM_SINGLE_COLUMN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_COLUMN & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_LINE
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 7 */ val PSM_SINGLE_LINE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_LINE & Double = js.native
  
  @js.native
  sealed trait PSM_SINGLE_WORD
    extends StObject
       with EnumDWTOCRPageSetMode
  /* 8 */ val PSM_SINGLE_WORD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRPageSetMode.PSM_SINGLE_WORD & Double = js.native
}

package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRPageSetMode extends js.Object
/** OCR PageSet Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRPageSetMode")
@js.native
object EnumDWTOCRPageSetMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRPageSetMode with Double] = js.native
  
  @js.native
  sealed trait OCRPSM_OSD_ONLY extends EnumDWTOCRPageSetMode
  /* 0 */ @js.native
  object OCRPSM_OSD_ONLY extends TopLevel[OCRPSM_OSD_ONLY with Double]
  
  @js.native
  sealed trait PSM_AUTO extends EnumDWTOCRPageSetMode
  /* 3 */ @js.native
  object PSM_AUTO extends TopLevel[PSM_AUTO with Double]
  
  @js.native
  sealed trait PSM_AUTO_ONLY extends EnumDWTOCRPageSetMode
  /* 2 */ @js.native
  object PSM_AUTO_ONLY extends TopLevel[PSM_AUTO_ONLY with Double]
  
  @js.native
  sealed trait PSM_AUTO_OSD extends EnumDWTOCRPageSetMode
  /* 1 */ @js.native
  object PSM_AUTO_OSD extends TopLevel[PSM_AUTO_OSD with Double]
  
  @js.native
  sealed trait PSM_CIRCLE_WORD extends EnumDWTOCRPageSetMode
  /* 9 */ @js.native
  object PSM_CIRCLE_WORD extends TopLevel[PSM_CIRCLE_WORD with Double]
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK extends EnumDWTOCRPageSetMode
  /* 6 */ @js.native
  object PSM_SINGLE_BLOCK extends TopLevel[PSM_SINGLE_BLOCK with Double]
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK_VERT_TEXT extends EnumDWTOCRPageSetMode
  /* 5 */ @js.native
  object PSM_SINGLE_BLOCK_VERT_TEXT extends TopLevel[PSM_SINGLE_BLOCK_VERT_TEXT with Double]
  
  @js.native
  sealed trait PSM_SINGLE_CHAR extends EnumDWTOCRPageSetMode
  /* 10 */ @js.native
  object PSM_SINGLE_CHAR extends TopLevel[PSM_SINGLE_CHAR with Double]
  
  @js.native
  sealed trait PSM_SINGLE_COLUMN extends EnumDWTOCRPageSetMode
  /* 4 */ @js.native
  object PSM_SINGLE_COLUMN extends TopLevel[PSM_SINGLE_COLUMN with Double]
  
  @js.native
  sealed trait PSM_SINGLE_LINE extends EnumDWTOCRPageSetMode
  /* 7 */ @js.native
  object PSM_SINGLE_LINE extends TopLevel[PSM_SINGLE_LINE with Double]
  
  @js.native
  sealed trait PSM_SINGLE_WORD extends EnumDWTOCRPageSetMode
  /* 8 */ @js.native
  object PSM_SINGLE_WORD extends TopLevel[PSM_SINGLE_WORD with Double]
}

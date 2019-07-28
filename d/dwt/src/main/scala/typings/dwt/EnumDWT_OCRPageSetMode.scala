package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRPageSetMode extends js.Object

@JSGlobal("EnumDWT_OCRPageSetMode")
@js.native
object EnumDWT_OCRPageSetMode extends js.Object {
  @js.native
  sealed trait OCRPSM_OSD_ONLY extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO_ONLY extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO_OSD extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_CIRCLE_WORD extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK_VERT_TEXT extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_CHAR extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_COLUMN extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_LINE extends EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_WORD extends EnumDWT_OCRPageSetMode
  
  /* 0 */ val OCRPSM_OSD_ONLY: typings.dwt.EnumDWT_OCRPageSetMode.OCRPSM_OSD_ONLY with Double = js.native
  /* 3 */ val PSM_AUTO: typings.dwt.EnumDWT_OCRPageSetMode.PSM_AUTO with Double = js.native
  /* 2 */ val PSM_AUTO_ONLY: typings.dwt.EnumDWT_OCRPageSetMode.PSM_AUTO_ONLY with Double = js.native
  /* 1 */ val PSM_AUTO_OSD: typings.dwt.EnumDWT_OCRPageSetMode.PSM_AUTO_OSD with Double = js.native
  /* 9 */ val PSM_CIRCLE_WORD: typings.dwt.EnumDWT_OCRPageSetMode.PSM_CIRCLE_WORD with Double = js.native
  /* 6 */ val PSM_SINGLE_BLOCK: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_BLOCK with Double = js.native
  /* 5 */ val PSM_SINGLE_BLOCK_VERT_TEXT: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_BLOCK_VERT_TEXT with Double = js.native
  /* 10 */ val PSM_SINGLE_CHAR: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_CHAR with Double = js.native
  /* 4 */ val PSM_SINGLE_COLUMN: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_COLUMN with Double = js.native
  /* 7 */ val PSM_SINGLE_LINE: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_LINE with Double = js.native
  /* 8 */ val PSM_SINGLE_WORD: typings.dwt.EnumDWT_OCRPageSetMode.PSM_SINGLE_WORD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRPageSetMode with Double] = js.native
}


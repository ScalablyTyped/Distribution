package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRPageSetMode extends js.Object

@JSGlobal("EnumDWT_OCRPageSetMode")
@js.native
object EnumDWT_OCRPageSetMode extends js.Object {
  @js.native
  sealed trait OCRPSM_OSD_ONLY
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO_ONLY
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_AUTO_OSD
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_CIRCLE_WORD
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_BLOCK_VERT_TEXT
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_CHAR
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_COLUMN
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_LINE
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  @js.native
  sealed trait PSM_SINGLE_WORD
    extends dwtLib.EnumDWT_OCRPageSetMode
  
  /* 0 */ val OCRPSM_OSD_ONLY: OCRPSM_OSD_ONLY with scala.Double = js.native
  /* 3 */ val PSM_AUTO: PSM_AUTO with scala.Double = js.native
  /* 2 */ val PSM_AUTO_ONLY: PSM_AUTO_ONLY with scala.Double = js.native
  /* 1 */ val PSM_AUTO_OSD: PSM_AUTO_OSD with scala.Double = js.native
  /* 9 */ val PSM_CIRCLE_WORD: PSM_CIRCLE_WORD with scala.Double = js.native
  /* 6 */ val PSM_SINGLE_BLOCK: PSM_SINGLE_BLOCK with scala.Double = js.native
  /* 5 */ val PSM_SINGLE_BLOCK_VERT_TEXT: PSM_SINGLE_BLOCK_VERT_TEXT with scala.Double = js.native
  /* 10 */ val PSM_SINGLE_CHAR: PSM_SINGLE_CHAR with scala.Double = js.native
  /* 4 */ val PSM_SINGLE_COLUMN: PSM_SINGLE_COLUMN with scala.Double = js.native
  /* 7 */ val PSM_SINGLE_LINE: PSM_SINGLE_LINE with scala.Double = js.native
  /* 8 */ val PSM_SINGLE_WORD: PSM_SINGLE_WORD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_OCRPageSetMode with scala.Double] = js.native
}


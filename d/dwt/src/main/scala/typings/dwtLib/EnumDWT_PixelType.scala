package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_PixelType extends js.Object

/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSGlobal("EnumDWT_PixelType")
@js.native
object EnumDWT_PixelType extends js.Object {
  @js.native
  sealed trait TWPT_BW
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CIEXYZ
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CMY
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CMYK
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_GRAY
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_INFRARED
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_LAB
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_PALLETE
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_RGB
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_SCRGB
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_SRGB
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_YUV
    extends dwtLib.EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_YUVK
    extends dwtLib.EnumDWT_PixelType
  
  /* 0 */ val TWPT_BW: TWPT_BW with scala.Double = js.native
  /* 8 */ val TWPT_CIEXYZ: TWPT_CIEXYZ with scala.Double = js.native
  /* 4 */ val TWPT_CMY: TWPT_CMY with scala.Double = js.native
  /* 5 */ val TWPT_CMYK: TWPT_CMYK with scala.Double = js.native
  /* 1 */ val TWPT_GRAY: TWPT_GRAY with scala.Double = js.native
  /* 16 */ val TWPT_INFRARED: TWPT_INFRARED with scala.Double = js.native
  /* 9 */ val TWPT_LAB: TWPT_LAB with scala.Double = js.native
  /* 3 */ val TWPT_PALLETE: TWPT_PALLETE with scala.Double = js.native
  /* 2 */ val TWPT_RGB: TWPT_RGB with scala.Double = js.native
  /* 11 */ val TWPT_SCRGB: TWPT_SCRGB with scala.Double = js.native
  /* 10 */ val TWPT_SRGB: TWPT_SRGB with scala.Double = js.native
  /* 6 */ val TWPT_YUV: TWPT_YUV with scala.Double = js.native
  /* 7 */ val TWPT_YUVK: TWPT_YUVK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_PixelType with scala.Double] = js.native
}


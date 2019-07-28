package typings.dwt

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
  sealed trait TWPT_BW extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CIEXYZ extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CMY extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_CMYK extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_GRAY extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_INFRARED extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_LAB extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_PALLETE extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_RGB extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_SCRGB extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_SRGB extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_YUV extends EnumDWT_PixelType
  
  @js.native
  sealed trait TWPT_YUVK extends EnumDWT_PixelType
  
  /* 0 */ val TWPT_BW: typings.dwt.EnumDWT_PixelType.TWPT_BW with Double = js.native
  /* 8 */ val TWPT_CIEXYZ: typings.dwt.EnumDWT_PixelType.TWPT_CIEXYZ with Double = js.native
  /* 4 */ val TWPT_CMY: typings.dwt.EnumDWT_PixelType.TWPT_CMY with Double = js.native
  /* 5 */ val TWPT_CMYK: typings.dwt.EnumDWT_PixelType.TWPT_CMYK with Double = js.native
  /* 1 */ val TWPT_GRAY: typings.dwt.EnumDWT_PixelType.TWPT_GRAY with Double = js.native
  /* 16 */ val TWPT_INFRARED: typings.dwt.EnumDWT_PixelType.TWPT_INFRARED with Double = js.native
  /* 9 */ val TWPT_LAB: typings.dwt.EnumDWT_PixelType.TWPT_LAB with Double = js.native
  /* 3 */ val TWPT_PALLETE: typings.dwt.EnumDWT_PixelType.TWPT_PALLETE with Double = js.native
  /* 2 */ val TWPT_RGB: typings.dwt.EnumDWT_PixelType.TWPT_RGB with Double = js.native
  /* 11 */ val TWPT_SCRGB: typings.dwt.EnumDWT_PixelType.TWPT_SCRGB with Double = js.native
  /* 10 */ val TWPT_SRGB: typings.dwt.EnumDWT_PixelType.TWPT_SRGB with Double = js.native
  /* 6 */ val TWPT_YUV: typings.dwt.EnumDWT_PixelType.TWPT_YUV with Double = js.native
  /* 7 */ val TWPT_YUVK: typings.dwt.EnumDWT_PixelType.TWPT_YUVK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_PixelType with Double] = js.native
}


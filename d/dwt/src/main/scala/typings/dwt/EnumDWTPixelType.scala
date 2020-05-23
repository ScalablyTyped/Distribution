package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTPixelType extends js.Object

/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSGlobal("EnumDWT_PixelType")
@js.native
object EnumDWTPixelType extends js.Object {
  @js.native
  sealed trait TWPT_BW extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_CIEXYZ extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_CMY extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_CMYK extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_GRAY extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_INFRARED extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_LAB extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_PALLETE extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_RGB extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_SCRGB extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_SRGB extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_YUV extends EnumDWTPixelType
  
  @js.native
  sealed trait TWPT_YUVK extends EnumDWTPixelType
  
}


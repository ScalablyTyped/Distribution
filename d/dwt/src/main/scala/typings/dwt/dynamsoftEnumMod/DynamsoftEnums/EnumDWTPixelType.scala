package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTPixelType extends js.Object

/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PixelType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPixelType with Double] = js.native
  /* 0 */ @js.native
  object TWPT_BW extends TopLevel[TWPT_BW with Double]
  
  /* 8 */ @js.native
  object TWPT_CIEXYZ extends TopLevel[TWPT_CIEXYZ with Double]
  
  /* 4 */ @js.native
  object TWPT_CMY extends TopLevel[TWPT_CMY with Double]
  
  /* 5 */ @js.native
  object TWPT_CMYK extends TopLevel[TWPT_CMYK with Double]
  
  /* 1 */ @js.native
  object TWPT_GRAY extends TopLevel[TWPT_GRAY with Double]
  
  /* 16 */ @js.native
  object TWPT_INFRARED extends TopLevel[TWPT_INFRARED with Double]
  
  /* 9 */ @js.native
  object TWPT_LAB extends TopLevel[TWPT_LAB with Double]
  
  /* 3 */ @js.native
  object TWPT_PALLETE extends TopLevel[TWPT_PALLETE with Double]
  
  /* 2 */ @js.native
  object TWPT_RGB extends TopLevel[TWPT_RGB with Double]
  
  /* 11 */ @js.native
  object TWPT_SCRGB extends TopLevel[TWPT_SCRGB with Double]
  
  /* 10 */ @js.native
  object TWPT_SRGB extends TopLevel[TWPT_SRGB with Double]
  
  /* 6 */ @js.native
  object TWPT_YUV extends TopLevel[TWPT_YUV with Double]
  
  /* 7 */ @js.native
  object TWPT_YUVK extends TopLevel[TWPT_YUVK with Double]
  
}


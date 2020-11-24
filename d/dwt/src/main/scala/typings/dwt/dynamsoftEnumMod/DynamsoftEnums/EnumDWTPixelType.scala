package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPixelType extends js.Object
/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PixelType")
@js.native
object EnumDWTPixelType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPixelType with Double] = js.native
  
  @js.native
  sealed trait TWPT_BW extends EnumDWTPixelType
  /* 0 */ @js.native
  object TWPT_BW extends TopLevel[TWPT_BW with Double]
  
  @js.native
  sealed trait TWPT_CIEXYZ extends EnumDWTPixelType
  /* 8 */ @js.native
  object TWPT_CIEXYZ extends TopLevel[TWPT_CIEXYZ with Double]
  
  @js.native
  sealed trait TWPT_CMY extends EnumDWTPixelType
  /* 4 */ @js.native
  object TWPT_CMY extends TopLevel[TWPT_CMY with Double]
  
  @js.native
  sealed trait TWPT_CMYK extends EnumDWTPixelType
  /* 5 */ @js.native
  object TWPT_CMYK extends TopLevel[TWPT_CMYK with Double]
  
  @js.native
  sealed trait TWPT_GRAY extends EnumDWTPixelType
  /* 1 */ @js.native
  object TWPT_GRAY extends TopLevel[TWPT_GRAY with Double]
  
  @js.native
  sealed trait TWPT_INFRARED extends EnumDWTPixelType
  /* 16 */ @js.native
  object TWPT_INFRARED extends TopLevel[TWPT_INFRARED with Double]
  
  @js.native
  sealed trait TWPT_LAB extends EnumDWTPixelType
  /* 9 */ @js.native
  object TWPT_LAB extends TopLevel[TWPT_LAB with Double]
  
  @js.native
  sealed trait TWPT_PALLETE extends EnumDWTPixelType
  /* 3 */ @js.native
  object TWPT_PALLETE extends TopLevel[TWPT_PALLETE with Double]
  
  @js.native
  sealed trait TWPT_RGB extends EnumDWTPixelType
  /* 2 */ @js.native
  object TWPT_RGB extends TopLevel[TWPT_RGB with Double]
  
  @js.native
  sealed trait TWPT_SCRGB extends EnumDWTPixelType
  /* 11 */ @js.native
  object TWPT_SCRGB extends TopLevel[TWPT_SCRGB with Double]
  
  @js.native
  sealed trait TWPT_SRGB extends EnumDWTPixelType
  /* 10 */ @js.native
  object TWPT_SRGB extends TopLevel[TWPT_SRGB with Double]
  
  @js.native
  sealed trait TWPT_YUV extends EnumDWTPixelType
  /* 6 */ @js.native
  object TWPT_YUV extends TopLevel[TWPT_YUV with Double]
  
  @js.native
  sealed trait TWPT_YUVK extends EnumDWTPixelType
  /* 7 */ @js.native
  object TWPT_YUVK extends TopLevel[TWPT_YUVK with Double]
}

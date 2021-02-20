package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPixelType extends StObject
/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PixelType")
@js.native
object EnumDWTPixelType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPixelType with Double] = js.native
  
  @js.native
  sealed trait TWPT_BW extends EnumDWTPixelType
  /* 0 */ val TWPT_BW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_BW with Double = js.native
  
  @js.native
  sealed trait TWPT_CIEXYZ extends EnumDWTPixelType
  /* 8 */ val TWPT_CIEXYZ: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CIEXYZ with Double = js.native
  
  @js.native
  sealed trait TWPT_CMY extends EnumDWTPixelType
  /* 4 */ val TWPT_CMY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CMY with Double = js.native
  
  @js.native
  sealed trait TWPT_CMYK extends EnumDWTPixelType
  /* 5 */ val TWPT_CMYK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CMYK with Double = js.native
  
  @js.native
  sealed trait TWPT_GRAY extends EnumDWTPixelType
  /* 1 */ val TWPT_GRAY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_GRAY with Double = js.native
  
  @js.native
  sealed trait TWPT_INFRARED extends EnumDWTPixelType
  /* 16 */ val TWPT_INFRARED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_INFRARED with Double = js.native
  
  @js.native
  sealed trait TWPT_LAB extends EnumDWTPixelType
  /* 9 */ val TWPT_LAB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_LAB with Double = js.native
  
  @js.native
  sealed trait TWPT_PALLETE extends EnumDWTPixelType
  /* 3 */ val TWPT_PALLETE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_PALLETE with Double = js.native
  
  @js.native
  sealed trait TWPT_RGB extends EnumDWTPixelType
  /* 2 */ val TWPT_RGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_RGB with Double = js.native
  
  @js.native
  sealed trait TWPT_SCRGB extends EnumDWTPixelType
  /* 11 */ val TWPT_SCRGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_SCRGB with Double = js.native
  
  @js.native
  sealed trait TWPT_SRGB extends EnumDWTPixelType
  /* 10 */ val TWPT_SRGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_SRGB with Double = js.native
  
  @js.native
  sealed trait TWPT_YUV extends EnumDWTPixelType
  /* 6 */ val TWPT_YUV: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_YUV with Double = js.native
  
  @js.native
  sealed trait TWPT_YUVK extends EnumDWTPixelType
  /* 7 */ val TWPT_YUVK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_YUVK with Double = js.native
}

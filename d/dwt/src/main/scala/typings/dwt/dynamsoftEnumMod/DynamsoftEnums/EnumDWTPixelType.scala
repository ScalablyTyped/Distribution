package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPixelType extends StObject
/** ICAP_PIXELTYPE values (PT_ means Pixel Type) */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PixelType")
@js.native
object EnumDWTPixelType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPixelType & Double] = js.native
  
  @js.native
  sealed trait TWPT_BW
    extends StObject
       with EnumDWTPixelType
  /* 0 */ val TWPT_BW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_BW & Double = js.native
  
  @js.native
  sealed trait TWPT_CIEXYZ
    extends StObject
       with EnumDWTPixelType
  /* 8 */ val TWPT_CIEXYZ: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CIEXYZ & Double = js.native
  
  @js.native
  sealed trait TWPT_CMY
    extends StObject
       with EnumDWTPixelType
  /* 4 */ val TWPT_CMY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CMY & Double = js.native
  
  @js.native
  sealed trait TWPT_CMYK
    extends StObject
       with EnumDWTPixelType
  /* 5 */ val TWPT_CMYK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_CMYK & Double = js.native
  
  @js.native
  sealed trait TWPT_GRAY
    extends StObject
       with EnumDWTPixelType
  /* 1 */ val TWPT_GRAY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_GRAY & Double = js.native
  
  @js.native
  sealed trait TWPT_INFRARED
    extends StObject
       with EnumDWTPixelType
  /* 16 */ val TWPT_INFRARED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_INFRARED & Double = js.native
  
  @js.native
  sealed trait TWPT_LAB
    extends StObject
       with EnumDWTPixelType
  /* 9 */ val TWPT_LAB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_LAB & Double = js.native
  
  @js.native
  sealed trait TWPT_PALLETE
    extends StObject
       with EnumDWTPixelType
  /* 3 */ val TWPT_PALLETE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_PALLETE & Double = js.native
  
  @js.native
  sealed trait TWPT_RGB
    extends StObject
       with EnumDWTPixelType
  /* 2 */ val TWPT_RGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_RGB & Double = js.native
  
  @js.native
  sealed trait TWPT_SCRGB
    extends StObject
       with EnumDWTPixelType
  /* 11 */ val TWPT_SCRGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_SCRGB & Double = js.native
  
  @js.native
  sealed trait TWPT_SRGB
    extends StObject
       with EnumDWTPixelType
  /* 10 */ val TWPT_SRGB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_SRGB & Double = js.native
  
  @js.native
  sealed trait TWPT_YUV
    extends StObject
       with EnumDWTPixelType
  /* 6 */ val TWPT_YUV: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_YUV & Double = js.native
  
  @js.native
  sealed trait TWPT_YUVK
    extends StObject
       with EnumDWTPixelType
  /* 7 */ val TWPT_YUVK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType.TWPT_YUVK & Double = js.native
}

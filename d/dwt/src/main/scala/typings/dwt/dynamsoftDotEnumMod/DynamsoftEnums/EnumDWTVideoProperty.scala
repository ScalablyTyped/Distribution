package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoProperty extends StObject
/** Specifies video properties on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoProperty")
@js.native
object EnumDWTVideoProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoProperty & Double] = js.native
  
  /** Specifies the backlight compensation setting. Possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_BACKLIGHTCOMPENSATION
    extends StObject
       with EnumDWTVideoProperty
  /* 8 */ val VP_BACKLIGHTCOMPENSATION: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_BACKLIGHTCOMPENSATION & Double = js.native
  
  /**
    * Specifies the brightness, also called the black level.
    * For NTSC, the value is expressed in IRE units * 100.
    * For non-NTSC sources, the units are arbitrary, with zero
    * representing blanking and 10,000 representing pure white.
    * Values range from -10,000 to 10,000.
    */
  @js.native
  sealed trait VP_BRIGHTNESS
    extends StObject
       with EnumDWTVideoProperty
  /* 0 */ val VP_BRIGHTNESS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_BRIGHTNESS & Double = js.native
  
  /** Specifies the color enable setting. The possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_COLORENABLE
    extends StObject
       with EnumDWTVideoProperty
  /* 6 */ val VP_COLORENABLE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_COLORENABLE & Double = js.native
  
  /** Specifies the contrast, expressed as gain factor * 100. Values range from zero to 10,000. */
  @js.native
  sealed trait VP_CONTRAST
    extends StObject
       with EnumDWTVideoProperty
  /* 1 */ val VP_CONTRAST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_CONTRAST & Double = js.native
  
  /**
    * Specifies the gain adjustment. Zero is normal.
    * Positive values are brighter and negative values are darker.
    * The range of values depends on the device.
    */
  @js.native
  sealed trait VP_GAIN
    extends StObject
       with EnumDWTVideoProperty
  /* 9 */ val VP_GAIN: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_GAIN & Double = js.native
  
  /** Specifies the gamma, as gamma * 100. Values range from 1 to 500. */
  @js.native
  sealed trait VP_GAMMA
    extends StObject
       with EnumDWTVideoProperty
  /* 5 */ val VP_GAMMA: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_GAMMA & Double = js.native
  
  /** Specifies the hue, in degrees * 100. Values range from -180,000 to 180,000 (-180 to +180 degrees). */
  @js.native
  sealed trait VP_HUE
    extends StObject
       with EnumDWTVideoProperty
  /* 2 */ val VP_HUE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_HUE & Double = js.native
  
  /** Specifies the saturation. Values range from 0 to 10,000. */
  @js.native
  sealed trait VP_SATURATION
    extends StObject
       with EnumDWTVideoProperty
  /* 3 */ val VP_SATURATION: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_SATURATION & Double = js.native
  
  /** Specifies the sharpness. Values range from 0 to 100. */
  @js.native
  sealed trait VP_SHARPNESS
    extends StObject
       with EnumDWTVideoProperty
  /* 4 */ val VP_SHARPNESS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_SHARPNESS & Double = js.native
  
  /** Specifies the white balance, as a color temperature in degrees Kelvin. The range of values depends on the device. */
  @js.native
  sealed trait VP_WHITEBALANCE
    extends StObject
       with EnumDWTVideoProperty
  /* 7 */ val VP_WHITEBALANCE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_WHITEBALANCE & Double = js.native
}

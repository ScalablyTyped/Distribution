package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoProperty extends StObject
/** Specifies video properties on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoProperty")
@js.native
object EnumDWTVideoProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoProperty with Double] = js.native
  
  /** Specifies the backlight compensation setting. Possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_BACKLIGHTCOMPENSATION extends EnumDWTVideoProperty
  /* 8 */ val VP_BACKLIGHTCOMPENSATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_BACKLIGHTCOMPENSATION with Double = js.native
  
  /**
    * Specifies the brightness, also called the black level.
    * For NTSC, the value is expressed in IRE units * 100.
    * For non-NTSC sources, the units are arbitrary, with zero
    * representing blanking and 10,000 representing pure white.
    * Values range from -10,000 to 10,000.
    */
  @js.native
  sealed trait VP_BRIGHTNESS extends EnumDWTVideoProperty
  /* 0 */ val VP_BRIGHTNESS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_BRIGHTNESS with Double = js.native
  
  /** Specifies the color enable setting. The possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_COLORENABLE extends EnumDWTVideoProperty
  /* 6 */ val VP_COLORENABLE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_COLORENABLE with Double = js.native
  
  /** Specifies the contrast, expressed as gain factor * 100. Values range from zero to 10,000. */
  @js.native
  sealed trait VP_CONTRAST extends EnumDWTVideoProperty
  /* 1 */ val VP_CONTRAST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_CONTRAST with Double = js.native
  
  /**
    * Specifies the gain adjustment. Zero is normal.
    * Positive values are brighter and negative values are darker.
    * The range of values depends on the device.
    */
  @js.native
  sealed trait VP_GAIN extends EnumDWTVideoProperty
  /* 9 */ val VP_GAIN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_GAIN with Double = js.native
  
  /** Specifies the gamma, as gamma * 100. Values range from 1 to 500. */
  @js.native
  sealed trait VP_GAMMA extends EnumDWTVideoProperty
  /* 5 */ val VP_GAMMA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_GAMMA with Double = js.native
  
  /** Specifies the hue, in degrees * 100. Values range from -180,000 to 180,000 (-180 to +180 degrees). */
  @js.native
  sealed trait VP_HUE extends EnumDWTVideoProperty
  /* 2 */ val VP_HUE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_HUE with Double = js.native
  
  /** Specifies the saturation. Values range from 0 to 10,000. */
  @js.native
  sealed trait VP_SATURATION extends EnumDWTVideoProperty
  /* 3 */ val VP_SATURATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_SATURATION with Double = js.native
  
  /** Specifies the sharpness. Values range from 0 to 100. */
  @js.native
  sealed trait VP_SHARPNESS extends EnumDWTVideoProperty
  /* 4 */ val VP_SHARPNESS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_SHARPNESS with Double = js.native
  
  /** Specifies the white balance, as a color temperature in degrees Kelvin. The range of values depends on the device. */
  @js.native
  sealed trait VP_WHITEBALANCE extends EnumDWTVideoProperty
  /* 7 */ val VP_WHITEBALANCE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty.VP_WHITEBALANCE with Double = js.native
}

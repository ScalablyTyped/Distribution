package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoProperty extends js.Object
/** Specifies video properties on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoProperty")
@js.native
object EnumDWTVideoProperty extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoProperty with Double] = js.native
  
  /** Specifies the backlight compensation setting. Possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_BACKLIGHTCOMPENSATION extends EnumDWTVideoProperty
  /* 8 */ @js.native
  object VP_BACKLIGHTCOMPENSATION extends TopLevel[VP_BACKLIGHTCOMPENSATION with Double]
  
  /**
    * Specifies the brightness, also called the black level.
    * For NTSC, the value is expressed in IRE units * 100.
    * For non-NTSC sources, the units are arbitrary, with zero
    * representing blanking and 10,000 representing pure white.
    * Values range from -10,000 to 10,000.
    */
  @js.native
  sealed trait VP_BRIGHTNESS extends EnumDWTVideoProperty
  /* 0 */ @js.native
  object VP_BRIGHTNESS extends TopLevel[VP_BRIGHTNESS with Double]
  
  /** Specifies the color enable setting. The possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_COLORENABLE extends EnumDWTVideoProperty
  /* 6 */ @js.native
  object VP_COLORENABLE extends TopLevel[VP_COLORENABLE with Double]
  
  /** Specifies the contrast, expressed as gain factor * 100. Values range from zero to 10,000. */
  @js.native
  sealed trait VP_CONTRAST extends EnumDWTVideoProperty
  /* 1 */ @js.native
  object VP_CONTRAST extends TopLevel[VP_CONTRAST with Double]
  
  /**
    * Specifies the gain adjustment. Zero is normal.
    * Positive values are brighter and negative values are darker.
    * The range of values depends on the device.
    */
  @js.native
  sealed trait VP_GAIN extends EnumDWTVideoProperty
  /* 9 */ @js.native
  object VP_GAIN extends TopLevel[VP_GAIN with Double]
  
  /** Specifies the gamma, as gamma * 100. Values range from 1 to 500. */
  @js.native
  sealed trait VP_GAMMA extends EnumDWTVideoProperty
  /* 5 */ @js.native
  object VP_GAMMA extends TopLevel[VP_GAMMA with Double]
  
  /** Specifies the hue, in degrees * 100. Values range from -180,000 to 180,000 (-180 to +180 degrees). */
  @js.native
  sealed trait VP_HUE extends EnumDWTVideoProperty
  /* 2 */ @js.native
  object VP_HUE extends TopLevel[VP_HUE with Double]
  
  /** Specifies the saturation. Values range from 0 to 10,000. */
  @js.native
  sealed trait VP_SATURATION extends EnumDWTVideoProperty
  /* 3 */ @js.native
  object VP_SATURATION extends TopLevel[VP_SATURATION with Double]
  
  /** Specifies the sharpness. Values range from 0 to 100. */
  @js.native
  sealed trait VP_SHARPNESS extends EnumDWTVideoProperty
  /* 4 */ @js.native
  object VP_SHARPNESS extends TopLevel[VP_SHARPNESS with Double]
  
  /** Specifies the white balance, as a color temperature in degrees Kelvin. The range of values depends on the device. */
  @js.native
  sealed trait VP_WHITEBALANCE extends EnumDWTVideoProperty
  /* 7 */ @js.native
  object VP_WHITEBALANCE extends TopLevel[VP_WHITEBALANCE with Double]
}

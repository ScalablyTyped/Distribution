package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTVideoProperty extends js.Object

/** Specifies video properties on a video capture device. */
@JSGlobal("EnumDWT_VideoProperty")
@js.native
object EnumDWTVideoProperty extends js.Object {
  /** Specifies the backlight compensation setting. Possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_BACKLIGHTCOMPENSATION extends EnumDWTVideoProperty
  
  /** Specifies the brightness, also called the black level. For NTSC, the value is expressed in IRE units * 100. 
    *  For non-NTSC sources, the units are arbitrary, with zero representing blanking and 10,000 representing pure white. 
    *  Values range from -10,000 to 10,000.
    */
  @js.native
  sealed trait VP_BRIGHTNESS extends EnumDWTVideoProperty
  
  /** Specifies the color enable setting. The possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_COLORENABLE extends EnumDWTVideoProperty
  
  /** Specifies the contrast, expressed as gain factor * 100. Values range from zero to 10,000. */
  @js.native
  sealed trait VP_CONTRAST extends EnumDWTVideoProperty
  
  /** Specifies the gain adjustment. Zero is normal. Positive values are brighter and negative values are darker. 
    *  The range of values depends on the device.
    */
  @js.native
  sealed trait VP_GAIN extends EnumDWTVideoProperty
  
  /** Specifies the gamma, as gamma * 100. Values range from 1 to 500. */
  @js.native
  sealed trait VP_GAMMA extends EnumDWTVideoProperty
  
  /** Specifies the hue, in degrees * 100. Values range from -180,000 to 180,000 (-180 to +180 degrees). */
  @js.native
  sealed trait VP_HUE extends EnumDWTVideoProperty
  
  /** Specifies the saturation. Values range from 0 to 10,000. */
  @js.native
  sealed trait VP_SATURATION extends EnumDWTVideoProperty
  
  /** Specifies the sharpness. Values range from 0 to 100. */
  @js.native
  sealed trait VP_SHARPNESS extends EnumDWTVideoProperty
  
  /** Specifies the white balance, as a color temperature in degrees Kelvin. The range of values depends on the device. */
  @js.native
  sealed trait VP_WHITEBALANCE extends EnumDWTVideoProperty
  
}


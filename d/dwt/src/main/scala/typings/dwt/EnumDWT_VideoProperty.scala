package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_VideoProperty.VP_BACKLIGHTCOMPENSATION
import typings.dwt.EnumDWT_VideoProperty.VP_BRIGHTNESS
import typings.dwt.EnumDWT_VideoProperty.VP_COLORENABLE
import typings.dwt.EnumDWT_VideoProperty.VP_CONTRAST
import typings.dwt.EnumDWT_VideoProperty.VP_GAIN
import typings.dwt.EnumDWT_VideoProperty.VP_GAMMA
import typings.dwt.EnumDWT_VideoProperty.VP_HUE
import typings.dwt.EnumDWT_VideoProperty.VP_SATURATION
import typings.dwt.EnumDWT_VideoProperty.VP_SHARPNESS
import typings.dwt.EnumDWT_VideoProperty.VP_WHITEBALANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_VideoProperty extends js.Object

/** Specifies video properties on a video capture device. */
@JSGlobal("EnumDWT_VideoProperty")
@js.native
object EnumDWT_VideoProperty extends js.Object {
  /** Specifies the backlight compensation setting. Possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_BACKLIGHTCOMPENSATION extends EnumDWT_VideoProperty
  
  /** Specifies the brightness, also called the black level. For NTSC, the value is expressed in IRE units * 100. 
    *  For non-NTSC sources, the units are arbitrary, with zero representing blanking and 10,000 representing pure white. 
    *  Values range from -10,000 to 10,000.
    */
  @js.native
  sealed trait VP_BRIGHTNESS extends EnumDWT_VideoProperty
  
  /** Specifies the color enable setting. The possible values are 0 (off) and 1 (on). */
  @js.native
  sealed trait VP_COLORENABLE extends EnumDWT_VideoProperty
  
  /** Specifies the contrast, expressed as gain factor * 100. Values range from zero to 10,000. */
  @js.native
  sealed trait VP_CONTRAST extends EnumDWT_VideoProperty
  
  /** Specifies the gain adjustment. Zero is normal. Positive values are brighter and negative values are darker. 
    *  The range of values depends on the device.
    */
  @js.native
  sealed trait VP_GAIN extends EnumDWT_VideoProperty
  
  /** Specifies the gamma, as gamma * 100. Values range from 1 to 500. */
  @js.native
  sealed trait VP_GAMMA extends EnumDWT_VideoProperty
  
  /** Specifies the hue, in degrees * 100. Values range from -180,000 to 180,000 (-180 to +180 degrees). */
  @js.native
  sealed trait VP_HUE extends EnumDWT_VideoProperty
  
  /** Specifies the saturation. Values range from 0 to 10,000. */
  @js.native
  sealed trait VP_SATURATION extends EnumDWT_VideoProperty
  
  /** Specifies the sharpness. Values range from 0 to 100. */
  @js.native
  sealed trait VP_SHARPNESS extends EnumDWT_VideoProperty
  
  /** Specifies the white balance, as a color temperature in degrees Kelvin. The range of values depends on the device. */
  @js.native
  sealed trait VP_WHITEBALANCE extends EnumDWT_VideoProperty
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_VideoProperty with Double] = js.native
  /* 8 */ @js.native
  object VP_BACKLIGHTCOMPENSATION extends TopLevel[VP_BACKLIGHTCOMPENSATION with Double]
  
  /* 0 */ @js.native
  object VP_BRIGHTNESS extends TopLevel[VP_BRIGHTNESS with Double]
  
  /* 6 */ @js.native
  object VP_COLORENABLE extends TopLevel[VP_COLORENABLE with Double]
  
  /* 1 */ @js.native
  object VP_CONTRAST extends TopLevel[VP_CONTRAST with Double]
  
  /* 9 */ @js.native
  object VP_GAIN extends TopLevel[VP_GAIN with Double]
  
  /* 5 */ @js.native
  object VP_GAMMA extends TopLevel[VP_GAMMA with Double]
  
  /* 2 */ @js.native
  object VP_HUE extends TopLevel[VP_HUE with Double]
  
  /* 3 */ @js.native
  object VP_SATURATION extends TopLevel[VP_SATURATION with Double]
  
  /* 4 */ @js.native
  object VP_SHARPNESS extends TopLevel[VP_SHARPNESS with Double]
  
  /* 7 */ @js.native
  object VP_WHITEBALANCE extends TopLevel[VP_WHITEBALANCE with Double]
  
}


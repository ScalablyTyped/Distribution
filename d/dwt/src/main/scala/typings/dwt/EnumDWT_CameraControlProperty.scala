package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CameraControlProperty.CCP_EXPOSURE
import typings.dwt.EnumDWT_CameraControlProperty.CCP_FOCUS
import typings.dwt.EnumDWT_CameraControlProperty.CCP_IRIS
import typings.dwt.EnumDWT_CameraControlProperty.CCP_PAN
import typings.dwt.EnumDWT_CameraControlProperty.CCP_ROLL
import typings.dwt.EnumDWT_CameraControlProperty.CCP_TILT
import typings.dwt.EnumDWT_CameraControlProperty.CCP_ZOOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CameraControlProperty extends js.Object

/** Specifies a setting on a camera. */
@JSGlobal("EnumDWT_CameraControlProperty")
@js.native
object EnumDWT_CameraControlProperty extends js.Object {
  /** Specifies the exposure setting, in log base 2 seconds. In other words, for values less than zero, the exposure time is 1/2^n seconds, 
    *  and for values zero or above, the exposure time is 2^n seconds. For example:
    *  Value	Seconds
    *  -3	1/8
    *  -2	1/4
    *  -1	1/2
    *  0	1
    *  1	2
    *  2	4
    */
  @js.native
  sealed trait CCP_EXPOSURE extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's focus setting, as the distance to the optimally focused target, in millimeters. 
    *  The range and default value are specific to the device. 
    */
  @js.native
  sealed trait CCP_FOCUS extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's iris setting, in units of fstop* 10. */
  @js.native
  sealed trait CCP_IRIS extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's pan setting, in degrees. Values range from -180 to +180, with the default set to zero.
    *  Positive values are clockwise from the origin (the camera rotates clockwise when viewed from above), 
    *  and negative values are counterclockwise from the origin.
    */
  @js.native
  sealed trait CCP_PAN extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's roll setting, in degrees. Values range from -180 to +180, with the default set to zero. 
    *  Positive values cause a clockwise rotation of the camera along the image-viewing axis, and negative values cause a counterclockwise rotation of the camera.
    */
  @js.native
  sealed trait CCP_ROLL extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's tilt setting, in degrees. Values range from -180 to +180, with the default set to zero.
    *  Positive values point the imaging plane up, and negative values point the imaging plane down.
    */
  @js.native
  sealed trait CCP_TILT extends EnumDWT_CameraControlProperty
  
  /** Specifies the camera's zoom setting, in millimeters. Values range from 10 to 600, and the default is specific to the device. */
  @js.native
  sealed trait CCP_ZOOM extends EnumDWT_CameraControlProperty
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CameraControlProperty with Double] = js.native
  /* 4 */ @js.native
  object CCP_EXPOSURE extends TopLevel[CCP_EXPOSURE with Double]
  
  /* 6 */ @js.native
  object CCP_FOCUS extends TopLevel[CCP_FOCUS with Double]
  
  /* 5 */ @js.native
  object CCP_IRIS extends TopLevel[CCP_IRIS with Double]
  
  /* 0 */ @js.native
  object CCP_PAN extends TopLevel[CCP_PAN with Double]
  
  /* 2 */ @js.native
  object CCP_ROLL extends TopLevel[CCP_ROLL with Double]
  
  /* 1 */ @js.native
  object CCP_TILT extends TopLevel[CCP_TILT with Double]
  
  /* 3 */ @js.native
  object CCP_ZOOM extends TopLevel[CCP_ZOOM with Double]
  
}


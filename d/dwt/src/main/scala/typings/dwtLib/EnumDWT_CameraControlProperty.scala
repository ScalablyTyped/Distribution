package typings
package dwtLib

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
  sealed trait CCP_EXPOSURE
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's focus setting, as the distance to the optimally focused target, in millimeters. 
    *  The range and default value are specific to the device. 
    */
  @js.native
  sealed trait CCP_FOCUS
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's iris setting, in units of fstop* 10. */
  @js.native
  sealed trait CCP_IRIS
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's pan setting, in degrees. Values range from -180 to +180, with the default set to zero.
    *  Positive values are clockwise from the origin (the camera rotates clockwise when viewed from above), 
    *  and negative values are counterclockwise from the origin.
    */
  @js.native
  sealed trait CCP_PAN
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's roll setting, in degrees. Values range from -180 to +180, with the default set to zero. 
    *  Positive values cause a clockwise rotation of the camera along the image-viewing axis, and negative values cause a counterclockwise rotation of the camera.
    */
  @js.native
  sealed trait CCP_ROLL
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's tilt setting, in degrees. Values range from -180 to +180, with the default set to zero.
    *  Positive values point the imaging plane up, and negative values point the imaging plane down.
    */
  @js.native
  sealed trait CCP_TILT
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /** Specifies the camera's zoom setting, in millimeters. Values range from 10 to 600, and the default is specific to the device. */
  @js.native
  sealed trait CCP_ZOOM
    extends dwtLib.EnumDWT_CameraControlProperty
  
  /* 4 */ val CCP_EXPOSURE: CCP_EXPOSURE with scala.Double = js.native
  /* 6 */ val CCP_FOCUS: CCP_FOCUS with scala.Double = js.native
  /* 5 */ val CCP_IRIS: CCP_IRIS with scala.Double = js.native
  /* 0 */ val CCP_PAN: CCP_PAN with scala.Double = js.native
  /* 2 */ val CCP_ROLL: CCP_ROLL with scala.Double = js.native
  /* 1 */ val CCP_TILT: CCP_TILT with scala.Double = js.native
  /* 3 */ val CCP_ZOOM: CCP_ZOOM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CameraControlProperty with scala.Double] = js.native
}


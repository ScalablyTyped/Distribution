package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCameraControlProperty extends StObject
/** Specifies a setting on a camera. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CameraControlProperty")
@js.native
object EnumDWTCameraControlProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCameraControlProperty with Double] = js.native
  
  /**
    * Specifies the exposure setting, in log base 2 seconds. In other words, for values less than zero, the exposure time is 1/2^n seconds,
    * and for values zero or above, the exposure time is 2^n seconds. For example=
    * Value    Seconds
    * -3    1/8
    * -2    1/4
    * -1    1/2
    * 0    1
    * 1    2
    * 2    4
    */
  @js.native
  sealed trait CCP_EXPOSURE extends EnumDWTCameraControlProperty
  /* 4 */ val CCP_EXPOSURE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_EXPOSURE with Double = js.native
  
  /**
    * Specifies the camera's focus setting, as the distance to the optimally focused target, in millimeters.
    * The range and default value are specific to the device.
    */
  @js.native
  sealed trait CCP_FOCUS extends EnumDWTCameraControlProperty
  /* 6 */ val CCP_FOCUS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_FOCUS with Double = js.native
  
  /** Specifies the camera's iris setting, in units of fstop* 10. */
  @js.native
  sealed trait CCP_IRIS extends EnumDWTCameraControlProperty
  /* 5 */ val CCP_IRIS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_IRIS with Double = js.native
  
  /**
    * Specifies the camera's pan setting, in degrees.
    * Values range from -180 to +180, with the default set to zero.
    * Positive values are clockwise from the origin (the camera rotates clockwise when viewed from above),
    * and negative values are counterclockwise from the origin.
    */
  @js.native
  sealed trait CCP_PAN extends EnumDWTCameraControlProperty
  /* 0 */ val CCP_PAN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_PAN with Double = js.native
  
  /**
    * Specifies the camera's roll setting, in degrees. Values range from -180 to +180, with the default set to zero.
    * Positive values cause a clockwise rotation of the camera along the image-viewing axis, and negative values cause a counterclockwise rotation of the camera.
    */
  @js.native
  sealed trait CCP_ROLL extends EnumDWTCameraControlProperty
  /* 2 */ val CCP_ROLL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_ROLL with Double = js.native
  
  /**
    * Specifies the camera's tilt setting, in degrees. Values range from -180 to +180, with the default set to zero.
    * Positive values point the imaging plane up, and negative values point the imaging plane down.
    */
  @js.native
  sealed trait CCP_TILT extends EnumDWTCameraControlProperty
  /* 1 */ val CCP_TILT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_TILT with Double = js.native
  
  /** Specifies the camera's zoom setting, in millimeters. Values range from 10 to 600, and the default is specific to the device. */
  @js.native
  sealed trait CCP_ZOOM extends EnumDWTCameraControlProperty
  /* 3 */ val CCP_ZOOM: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty.CCP_ZOOM with Double = js.native
}

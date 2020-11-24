package typings.dwt.addonWebcamMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCameraControlProperty
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoProperty
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode
import typings.dwt.webTwainMod.WebTwain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webcam extends js.Object {
  
  /**
    * Capture an image from the current camera.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error String
    */
  def CaptureImage(
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Close the current camera.
    */
  def CloseSource(): Boolean = js.native
  
  def GetCameraControlPropertyMoreSetting(property: Double): CameraControlPropertyExtra = js.native
  /**
    * Return detailed information about the specified camera property.
    * @param property Specify the property.
    */
  def GetCameraControlPropertyMoreSetting(property: EnumDWTCameraControlProperty): CameraControlPropertyExtra = js.native
  
  def GetCameraControlPropertySetting(property: Double): CameraControlProperty = js.native
  /**
    * Return information about the specified camera property.
    * @param property Specify the property.
    */
  def GetCameraControlPropertySetting(property: EnumDWTCameraControlProperty): CameraControlProperty = js.native
  
  /**
    * Return the internal URL (dwt://) for the latest frame.
    */
  def GetFramePartURL(): String = js.native
  
  /**
    * Return the frame rates supported by the current camera.
    */
  def GetFrameRate(): FrameRate = js.native
  
  /**
    * Return the URL (http(s)://) for the latest frame.
    */
  def GetFrameURL(): String = js.native
  
  /**
    * Return the media types supported by the current camera.
    */
  def GetMediaType(): MediaType = js.native
  
  /**
    * Return the resolutions supported by the current camera.
    */
  def GetResolution(): Resolution = js.native
  
  /**
    * Return a list of all available cameras.
    */
  def GetSourceList(): js.Array[String] = js.native
  
  def GetVideoPropertyMoreSetting(property: Double): VideoControlPropertyExtra = js.native
  /**
    * Return detailed information about the specified video property.
    * @param property Specify the property.
    */
  def GetVideoPropertyMoreSetting(property: EnumDWTVideoProperty): VideoControlPropertyExtra = js.native
  
  def GetVideoPropertySetting(property: Double): VideoControlProperty = js.native
  /**
    * Return information about the specified video property.
    * @param property Specify the property.
    */
  def GetVideoPropertySetting(property: EnumDWTVideoProperty): VideoControlProperty = js.native
  
  /**
    * Return whether the Webcam module has been installed.
    */
  def IsModuleInstalled(): Boolean = js.native
  
  /**
    * Pause the video.
    */
  def PauseVideo(): Boolean = js.native
  
  /**
    * Start to play the video stream from the current camera.
    * @param DWObject Specify a WebTwain instance to show the video.
    * @param quality Specify the quality of the video.
    * @param frameDidShow A callback function that is triggered after each video frame is shown.
    */
  def PlayVideo(DWObject: WebTwain, quality: Double): Boolean = js.native
  def PlayVideo(DWObject: WebTwain, quality: Double, frameDidShow: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Select a camera to use.
    * @param name Specify the camera.
    */
  def SelectSource(name: String): Boolean = js.native
  
  def SetCameraControlPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
  /**
    * Set the specified camera property.
    * @param property Specify the property.
    * @param value Specify the value.
    * @param auto Specify whether the propery should change automatically.
    */
  def SetCameraControlPropertySetting(property: EnumDWTCameraControlProperty, value: Double, auto: Boolean): Boolean = js.native
  
  /**
    * Set the frame rate.
    * @param rate Specify the frame rate.
    */
  def SetFrameRate(rate: Double): Boolean = js.native
  
  /**
    * Set the media type.
    * @param type Sepcify the media type.
    */
  def SetMediaType(`type`: String): Boolean = js.native
  
  /**
    * Set the resolution.
    * @param resolution Specify the resolution.
    */
  def SetResolution(resolution: String): Boolean = js.native
  
  def SetVideoPropertySetting(property: Double, value: Double, auto: Boolean): Boolean = js.native
  /**
    * Set the specified video property.
    * @param property Specify the property.
    * @param value Specify the value.
    * @param auto Specify whether the propery should change automatically.
    */
  def SetVideoPropertySetting(property: EnumDWTVideoProperty, value: Double, auto: Boolean): Boolean = js.native
  
  def SetVideoRotateMode(mode: Double): Boolean = js.native
  /**
    * Rotate the video.
    * @param mode Specify the rotate mode
    */
  def SetVideoRotateMode(mode: EnumDWTVideoRotateMode): Boolean = js.native
  
  /**
    * Stop the video.
    */
  def StopVideo(): Boolean = js.native
}

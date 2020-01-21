package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait Webcam extends js.Object {
  /**
    *  Capture image from the specified webcam. 
    * @method Dynamsoft.WebTwain#CaptureImage 
    * @param {function} OnCaptureSuccess The function to call when the capture succeeds. Please refer to the function prototype OnCaptureSuccess.
    * @param {function} OnCaptureError The function to call when the capture fails. Please refer to the function prototype OnCaptureError.
    * @return {void}
    */
  def CaptureImage(OnCaptureSuccess: js.Function0[Unit], OnCaptureError: js.Function0[Unit]): Unit = js.native
  /**
    *  Close the selected source and release the webcam. 
    * @method Dynamsoft.WebTwain#CloseSource 
    * @return {boolean}
    */
  def CloseSource(): Boolean = js.native
  /**
    *  Download and install webcam add-on on the local system. 
    * @method Dynamsoft.WebTwain#Download 
    * @param {string} remoteFile:string specifies the value of which frame to get. 
    * @param {function} optionalAsyncSuccessFunc optional. The function to call when the download succeeds. Please refer to the function prototype OnSuccess.
    * @param {function} optionalAsyncFailureFunc optional. The function to call when the download fails. Please refer to the function prototype OnFailure.
    * @return {boolean}
    */
  def Download(remoteFile: String): Unit = js.native
  def Download(remoteFile: String, optionalAsyncSuccessFunc: js.Function0[Unit]): Unit = js.native
  def Download(
    remoteFile: String,
    optionalAsyncSuccessFunc: js.Function0[Unit],
    optionalAsyncFailureFunc: js.Function0[Unit]
  ): Unit = js.native
  /**
    *  Gets the range and default value of a specified camera property. 
    * @method Dynamsoft.WebTwain#GetVideoPropertyMoreSetting 
    * @param {EnumDWT_CameraControlProperty} property The property.
    * @return {class CameraControlPropertyMoreSetting}
    */
  def GetCameraControlPropertyMoreSetting(property: EnumDWTCameraControlProperty): CameraControlMoreSetting = js.native
  /**
    *  Gets the current setting of a camera property. 
    * @method Dynamsoft.WebTwain#GetCameraControlPropertySetting 
    * @param {EnumDWT_CameraControlProperty} property The property.
    * @return {class CameraControlPropertySetting}
    */
  def GetCameraControlPropertySetting(property: EnumDWTCameraControlProperty): CameraControlSetting = js.native
  def GetFramePartURL(): String = js.native
  /**
    *  Returns the frame rate for a camera. 
    * @method Dynamsoft.WebTwain#GetFrameRate 
    * @return {class FrameRate}
    */
  def GetFrameRate(): WebcamFrameRate = js.native
  def GetFrameURL(): String = js.native
  /**
    *  Returns the media type for a camera. 
    * @method Dynamsoft.WebTwain#GetMediaType 
    * @return {class MediaType}
    */
  def GetMediaType(): WebcamMediaType = js.native
  /**
    *  Returns the count in the media type list. 
    * @method Dynamsoft.WebTwain#GetResolution 
    * @return {class Resolution}
    */
  def GetResolution(): WebcamResolution = js.native
  /**
    *  Return supported webcam source names. 
    * @method Dynamsoft.WebTwain#GetSourceList 
    * @return {string array}
    */
  def GetSourceList(): js.Array[String] = js.native
  /**
    *  Gets the range and default value of a specified video property. 
    * @method Dynamsoft.WebTwain#GetVideoPropertyMoreSetting 
    * @param {EnumDWT_VideoProperty} property The property.
    * @return {class VideoPropertyMoreSetting}
    */
  def GetVideoPropertyMoreSetting(property: EnumDWTVideoProperty): VideoPropertyMoreSetting = js.native
  /**
    *  Gets the current setting of a video property. 
    * @method Dynamsoft.WebTwain#GetVideoPropertySetting 
    * @param {EnumDWT_VideoProperty} property The property.
    * @return {class VideoPropertySetting}
    */
  def GetVideoPropertySetting(property: EnumDWTVideoProperty): VideoPropertySetting = js.native
  def IsModuleInstalled(): Boolean = js.native
  /**
    *  Show video stream in a specified container
    * @method Dynamsoft.WebTwain#StopVideo 
    * @param {WebTwain} DWObject Specifies the WebTwain Object.
    * @param {number} quality Specifies the quality of each frame in the video stream. Only valid for the HTML5 edition.
    * @param {function} onFrameCaptured callback of the operation to capture
    * @return {void}
    */
  def PlayVideo(DWObject: WebTwain, quality: Double, onFrameCaptured: js.Function0[Unit]): Unit = js.native
  /**
    *  Select the source with the specified name. 
    * @method Dynamsoft.WebTwain#SelectSource 
    * @param {string} strSourceName The source name.
    * @return {boolean}
    */
  def SelectSource(strSourceName: String): Boolean = js.native
  /**
    *  Sets a specified property on the camera. 
    * @method Dynamsoft.WebTwain#SetCameraControlPropertySetting 
    * @param {EnumDWT_CameraControlProperty} property The property.
    * @param {number} value The new value of the property.
    * @param {boolean} auto The desired control setting, whether the setting is controlled manually or automatically.
    * @return {boolean}
    */
  def SetCameraControlPropertySetting(property: EnumDWTCameraControlProperty, value: Double, auto: Boolean): Boolean = js.native
  /**
    *  Set current frame rate. 
    * @method Dynamsoft.WebTwain#SetFrameRate 
    * @param {number} value The new frame rate value.
    * @return {boolean}
    */
  def SetFrameRate(value: Double): Boolean = js.native
  /**
    *  Set the media type of the current selected source by the value. 
    * @method Dynamsoft.WebTwain#SetMediaType 
    * @param {string} value The new media type value.
    * @return {boolean}
    */
  def SetMediaType(value: String): Boolean = js.native
  /**
    *  Set the resolution of the current camera source. 
    * @method Dynamsoft.WebTwain#SetResolution 
    * @param {string} value The new resolution value.
    * @return {boolean}
    */
  def SetResolution(value: String): Boolean = js.native
  /**
    *  Sets video quality for a specified property. 
    * @method Dynamsoft.WebTwain#SetVideoPropertySetting 
    * @param {EnumDWT_VideoProperty} property The property.
    * @param {number} value The new value of the property.
    * @param {boolean} auto The desired control setting, whether the setting is controlled manually or automatically.
    * @return {boolean}
    */
  def SetVideoPropertySetting(property: EnumDWTVideoProperty, value: Double, auto: Boolean): Boolean = js.native
  /**
    *  Sets video rotate mode.
    * @method Dynamsoft.WebTwain#SetVideoRotateMode 
    * @param {EnumDWT_VideoRotateMode} enumAngle The rotate angle.
    * @return {boolean}
    */
  def SetVideoRotateMode(enumAngle: EnumDWTVideoRotateMode): Boolean = js.native
  /**
    *  Stop the video stream in the specified container
    * @method Dynamsoft.WebTwain#StopVideo 
    * @return {boolean}
    */
  def StopVideo(): Boolean = js.native
}


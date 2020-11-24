package typings.dwt.addonCameraMod

import typings.std.Blob
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends js.Object {
  
  /**
    * Capture a frame from the video stream.
    */
  def capture(): js.Promise[Blob] = js.native
  
  /**
    * Close the current camera.
    */
  def closeSource(): js.Promise[DeviceInfo] = js.native
  
  /**
    * Return the resolution of the current camera.
    */
  def getCurrentResolution(): js.Promise[Resolution] = js.native
  
  /**
    * Return the info about the current camera.
    */
  def getCurrentSource(): DeviceInfo = js.native
  
  /**
    * Return the resolutions supported by the current camera.
    */
  def getResolution(): js.Promise[js.Array[Resolution]] = js.native
  
  /**
    * Return a list of all available cameras.
    */
  def getSourceList(): js.Promise[js.Array[DeviceInfo]] = js.native
  
  /**
    * Return the status of the current camera.
    */
  def getStatus(): String = js.native
  
  /**
    * Hide the camera interface.
    */
  def hide(): Unit = js.native
  
  /**
    * Pause the video stream.
    */
  def pause(): Unit = js.native
  
  /**
    * Start streaming video from the current camera.
    * @param element Specify an HTML element to put the video stream in.
    * @param resolution Specify the initial resolution.
    */
  def play(): js.Promise[Resolution] = js.native
  def play(element: js.UndefOr[scala.Nothing], resolution: Resolution): js.Promise[Resolution] = js.native
  def play(element: HTMLElement): js.Promise[Resolution] = js.native
  def play(element: HTMLElement, resolution: Resolution): js.Promise[Resolution] = js.native
  
  /**
    * Resume the video stream.
    */
  def resume(): Unit = js.native
  
  /**
    * Select a camera to use.
    * @param deviceId Specify the camera with its deviceId.
    */
  def selectSource(deviceId: String): js.Promise[DeviceInfo] = js.native
  
  /**
    * Set the resolution for the current camera.
    * @param resolution Specify the resolution.
    */
  def setResolution(resolution: Resolution): js.Promise[Resolution] = js.native
  
  /**
    * Show the camera interface.
    */
  def show(): Unit = js.native
  
  /**
    * Stop the video stream.
    */
  def stop(): Unit = js.native
}

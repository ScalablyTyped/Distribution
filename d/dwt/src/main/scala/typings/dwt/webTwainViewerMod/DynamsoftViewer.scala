package typings.dwt.webTwainViewerMod

import typings.dwt.addonCameraMod.Resolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamsoftViewer extends js.Object {
  
  /**
    * Whether to only show the thumbnails view.
    */
  var bOnlyShowThumbnailsView: Boolean = js.native
  
  /**
    * Bind a custom element to the viewer to add extra features.
    * @param Id Specify the element by its Id.
    * @param priority Specify the importance of the element.
    * @param fullScreen Whether to show the element full-screen.
    */
  def bindCustomElement(Id: String, priority: Double, fullScreen: Boolean): Boolean = js.native
  
  /**
    * Close the camera and hide the video streaming UI.
    */
  def closeVideo(): Unit = js.native
  
  /**
    * Set the shape of the cursor over the thumbnails view.
    */
  var cursorOverThumbnailsView: String = js.native
  
  /**
    * Hide the custom element.
    * @param name Specify the element by its Id.
    */
  def hideCustomElement(Id: String): Boolean = js.native
  
  /**
    * Return or set the margin between two images or the margin between one side of an image and the border of the viewer.
    */
  var imageMargin: Double = js.native
  
  /**
    * Remove a built-in event handler.
    * @param eventName Specify the event.
    */
  def off(eventName: String): Boolean = js.native
  
  /**
    * The mode of operation. Allowed values are 0(no selection, cursor is pointer), 1 (seleciton, cursor is crosshair)
    */
  var operationMode: Double = js.native
  
  /**
    * Set the CSS class name of the specified button.
    * @param name Specify the button.
    * @param className Specify the CSS class name.
    */
  def setButtonClass(name: String, className: String): Boolean = js.native
  
  /**
    * Select a rectangular area on the specified image.
    * @param left Specify the rectangle (leftmost coordinate).
    * @param top Specify the rectangle (topmost coordinate).
    * @param width Specify the rectangle (the width).
    * @param height Specify the rectangle (the height).
    */
  def setSelectedImageArea(left: Double, top: Double, width: Double, height: Double): Boolean = js.native
  
  /**
    * Set the view mode of the viewer.
    * @param columns Specify the number of images per row.
    * @param rows Specify the number of images per column.
    */
  def setViewMode(columns: Double, rows: Double): Boolean = js.native
  
  /**
    * Show the custom element.
    * @param name Specify the element by its Id.
    */
  def showCustomElement(Id: String): Boolean = js.native
  
  /**
    * Return or set whether to show the footer of the viewer.
    */
  var showFooter: Boolean = js.native
  
  /**
    * Return or set whether to show the header of the viewer.
    */
  var showHeader: Boolean = js.native
  
  /**
    * Start streaming video from the current camera in the viewer.
    * @param deviceId Specify a camera.
    * @param resolution Specify the initial resolution.
    */
  def showVideo(): js.Promise[Resolution] = js.native
  def showVideo(deviceId: js.UndefOr[scala.Nothing], resolution: Resolution): js.Promise[Resolution] = js.native
  def showVideo(deviceId: String): js.Promise[Resolution] = js.native
  def showVideo(deviceId: String, resolution: Resolution): js.Promise[Resolution] = js.native
  
  /**
    * Show or hide the custom element.
    * @param name Specify the element by its Id.
    */
  def toggleCustomElement(Id: String): Boolean = js.native
  
  /**
    * Unbind a custom element from the viewer.
    * @param Id Specify the element by its Id.
    */
  def unBindCustomElement(Id: String): Boolean = js.native
  
  /**
    * Update the viewer with detailed configuration.
    * @param config Specify the detailed configuration.
    */
  def updateUISettings(config: ViewerConfig): Boolean = js.native
  
  /**
    * Zoom in by 6/5.
    */
  def zoomIn(): Boolean = js.native
  
  /**
    * Zoom out by 5/6.
    */
  def zoomOut(): Boolean = js.native
}

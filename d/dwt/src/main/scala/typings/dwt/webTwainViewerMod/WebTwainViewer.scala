package typings.dwt.webTwainViewerMod

import typings.dwt.webTwainAcquireMod.WebTwainAcquire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTwainViewer extends WebTwainAcquire {
  
  /**
    * Return or set the background colour of the viewer.
    */
  var BackgroundColor: Double = js.native
  
  /**
    * Create a Dynamsoft Viewer instance and bind it to the WebTwain instance.
    * @param elementId Specify an HTML element to create the viewer.
    * @param config Configuration of the viewer.
    */
  def BindViewer(elementId: String): Boolean = js.native
  def BindViewer(elementId: String, config: BasicViewerConfig): Boolean = js.native
  
  /**
    * Return or set how the image is fit in the viewer.
    */
  var FitWindowType: Double = js.native
  
  /**
    * Return or set the height of the viewer.
    */
  var Height: Double | String = js.native
  
  /**
    * Return or set whether the thumbnails view scrolls when new images come in.
    */
  var IfAutoScroll: Boolean = js.native
  
  /**
    * Return or set the border colour for selected image(s).
    */
  var IfFitWindow: Boolean = js.native
  
  /**
    * Return or set the margin between images (in pixels).
    */
  var ImageMargin: Double = js.native
  
  /**
    * Return or set the shape of the cursor.
    */
  var MouseShape: Boolean = js.native
  
  /**
    * Return the horizontal coordinate of the mouse.
    */
  val MouseX: Double = js.native
  
  /**
    * Return the vertical coordinate of the mouse.
    */
  val MouseY: Double = js.native
  
  /**
    * Return or set the border colour for selected image(s).
    */
  var SelectionImageBorderColor: Double = js.native
  
  /**
    * Return or set whether to show the page numbers.
    */
  var ShowPageNumber: Boolean = js.native
  
  /**
    * Unbind and destroy the viewer.
    */
  def UnbindViewer(): Boolean = js.native
  
  /**
    * Update the viewer with the new configuration.
    * @param config Configuration of the viewer.
    */
  def UpdateViewer(config: BasicViewerConfig): Boolean = js.native
  
  var Viewer: DynamsoftViewer = js.native
  
  /**
    * Return or set the width of the viewer.
    */
  var Width: Double | String = js.native
  
  /**
    * Return or set the zoom factor.
    */
  var Zoom: Double = js.native
}

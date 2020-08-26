package typings.dwt.webTwainViewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamsoftViewer extends js.Object {
  /**
    * Whether to only show the thumbnails view.
    */
  var bOnlyShowThumbnailsView: Boolean = js.native
  /**
    * Set the shape of the cursor over the thumbnails view.
    */
  var cursorOverThumbnailsView: String = js.native
  /**
    * The mode of operation. Allowed values are 0(no selection, cursor is pointer), 1 (seleciton, cursor is crosshair)
    */
  var operationMode: Double = js.native
  /**
    * Return or set whether to show the footer of the viewer.
    */
  var showFooter: Boolean = js.native
  /**
    * Return or set whether to show the header of the viewer.
    */
  var showHeader: Boolean = js.native
  /**
    * Bind a custom element to the viewer to add extra features.
    * @param Id Specify the element by its Id.
    * @param priority Specify the importance of the element.
    * @param fullScreen Whether to show the element full-screen.
    */
  def bindCustomElement(Id: String, priority: Double, fullScreen: Boolean): Boolean = js.native
  /**
    * Hide the custom element.
    * @param name Specify the element by its Id.
    */
  def hideCustomElement(Id: String): Boolean = js.native
  /**
    * Remove a built-in event handler.
    * @param eventName Specify the event.
    */
  def off(eventName: String): Boolean = js.native
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

object DynamsoftViewer {
  @scala.inline
  def apply(
    bOnlyShowThumbnailsView: Boolean,
    bindCustomElement: (String, Double, Boolean) => Boolean,
    cursorOverThumbnailsView: String,
    hideCustomElement: String => Boolean,
    off: String => Boolean,
    operationMode: Double,
    setButtonClass: (String, String) => Boolean,
    setSelectedImageArea: (Double, Double, Double, Double) => Boolean,
    setViewMode: (Double, Double) => Boolean,
    showCustomElement: String => Boolean,
    showFooter: Boolean,
    showHeader: Boolean,
    toggleCustomElement: String => Boolean,
    unBindCustomElement: String => Boolean,
    updateUISettings: ViewerConfig => Boolean,
    zoomIn: () => Boolean,
    zoomOut: () => Boolean
  ): DynamsoftViewer = {
    val __obj = js.Dynamic.literal(bOnlyShowThumbnailsView = bOnlyShowThumbnailsView.asInstanceOf[js.Any], bindCustomElement = js.Any.fromFunction3(bindCustomElement), cursorOverThumbnailsView = cursorOverThumbnailsView.asInstanceOf[js.Any], hideCustomElement = js.Any.fromFunction1(hideCustomElement), off = js.Any.fromFunction1(off), operationMode = operationMode.asInstanceOf[js.Any], setButtonClass = js.Any.fromFunction2(setButtonClass), setSelectedImageArea = js.Any.fromFunction4(setSelectedImageArea), setViewMode = js.Any.fromFunction2(setViewMode), showCustomElement = js.Any.fromFunction1(showCustomElement), showFooter = showFooter.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any], toggleCustomElement = js.Any.fromFunction1(toggleCustomElement), unBindCustomElement = js.Any.fromFunction1(unBindCustomElement), updateUISettings = js.Any.fromFunction1(updateUISettings), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
    __obj.asInstanceOf[DynamsoftViewer]
  }
  @scala.inline
  implicit class DynamsoftViewerOps[Self <: DynamsoftViewer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBOnlyShowThumbnailsView(value: Boolean): Self = this.set("bOnlyShowThumbnailsView", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindCustomElement(value: (String, Double, Boolean) => Boolean): Self = this.set("bindCustomElement", js.Any.fromFunction3(value))
    @scala.inline
    def setCursorOverThumbnailsView(value: String): Self = this.set("cursorOverThumbnailsView", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideCustomElement(value: String => Boolean): Self = this.set("hideCustomElement", js.Any.fromFunction1(value))
    @scala.inline
    def setOff(value: String => Boolean): Self = this.set("off", js.Any.fromFunction1(value))
    @scala.inline
    def setOperationMode(value: Double): Self = this.set("operationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetButtonClass(value: (String, String) => Boolean): Self = this.set("setButtonClass", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSelectedImageArea(value: (Double, Double, Double, Double) => Boolean): Self = this.set("setSelectedImageArea", js.Any.fromFunction4(value))
    @scala.inline
    def setSetViewMode(value: (Double, Double) => Boolean): Self = this.set("setViewMode", js.Any.fromFunction2(value))
    @scala.inline
    def setShowCustomElement(value: String => Boolean): Self = this.set("showCustomElement", js.Any.fromFunction1(value))
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleCustomElement(value: String => Boolean): Self = this.set("toggleCustomElement", js.Any.fromFunction1(value))
    @scala.inline
    def setUnBindCustomElement(value: String => Boolean): Self = this.set("unBindCustomElement", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateUISettings(value: ViewerConfig => Boolean): Self = this.set("updateUISettings", js.Any.fromFunction1(value))
    @scala.inline
    def setZoomIn(value: () => Boolean): Self = this.set("zoomIn", js.Any.fromFunction0(value))
    @scala.inline
    def setZoomOut(value: () => Boolean): Self = this.set("zoomOut", js.Any.fromFunction0(value))
  }
  
}


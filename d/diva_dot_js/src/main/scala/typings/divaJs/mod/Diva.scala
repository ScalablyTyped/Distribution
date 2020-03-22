package typings.divaJs.mod

import typings.divaJs.AnonHeight
import typings.divaJs.AnonIncludePadding
import typings.divaJs.AnonLeft
import typings.divaJs.PartialOptionsobjectDatas
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Options
import typings.divaJs.interfacesMod.Settings
import typings.divaJs.interfacesMod.State
import typings.divaJs.interfacesMod.ViewerState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js", "Diva")
@js.native
class Diva protected () extends js.Object {
   // HashParamState;
  /**
    * @param element - The ID of an HTMLElement to attach an instance of Diva to.
    * @param options - Options to be set by the user for the instance of Diva.
    */
  def this(element: String, options: PartialOptionsobjectDatas) = this()
   // | Toolbar
  var divaState: DivaState = js.native
  var element: HTMLElement = js.native
  var hashState: js.Any = js.native
  var options: Options = js.native
  var settings: Settings = js.native
  var toolbar: Null = js.native
  var viewerState: ViewerState = js.native
  /**
    * Activate this instance of diva via the active Diva controller.
    */
  def activate(): Unit = js.native
  def changeObject(objectData: String): Unit = js.native
  /**
    * Change the object (objectData) parameter currently being rendered by Diva.
    * @param objectData - A IIIF Manifest object or a URL to a IIIF manifest.
    */
  def changeObject(objectData: js.Object): Unit = js.native
  /**
    * Change views. Takes 'document', 'book', or 'grid' to specify which view
    * to switch into.
    * @param destinationView - The destination view to change to.
    */
  def changeView(destinationView: String): Unit = js.native
  /**
    * Deactivate this diva instance through the active Diva controller.
    */
  def deactivate(): Unit = js.native
  /**
    * Destroys this instance, telling plugins to do the same.
    */
  def destroy(): Unit = js.native
  /**
    * Disables document drag scrolling.
    */
  def disableDragScrollable(): Unit = js.native
  /**
    * Disables document dragging, scrolling (by keyboard if set), and zooming
    * by double-clicking.
    */
  def disableScrollable(): Unit = js.native
  /**
    * Enables document drag scrolling.
    */
  def enableDragScrollable(): Unit = js.native
  /**
    * Re-enables document dragging, scrolling (by-keyboard if set), and zooming
    * by double-clicking.
    */
  def enableScrollable(): Unit = js.native
  /**
    * Enter fullscreen mode if currently not in fullscreen mode. If currently
    * in fullscreen mode this will have no effect.
    *
    * This function will work even if enableFullscreen is set to false.
    */
  def enterFullscreenMode(): Boolean = js.native
  /**
    * Enter grid view if currently not in grid view. If currently in grid
    * view mode this will have no effect.
    */
  def enterGridView(): Boolean = js.native
  /**
    * Returns the 0-based index for the current page.
    */
  def getActivePageIndex(): Double = js.native
  /**
    * Returns an array of all page image URIs in the document.
    */
  def getAllPageURIs(): js.Array[String] = js.native
  /**
    * Get the canvas identifier for the currently visible page.
    * @returns The URI of the currently visible canvas.
    */
  def getCurrentCanvas(): String = js.native
  /**
    * Returns the dimensions of the current page at the current
    * zoom level. Also works in grid view.
    */
  def getCurrentPageDimensionsAtCurrentZoomLevel(): AnonHeight = js.native
  /**
    * Returns the current filename (deprecated).
    * @deprecated
    * @returns The URI for the current page image.
    */
  def getCurrentPageFilename(): String = js.native
  /**
    * Returns an array of page indices that are visible in the viewport.
    */
  def getCurrentPageIndices(): js.Array[Double] = js.native
  /**
    * Shortcut to getPageOffset for current page.
    */
  def getCurrentPageOffset(): AnonLeft = js.native
  /**
    * Returns the current URI for the visible page.
    */
  def getCurrentPageURI(): String = js.native
  /**
    * Returns the current URL for the viewer including
    * the hash parameters reflecting the state of the viewer.
    */
  def getCurrentURL(): String = js.native
  /**
    * Returns an array of all filenames in the document. Deprecated.
    * @deprecated
    */
  def getFilenames(): js.Array[String] = js.native
  /**
    * Get the number of grid pages per row.
    */
  def getGridPagesPerRow(): Double = js.native
  /**
    * Get the instance ID number;
    */
  def getInstanceId(): Double = js.native
  /**
    * Get the instance selector for this instance.
    * This is the selector for the parent div.
    */
  def getInstanceSelector(): String = js.native
  /**
    * Returns the title of the document based on the label
    * in the IIIF manifest.
    */
  def getItemTitle(): String = js.native
  /**
    * Get the maximum zoom level for the entire document.
    */
  def getMaxZoomLevel(): Double = js.native
  /**
    * Get the max zoom level for a given page.
    */
  def getMaxZoomLevelForPage(pageIdx: Double): Double = js.native
  /**
    * Get the minimum zom level for the entire document.
    */
  def getMinZoomLevel(): Double = js.native
  /**
    * Get the number of pages in the document.
    */
  def getNumberOfPages(): Double = js.native
  /**
    * If a canvas has multiple images defined, returns the non-primary image.
    * @returns An object containing the other images.
    */
  def getOtherImages(pageIndex: Double): js.Object = js.native
  /**
    * Get page dimensions in the current view and zoom level.
    */
  def getPageDimensions(pageIndex: Double): Dimensions = js.native
  /**
    * Returns the dimensions of a given page at the current zoom level.
    * Also works in Grid view.
    */
  def getPageDimensionsAtCurrentZoomLevel(pageIndex: Double): Dimensions = js.native
  /**
    * Get page dimensions at a given zoom level.
    */
  def getPageDimensionsAtZoomLevel(pageIdx: Double, zoomLevel: Double): Dimensions = js.native
  /**
    * Returns a URL for the image of the page at the given index. By default
    * this is full sized.
    * @param size - An object containing width and height information overriding the default.
    */
  def getPageImageURL(pageIndex: Double): String = js.native
  def getPageImageURL(pageIndex: Double, size: Dimensions): String = js.native
  /**
    * Given a set of coordinates return the 0-based page index for which it matches.
    */
  def getPageIndexForPageXYValues(pageX: Double, pageY: Double): Double = js.native
  /**
    * Returns the distance between the northwest corners of diva-inner and page index.
    */
  def getPageOffset(pageIndex: Double): AnonLeft = js.native
  def getPageOffset(pageIndex: Double, options: AnonIncludePadding): AnonLeft = js.native
  /**
    * Get the instance settings.
    */
  def getSettings(): Settings = js.native
  /**
    * Get an object representing the complete state of the viewer.
    */
  def getState(): State = js.native
  /**
    * Get the current zoom level.
    */
  def getZoomLevel(): Double = js.native
  /**
    * Go to a particular 0-indexed page.
    * The (xAnchor) side of the page will be anchored to the side fo the diva-outer element.
    * @param xAnchor - May be either "left", "right", or default "center".
    * @param yAnchor - Max be either "top", "bottom", or default "center".
    */
  def gotoPageByIndex(pageIndex: Double): Boolean = js.native
  def gotoPageByIndex(pageIndex: Double, xAnchor: String): Boolean = js.native
  def gotoPageByIndex(pageIndex: Double, xAnchor: String, yAnchor: String): Boolean = js.native
  /**
    * Given a canvas label, attempt to go to that page. If no label was found
    * the label will be attempted to match against the page index.
    * @param xAnchor - May be either "left", "right", or default "center".
    * @param yAnchor - May be either "top", "bottom", or default "center".
    */
  def gotoPageByLabel(label: String): Boolean = js.native
  def gotoPageByLabel(label: String, xAnchor: String): Boolean = js.native
  def gotoPageByLabel(label: String, xAnchor: String, yAnchor: String): Boolean = js.native
  /**
    * Jumps to a page based on its filename. Use gotoPageByURI instead.
    * @deprecated
    * @param xAnchor - May be either "left", "right", or default "center".
    * @param yAnchor - May be either "top", "bottom", or default "center".
    */
  def gotoPageByName(filename: String): Boolean = js.native
  def gotoPageByName(filename: String, xAnchor: String): Boolean = js.native
  def gotoPageByName(filename: String, xAnchor: String, yAnchor: String): Boolean = js.native
  /**
    * Jump to a page based on its URI.
    * @param xAnchor - May be either "left", "right", or default "center".
    * @param yAnchor - May be either "top", "bottom", or default "center".
    */
  def gotoPageByURI(uri: String): Boolean = js.native
  def gotoPageByURI(uri: String, xAnchor: String): Boolean = js.native
  def gotoPageByURI(uri: String, xAnchor: String, yAnchor: String): Boolean = js.native
  /**
    * Whether the page has other images to display.
    */
  def hasOtherImages(pageIndex: Double): Boolean = js.native
  /**
    * Hides the pages that are marked "non-paged" in the IIIF manifest.
    */
  def hideNonPagedPages(): Unit = js.native
  /**
    * Is the viewer currently in full-screen mode?
    */
  def isInFullscreen(): Boolean = js.native
  /**
    * Determines if a page is currently in the viewport.
    */
  def isPageInViewport(pageIndex: Double): Boolean = js.native
  /**
    * Check if a page index is within the range of a document.
    */
  def isPageIndexValid(pageIndex: Double): Boolean = js.native
  /**
    * Whether the Diva viewer has been fully initialized.
    */
  def isReady(): Boolean = js.native
  /**
    * Check if something is visible.
    */
  def isRegionInViewport(pageIndex: Double, leftOffset: Double, topOffset: Double, width: Double, height: Double): Boolean = js.native
  /**
    * Whether the page layout is vertically or horizontally oriented.
    * @returns true if vertical; false if horizontal.
    */
  def isVerticallyOriented(): Boolean = js.native
  /**
    * Leave fullscreen mode if currently in fullscreen mode.
    */
  def leaveFullscreenMode(): Boolean = js.native
  /**
    * Leave grid view if currently in grid view.
    */
  def leaveGridView(): Boolean = js.native
  /**
    * Set the number of grid pages per row.
    */
  def setGridPagesPerRow(pagesPerRow: Double): Boolean = js.native
  /**
    * Align this diva instance with a state object (as returned by getState).
    */
  def setState(state: State): Boolean = js.native
  /**
    * Sets the zoom level.
    */
  def setZoomLevel(zoomLevel: Double): Boolean = js.native
  /**
    * Show non-paged pages.
    */
  def showNonPagedPages(): Boolean = js.native
  /**
    * Toggle fullscreen mode.
    */
  def toggleFullscreenMode(): Boolean = js.native
  /**
    * Show/Hide non-paged pages.
    */
  def toggleNonPagedPagesVisibility(): Boolean = js.native
  /**
    * Change between horizontal and vertical layouts.
    * @returns true if document is vertically oriented, false otherwise.
    */
  def toggleOrientation(): Boolean = js.native
  /**
    * Translates a measurement from zoom level on the largest size
    * to one on the current zoom level.
    *
    * For example, a point 1000 on an image that is on zoom level 2 of 5
    * translates to a position of 111.111... (1000 / (5 - 2)^2).
    *
    * Works for a single pixel co-ordinate or a dimension (e.g., translates a box
    * that is 1000 pixels wide on the original to one that is 111.111 pixels wide
    * on the current zoom level).
    * @param position - A point on the max zoom level.
    * @returns The same point on the current zoom level.
    */
  def translateFromMaxZoomLevel(position: Double): Double = js.native
  /**
    * Translates a measurement from the current zoom level to the position on the
    * largest zoom level.
    *
    * Works for a single pixel co-ordinate or a dimension (e.g., translates a box
    * that is 111.111 pixels wide on the current image to one that is 1000 pixels wide
    * on the current zoom level).
    * @params position - A point on the current zoom level.
    * @returns The same point on the max zoom level.
    */
  def translateToMaxZoomLevel(position: Double): Double = js.native
  /**
    * Zoom in.
    * @returns False if at the maximum zoom.
    */
  def zoomIn(): Boolean = js.native
  /**
    * Zoom out.
    * @returns False if it's at the minimum zoom.
    */
  def zoomOut(): Boolean = js.native
}


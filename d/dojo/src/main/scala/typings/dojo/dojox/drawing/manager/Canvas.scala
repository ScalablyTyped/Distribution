package typings.dojo.dojox.drawing.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/Canvas.html
  *
  * Creates a dojox.gfx.surface to be used for Drawing. Note that
  * The 'surface' that Drawing uses is actually a dojox.gfx.group.
  * This allows for more versatility.
  *
  * Called internally from a dojox.Drawing.
  *
  * Note: Surface creation is asynchronous. Connect to
  * onSurfaceReady in Drawing.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.Canvas")
@js.native
class Canvas protected () extends js.Object {
  def this(options: js.Object) = this()
  /**
    *
    */
  var baseClass: String = js.native
  /**
    *
    */
  var useScrollbars: Boolean = js.native
  /**
    * The amount the canvas is zoomed
    *
    */
  var zoom: Double = js.native
  /**
    * Get the scroll position of the canvas
    *
    */
  def getScrollOffset(): js.Object = js.native
  /**
    * Special method used to detect the width (and height)
    * of the browser scrollbars. Becomes memoized.
    *
    */
  def getScrollWidth(): Double = js.native
  /**
    * Event fires on scroll.NOT IMPLEMENTED
    *
    */
  def onScroll(): Unit = js.native
  /**
    * Method used to change size of canvas. Potentially
    * called from a container like ContentPane. May be
    * called directly.
    *
    * @param width
    * @param height
    */
  def resize(width: js.Any, height: js.Any): Unit = js.native
  /**
    * Internal. Changes canvas size and sets scroll position.
    * Do not call this, use resize().
    *
    * @param width
    * @param height
    * @param scrollx
    * @param scrolly
    */
  def setDimensions(width: js.Any, height: js.Any, scrollx: js.Any, scrolly: js.Any): Unit = js.native
  /**
    * Internal. Zooms canvas in and out.
    *
    * @param zoom
    */
  def setZoom(zoom: js.Any): Unit = js.native
}


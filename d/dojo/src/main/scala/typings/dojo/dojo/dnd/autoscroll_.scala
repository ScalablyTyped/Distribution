package typings.dojo.dojo.dnd

import typings.std.Event
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll.html
  *
  * Used by dojo/dnd/Manager to scroll document or internal node when the user
  * drags near the edge of the viewport or a scrollable node
  *
  */
@JSName("autoscroll")
@js.native
trait autoscroll_ extends js.Object {
  /**
    *
    */
  var H_AUTOSCROLL_VALUE: Double = js.native
  /**
    *
    */
  var H_TRIGGER_AUTOSCROLL: Double = js.native
  /**
    *
    */
  var V_AUTOSCROLL_VALUE: Double = js.native
  /**
    *
    */
  var V_TRIGGER_AUTOSCROLL: Double = js.native
  /**
    * a handler for mousemove and touchmove events, which scrolls the window, if
    * necessary
    *
    * @param e mousemove/touchmove event
    */
  def autoScroll(e: Event): Unit = js.native
  /**
    * a handler for mousemove and touchmove events, which scrolls the first available
    * Dom element, it falls back to exports.autoScroll()
    *
    * @param e mousemove/touchmove event
    */
  def autoScrollNodes(e: Event): Unit = js.native
  /**
    * Called at the start of a drag.
    *
    * @param d The document of the node being dragged.
    */
  def autoScrollStart(d: HTMLDocument): Unit = js.native
  /**
    * Returns the dimensions and scroll position of the viewable area of a browser window
    *
    * @param doc               Optional
    */
  def getViewport(): js.Object = js.native
  def getViewport(doc: HTMLDocument): js.Object = js.native
}


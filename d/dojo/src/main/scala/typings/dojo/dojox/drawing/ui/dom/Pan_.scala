package typings.dojo.dojox.drawing.ui.dom

import typings.dojo.dojox.drawing.plugins.Plugin
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/dom/Pan.html
  *
  *
  * @param options
  */
@JSGlobal("dojox.drawing.ui.dom.Pan")
@js.native
class Pan_ protected () extends Plugin {
  def this(options: js.Any) = this()
  /**
    *
    */
  var selected: Boolean = js.native
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    * Scans all items on the canvas and checks if they are out of
    * bounds. If so, a scroll bar (in Canvas) is shown. If the position
    * is left or top, the canvas is scrolled all items are relocated
    * the distance of the scroll. Ideally, it should look as if the
    * items do not move.
    *
    */
  def checkBounds(): Unit = js.native
  /**
    *
    * @param evt
    */
  def onKeyDown(evt: js.Any): Unit = js.native
  /**
    *
    * @param evt
    */
  def onKeyUp(evt: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onPanDrag(obj: js.Any): Unit = js.native
  /**
    *
    * @param bool
    */
  def onSetPan(bool: Boolean): Unit = js.native
  /**
    *
    * @param bool
    */
  def onSetPan(bool: Event_): Unit = js.native
  /**
    *
    * @param obj
    */
  def onStencilDrag(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onStencilUp(obj: js.Any): Unit = js.native
}


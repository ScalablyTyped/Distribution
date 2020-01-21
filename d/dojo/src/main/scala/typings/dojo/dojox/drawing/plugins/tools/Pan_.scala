package typings.dojo.dojox.drawing.plugins.tools

import typings.dojo.dojox.drawing.plugins.Plugin
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/plugins/tools/Pan.html
  *
  * A plugin that allows for a scrolling canvas. An action
  * tool is added to the toolbar that allows for panning. Holding
  * the space bar is a shortcut to that action. The canvas will
  * only pan and scroll if there are objects out of the viewable
  * area.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.plugins.tools.Pan")
@js.native
class Pan_ protected () extends Plugin {
  def this(options: js.Any) = this()
  /**
    *
    */
  var interval: Double = js.native
  /**
    *
    */
  var keyScroll: Boolean = js.native
  /**
    *
    */
  var selected: Boolean = js.native
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    *
    */
  def checkBounds(): Unit = js.native
  /**
    *
    * @param evt
    */
  def onArrow(evt: js.Any): Unit = js.native
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
    * @param obj
    */
  def onPanUp(obj: js.Any): Unit = js.native
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
  /**
    *
    * @param obj
    */
  def onUp(obj: js.Any): Unit = js.native
}


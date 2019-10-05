package typings.dojo.dojox.drawing.ui.dom

import typings.dojo.dojox.drawing.plugins._Plugin
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/dom/Zoom.html
  *
  *
  * @param options
  */
@JSGlobal("dojox.drawing.ui.dom.Zoom")
@js.native
class Zoom protected () extends _Plugin {
  def this(options: js.Any) = this()
  /**
    * The CSS class added to the Toolbar buttons
    *
    */
  var baseClass: String = js.native
  /**
    * The CSS class added to the bottom (or right) Toolbar button
    *
    */
  var botClass: String = js.native
  /**
    * The maximum the canvas can be zoomed in. 10 = 1000%
    *
    */
  var maxZoom: Double = js.native
  /**
    * The CSS class added to the middle Toolbar button
    *
    */
  var midClass: String = js.native
  /**
    * The most the canvas can be zoomed out. .1 = 10%
    *
    */
  var minZoom: Double = js.native
  /**
    * The CSS class added to the top (or left) Toolbar button
    *
    */
  var topClass: String = js.native
  /**
    * The current zoom amount
    *
    */
  var zoomFactor: Double = js.native
  /**
    * The amount of zoom that will occur upon each click.
    *
    */
  var zoomInc: Double = js.native
  /**
    * Internal. Creates one of the buttons in the zoom-button set.
    *
    * @param name
    * @param cls
    */
  def makeButton(name: js.Any, cls: js.Any): Unit = js.native
  /**
    * Zooms to 100%
    *
    * @param evt
    */
  def onZoom100(evt: MouseEvent): Unit = js.native
  /**
    * Handles zoom in.
    *
    * @param evt
    */
  def onZoomIn(evt: MouseEvent): Unit = js.native
  /**
    * Handles zoom out.
    *
    * @param evt
    */
  def onZoomOut(evt: MouseEvent): Unit = js.native
}


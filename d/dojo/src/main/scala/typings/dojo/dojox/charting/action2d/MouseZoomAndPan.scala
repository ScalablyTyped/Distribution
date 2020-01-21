package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/MouseZoomAndPan.html
  *
  * Create an mouse zoom and pan action.
  * You can zoom in or out the data window with mouse wheel. You can scroll using mouse drag gesture.
  * You can toggle between zoom and fit view using double click on the chart.
  *
  * @param chart The chart this action applies to.
  * @param plot
  * @param kwArgs       OptionalOptional arguments for the chart action.
  */
@JSGlobal("dojox.charting.action2d.MouseZoomAndPan")
@js.native
class MouseZoomAndPan protected () extends ChartAction {
  def this(chart: Chart, plot: js.Any) = this()
  def this(chart: Chart, plot: js.Any, kwArgs: js.Object) = this()
  /**
    *
    */
  var defaultParams: js.Object = js.native
  /**
    *
    */
  var optionalParams: js.Object = js.native
  /**
    * Called when the mouse is double is double clicked on the chart. Toggle between zoom and fit chart.
    *
    * @param event
    */
  def onDoubleClick(event: js.Any): Unit = js.native
  /**
    * Called when a key is pressed on the chart.
    *
    * @param event
    */
  def onKeyPress(event: js.Any): Unit = js.native
  /**
    * Called when mouse is down on the chart.
    *
    * @param event
    */
  def onMouseDown(event: js.Any): Unit = js.native
  /**
    * Called when mouse is moved on the chart.
    *
    * @param event
    */
  def onMouseMove(event: js.Any): Unit = js.native
  /**
    * Called when mouse is up on the chart.
    *
    * @param event
    */
  def onMouseUp(event: js.Any): Unit = js.native
  /**
    * Called when mouse wheel is used on the chart.
    *
    * @param event
    */
  def onMouseWheel(event: js.Any): Unit = js.native
}


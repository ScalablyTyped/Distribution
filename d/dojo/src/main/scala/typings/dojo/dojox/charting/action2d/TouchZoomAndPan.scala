package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/TouchZoomAndPan.html
  *
  * Create a touch zoom and pan action.
  * You can zoom out or in the data window with pinch and spread gestures except on Android 2.x and WP8 devices.
  * You can scroll using drag gesture.
  * Finally this is possible to navigate between a fit window and a zoom one using double tap gesture.
  *
  * @param chart The chart this action applies to.
  * @param plot
  * @param kwArgs       OptionalOptional arguments for the action.
  */
@JSGlobal("dojox.charting.action2d.TouchZoomAndPan")
@js.native
class TouchZoomAndPan protected () extends ChartAction {
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
    * Called when double tap is performed on the chart.
    *
    * @param event
    */
  def onDoubleTap(event: js.Any): Unit = js.native
  /**
    * Called when touch is ended on the chart.
    *
    * @param event
    */
  def onTouchEnd(event: js.Any): Unit = js.native
  /**
    * Called when touch is moved on the chart.
    *
    * @param event
    */
  def onTouchMove(event: js.Any): Unit = js.native
  /**
    * Called when touch is started on the chart.
    *
    * @param event
    */
  def onTouchStart(event: js.Any): Unit = js.native
}


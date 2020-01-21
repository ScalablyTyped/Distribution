package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/MouseIndicator.html
  *
  * Create a mouse indicator action. You can drag mouse over the chart to display a data indicator.
  *
  * @param chart The chart this action applies to.
  * @param plot
  * @param kwArgs       OptionalOptional arguments for the chart action.
  */
@JSGlobal("dojox.charting.action2d.MouseIndicator")
@js.native
class MouseIndicator protected () extends ChartAction {
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
    * Called when the indicator value changed.
    *
    * @param event An event with a start property containing the {x, y} data points of the mouse indicator. It alsocontains a label property containing the displayed text.
    */
  def onChange(event: js.Any): Unit = js.native
  /**
    * Called when mouse is down on the chart.
    *
    * @param event
    */
  def onMouseDown(event: js.Any): Unit = js.native
  /**
    * Called when the mouse is moved on the chart.
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
}


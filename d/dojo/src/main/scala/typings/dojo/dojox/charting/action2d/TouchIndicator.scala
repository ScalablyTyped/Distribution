package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/TouchIndicator.html
  *
  * Create a touch indicator action. You can touch over the chart to display a data indicator.
  *
  * @param chart The chart this action applies to.
  * @param plot
  * @param kwArgs       OptionalOptional arguments for the chart action.
  */
@JSGlobal("dojox.charting.action2d.TouchIndicator")
@js.native
class TouchIndicator protected () extends ChartAction {
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
    * @param event An event with a start and end properties containing the {x, y} data points of the first andsecond (if available) touch indicators. It also contains a label property containing the displayedtext.
    */
  def onChange(event: js.Any): Unit = js.native
  /**
    * Called when touch is ended or canceled on the chart.
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


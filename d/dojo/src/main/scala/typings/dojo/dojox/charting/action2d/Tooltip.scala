package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Tooltip.html
  *
  * Create an action on a plot where a tooltip is shown when hovering over an element.
  *
  * @param chart The chart this action belongs to.
  * @param plot       OptionalThe plot this action is attached to.  If not passed, "default" is assumed.
  * @param kwArgs       OptionalOptional keyword arguments object for setting parameters.
  */
@JSGlobal("dojox.charting.action2d.Tooltip")
@js.native
class Tooltip protected () extends PlotAction {
  def this(chart: Chart) = this()
  def this(chart: Chart, plot: String) = this()
  def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
  /**
    *
    */
  var defaultParams: js.Object = js.native
  /**
    *
    */
  var optionalParams: js.Object = js.native
  /**
    *
    */
  def onClick(): Unit = js.native
  /**
    * Process the action on the given object.
    *
    * @param o The object on which to process the highlighting action.
    */
  def process(o: Shape): Unit = js.native
}


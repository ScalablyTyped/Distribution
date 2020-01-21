package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/PlotAction.html
  *
  * Base action class for plot actions.
  *
  * @param chart The chart this action applies to.
  * @param plot       OptionalThe name of the plot this action belongs to.  If none is passed "default" is assumed.
  * @param kwargs       OptionalOptional arguments for the action.
  */
@JSGlobal("dojox.charting.action2d.PlotAction")
@js.native
class PlotAction protected () extends Base {
  def this(chart: Chart) = this()
  def this(chart: Chart, plot: String) = this()
  def this(chart: Chart, plot: String, kwargs: js.Object) = this()
  /**
    *
    */
  var overOutEvents: js.Object = js.native
  /**
    * Reset the action.
    *
    */
  def reset(): Unit = js.native
}


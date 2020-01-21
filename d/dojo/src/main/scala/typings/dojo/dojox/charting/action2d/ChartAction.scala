package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/ChartAction.html
  *
  * Base action class for chart actions.
  *
  * @param chart The chart this action applies to.
  * @param plot       OptionalOptional target plot for this chart action.  Default is "default".
  */
@JSGlobal("dojox.charting.action2d.ChartAction")
@js.native
class ChartAction protected () extends Base {
  def this(chart: Chart) = this()
  def this(chart: Chart, plot: String) = this()
}


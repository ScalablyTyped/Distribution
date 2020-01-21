package typings.dojo.dojox.charting.action2d

import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Magnify.html
  *
  * Create an action that magnifies the object the action is applied to.
  *
  * @param chart The chart this action belongs to.
  * @param plot       OptionalThe plot to apply the action to. If not passed, "default" is assumed.
  * @param kwArgs       OptionalOptional keyword arguments for this action.
  */
@JSGlobal("dojox.charting.action2d.Magnify")
@js.native
class Magnify protected () extends PlotAction {
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
    * Process the action on the given object.
    *
    * @param o The object on which to process the magnifying action.
    */
  def process(o: Shape): Unit = js.native
}


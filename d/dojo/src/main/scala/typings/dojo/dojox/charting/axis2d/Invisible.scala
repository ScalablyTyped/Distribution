package typings.dojo.dojox.charting.axis2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/axis2d/Invisible.html
  *
  * A axis object used in dojox.charting.  You can use that axis if you want the axis to be invisible.
  * See dojox.charting.Chart.addAxis for details.
  *
  * @param chart The chart the axis belongs to.
  * @param kwArgs       OptionalAny optional keyword arguments to be used to define this axis.
  */
@JSGlobal("dojox.charting.axis2d.Invisible")
@js.native
class Invisible protected () extends Base {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    * The default parameters used to define any axis.
    *
    */
  var defaultParams: js.Object = js.native
  /**
    * Any optional parameters needed to define an axis.
    *
    */
  var optionalParams: js.Object = js.native
  /**
    * Perform all calculations needed to render this axis.
    *
    * @param min The smallest value represented on this axis.
    * @param max The largest value represented on this axis.
    * @param span The span in pixels over which axis calculations are made.
    */
  def calculate(min: Double, max: Double, span: Double): js.Any = js.native
  /**
    * Find out whether or not the axis options depend on the data in the axis.
    *
    */
  def dependOnData(): Boolean = js.native
  /**
    * Get the current windowing offset for the axis.
    *
    */
  def getWindowOffset(): Double = js.native
  /**
    * Get the current windowing scale of the axis.
    *
    */
  def getWindowScale(): Double = js.native
  /**
    * Set the drawing "window" for the axis.
    *
    * @param scale The new scale for the axis.
    * @param offset The new offset for the axis.
    */
  def setWindow(scale: Double, offset: Double): js.Any = js.native
}


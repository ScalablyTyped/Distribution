package typings.dojo.dojox.charting.plot2d

import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.charting.Element
import typings.dojo.dojox.charting.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/Base.html
  *
  * Base class for all plot types.
  *
  * @param chart The chart this plot belongs to.
  * @param kwArgs       OptionalAn optional arguments object to help define the plot.
  */
@JSGlobal("dojox.charting.plot2d.Base")
@js.native
class Base protected () extends Element {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    * Add a data series to this plot.
    *
    * @param run The series to be added.
    */
  def addSeries(run: Series): js.Any = js.native
  /**
    * From an array of axes pick the ones that correspond to this plot and
    * assign them to the plot using setAxis method.
    *
    * @param axes An array of dojox/charting/axis2d/Base
    */
  def assignAxes(axes: js.Array[_]): Unit = js.native
  /**
    * Stub function for running the axis calculations (deprecated).
    *
    * @param dim An object of the form { width, height }
    */
  def calculateAxes(dim: js.Object): js.Any = js.native
  /**
    * Clear out all of the information tied to this plot.
    *
    */
  def clear(): js.Any = js.native
  /**
    * Get how many data series we have, so we know how many colors to use.
    *
    */
  def getRequiredColors(): js.Any = js.native
  /**
    * Calculate the min/max on all attached series in both directions.
    *
    */
  def getSeriesStats(): js.Any = js.native
  /**
    * Does nothing.
    *
    */
  def initializeScalers(): js.Function = js.native
  /**
    * Returns whether or not any of this plot's data series need to be rendered.
    *
    */
  def isDataDirty(): js.Any = js.native
  /**
    * Render the plot on the chart.
    *
    * @param dim An object of the form { width, height }.
    * @param offsets An object of the form { l, r, t, b }.
    */
  def render(dim: js.Object, offsets: js.Object): js.Any = js.native
  /**
    *
    * @param group
    * @param x
    * @param y
    * @param label
    * @param theme
    * @param block
    * @param align
    */
  def renderLabel(group: js.Any, x: js.Any, y: js.Any, label: js.Any, theme: js.Any, block: js.Any, align: js.Any): js.Any = js.native
  /**
    * Set an axis for this plot.
    *
    * @param axis The axis to set.
    */
  def setAxis(axis: typings.dojo.dojox.charting.axis2d.Base): js.Any = js.native
}


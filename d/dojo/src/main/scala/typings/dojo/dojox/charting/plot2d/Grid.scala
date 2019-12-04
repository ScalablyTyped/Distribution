package typings.dojo.dojox.charting.plot2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/Grid.html
  *
  * A "faux" plot that can be placed behind other plots to represent
  * a grid against which other plots can be easily measured.
  *
  * @param chart The chart this plot belongs to.
  * @param kwArgs       OptionalAn optional keyword arguments object to help define the parameters of the underlying grid.
  */
@JSGlobal("dojox.charting.plot2d.Grid")
@js.native
class Grid protected () extends CartesianBase {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    *
    */
  var defaultParams: js.Object = js.native
  /**
    *
    */
  var optionalParams: js.Object = js.native
  /**
    * Ignored but included as a dummy method.
    *
    * @param run
    */
  def addSeries(run: js.Any): js.Any = js.native
  /**
    *
    */
  def cleanGroup(): Unit = js.native
  /**
    *
    * @param creator
    * @param params
    */
  def createLine(creator: js.Any, params: js.Any): js.Any = js.native
  /**
    *
    * @param creator
    * @param params
    */
  def createRect(creator: js.Any, params: js.Any): js.Any = js.native
}


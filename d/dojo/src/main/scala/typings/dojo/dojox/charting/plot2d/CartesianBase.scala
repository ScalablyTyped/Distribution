package typings.dojo.dojox.charting.plot2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/CartesianBase.html
  *
  *
  * @param chart The chart this plot belongs to.
  * @param kwArgs       OptionalAn optional arguments object to help define the plot.
  */
@JSGlobal("dojox.charting.plot2d.CartesianBase")
@js.native
class CartesianBase protected () extends Base {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    *
    */
  var baseParams: js.Object = js.native
  /**
    *
    * @param creator
    * @param noClip
    */
  def cleanGroup(creator: js.Any): Unit = js.native
  def cleanGroup(creator: js.Any, noClip: js.Any): Unit = js.native
  /**
    *
    * @param group
    * @param value
    * @param bbox
    * @param theme
    */
  def createLabel(group: js.Any, value: js.Any, bbox: js.Any, theme: js.Any): Unit = js.native
  def initializeScalers(dim: js.Object): js.Any = js.native
  def initializeScalers(dim: js.Object, stats: js.Object): js.Any = js.native
  /**
    * Returns whether or not this plot needs to be rendered.
    *
    */
  def isDirty(): js.Any = js.native
  /**
    * Create/alter any zooming windows on this plot.
    *
    * @param dim An object of the form { width, height }.
    * @param offsets An object of the form { l, r, t, b }.
    */
  def performZoom(dim: js.Object, offsets: js.Object): js.Any = js.native
  /**
    * Compute plot axis data coordinates from page coordinates.
    *
    * @param coord The pixel coordinate in page coordinate space. That is of the following form:{ x: 50, y: 200 }If not provided return the tranform method instead of the result of the transformation.
    */
  def toData(coord: js.Object): js.Any = js.native
  /**
    * Compute page coordinates from plot axis data coordinates.
    *
    * @param coord               OptionalThe coordinates in plot axis data coordinate space. For cartesian charts that is of the following form:{ hAxisName: 50, vAxisName: 200 }If not provided return the transform method instead of the result of the transformation.
    */
  def toPage(coord: js.Object): js.Any = js.native
}


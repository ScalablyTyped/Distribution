package typings.dojo.dojox.charting.axis2d

import typings.dojo.dojox.charting.Chart
import typings.dojo.dojox.charting.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/axis2d/Base.html
  *
  * The base class for any axis.  This is more of an interface/API
  * definition than anything else; see dojox.charting.axis2d.Default
  * for more details.
  *
  * @param chart The chart this axis belongs to.
  * @param kwArgs       OptionalAn optional arguments object to define the axis parameters.
  */
@JSGlobal("dojox.charting.axis2d.Base")
@js.native
class Base protected () extends Element {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    * Stub function to run the calcuations needed for drawing this axis.
    *
    * @param min
    * @param max
    * @param span
    */
  def calculate(min: js.Any, max: js.Any, span: js.Any): js.Any = js.native
  /**
    * Stub function for clearing the axis.
    *
    */
  def clear(): js.Any = js.native
  /**
    * A stub function to return any offsets needed for axis and series rendering.
    *
    */
  def getOffsets(): js.Any = js.native
  /**
    * A stub function to return the scaler object created during calculate.
    *
    */
  def getScaler(): js.Any = js.native
  /**
    * A stub function to return the object that helps define how ticks are rendered.
    *
    */
  def getTicks(): js.Any = js.native
  /**
    * Return a flag as to whether or not this axis has been initialized.
    *
    */
  def initialized(): js.Any = js.native
  /**
    * Stub function to render this axis.
    *
    * @param dim
    * @param offsets
    */
  def render(dim: js.Any, offsets: js.Any): js.Any = js.native
}


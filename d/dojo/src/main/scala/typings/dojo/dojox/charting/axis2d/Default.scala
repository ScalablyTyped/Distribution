package typings.dojo.dojox.charting.axis2d

import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/axis2d/Default.html
  *
  * The default axis object used in dojox.charting.  See dojox.charting.Chart.addAxis for details.
  *
  * @param chart The chart the axis belongs to.
  * @param kwArgs       OptionalAny optional keyword arguments to be used to define this axis.
  */
@JSGlobal("dojox.charting.axis2d.Default")
@js.native
class Default protected () extends Invisible {
  def this(chart: Chart) = this()
  def this(chart: Chart, kwArgs: js.Object) = this()
  /**
    *
    */
  var offset: Double = js.native
  /**
    * The actual options used to define this axis, created at initialization.
    *
    */
  var opt: js.Object = js.native
  /**
    *
    */
  var scale: Double = js.native
  /**
    *
    */
  var scaler: js.Object = js.native
  /**
    *
    */
  var ticks: js.Object = js.native
  /**
    *
    * @param creator
    */
  def cleanGroup(creator: js.Any): Unit = js.native
  /**
    *
    * @param creator
    * @param params
    */
  def createLine(creator: js.Any, params: js.Any): js.Any = js.native
  /**
    *
    * @param labelType
    * @param creator
    * @param x
    * @param y
    * @param align
    * @param textContent
    * @param font
    * @param fontColor
    * @param labelWidth
    */
  def createText(
    labelType: js.Any,
    creator: js.Any,
    x: js.Any,
    y: js.Any,
    align: js.Any,
    textContent: js.Any,
    font: js.Any,
    fontColor: js.Any,
    labelWidth: js.Any
  ): js.Any = js.native
  /**
    *
    * @param elem
    * @param chart
    * @param label
    * @param truncatedLabel
    * @param font
    * @param elemType
    */
  def labelTooltip(elem: js.Any, chart: js.Any, label: js.Any, truncatedLabel: js.Any, font: js.Any, elemType: js.Any): Unit = js.native
  /**
    * Render/draw the axis.
    *
    * @param dim An object of the form { width, height}.
    * @param offsets An object of the form { l, r, t, b }.
    */
  def render(dim: js.Object, offsets: js.Object): js.Any = js.native
}


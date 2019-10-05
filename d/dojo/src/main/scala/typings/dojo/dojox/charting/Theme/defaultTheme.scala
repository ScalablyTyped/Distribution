package typings.dojo.dojox.charting.Theme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Theme.defaultTheme.html
  *
  *
  */
trait defaultTheme extends js.Object {
  /**
    *
    */
  var axis: js.Object
  /**
    *
    */
  var chart: js.Object
  /**
    *
    */
  var indicator: js.Object
  /**
    *
    */
  var marker: js.Object
  /**
    *
    */
  var plotarea: js.Object
  /**
    *
    */
  var series: js.Object
}

object defaultTheme {
  @scala.inline
  def apply(
    axis: js.Object,
    chart: js.Object,
    indicator: js.Object,
    marker: js.Object,
    plotarea: js.Object,
    series: js.Object
  ): defaultTheme = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, indicator = indicator, marker = marker, plotarea = plotarea, series = series)
  
    __obj.asInstanceOf[defaultTheme]
  }
}


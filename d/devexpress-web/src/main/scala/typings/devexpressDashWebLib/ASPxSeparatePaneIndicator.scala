package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeparatePaneIndicator class.
  */
trait ASPxSeparatePaneIndicator extends ASPxClientIndicator {
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    * Value: A string value specifying the Y-axis name.
    */
  var axisY: java.lang.String
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    * Value: A string that is the name of a pane.
    */
  var pane: java.lang.String
}

object ASPxSeparatePaneIndicator {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    name: java.lang.String,
    pane: java.lang.String,
    series: ASPxClientSeries
  ): ASPxSeparatePaneIndicator = {
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, name = name, pane = pane, series = series)
  
    __obj.asInstanceOf[ASPxSeparatePaneIndicator]
  }
}


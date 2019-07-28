package typings.devexpressDashWeb

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
  var axisY: String
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    * Value: A string that is the name of a pane.
    */
  var pane: String
}

object ASPxSeparatePaneIndicator {
  @scala.inline
  def apply(axisY: String, chart: ASPxClientWebChart, name: String, pane: String, series: ASPxClientSeries): ASPxSeparatePaneIndicator = {
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, name = name, pane = pane, series = series)
  
    __obj.asInstanceOf[ASPxSeparatePaneIndicator]
  }
}


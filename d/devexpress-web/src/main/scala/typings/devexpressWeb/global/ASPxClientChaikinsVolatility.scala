package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChaikinsVolatility class.
  */
@JSGlobal("ASPxClientChaikinsVolatility")
@js.native
class ASPxClientChaikinsVolatility ()
  extends typings.devexpressWeb.ASPxClientChaikinsVolatility {
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  /* CompleteClass */
  override var axisY: String = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  /* CompleteClass */
  override var pane: String = js.native
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  /* CompleteClass */
  override var pointsCount: Double = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}


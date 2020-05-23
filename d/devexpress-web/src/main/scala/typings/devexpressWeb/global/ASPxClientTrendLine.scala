package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TrendLine class.
  */
@JSGlobal("ASPxClientTrendLine")
@js.native
class ASPxClientTrendLine ()
  extends typings.devexpressWeb.ASPxClientFinancialIndicator {
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
    * Gets the first point of the financial indicator.
    */
  /* CompleteClass */
  override var point1: typings.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  /**
    * Gets the second point of the financial indicator.
    */
  /* CompleteClass */
  override var point2: typings.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}


package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardDataAxisNamesStatic extends js.Object {
  /**
    * Identifies an argument axis in a chart, scatter chart and pie.
    */
  var ChartArgumentAxis: String
  /**
    * Identifies a series axis in a chart and pie.
    */
  var ChartSeriesAxis: String
  /**
    * Identifies a default axis in all data-bound dashboard items.
    */
  var DefaultAxis: String
  /**
    * Identifies a pivot column axis.
    */
  var PivotColumnAxis: String
  /**
    * Identifies a pivot row axis.
    */
  var PivotRowAxis: String
  /**
    * Identifies a sparkline axis in a grid and cards.
    */
  var SparklineAxis: String
}

object DashboardDataAxisNamesStatic {
  @scala.inline
  def apply(
    ChartArgumentAxis: String,
    ChartSeriesAxis: String,
    DefaultAxis: String,
    PivotColumnAxis: String,
    PivotRowAxis: String,
    SparklineAxis: String
  ): DashboardDataAxisNamesStatic = {
    val __obj = js.Dynamic.literal(ChartArgumentAxis = ChartArgumentAxis, ChartSeriesAxis = ChartSeriesAxis, DefaultAxis = DefaultAxis, PivotColumnAxis = PivotColumnAxis, PivotRowAxis = PivotRowAxis, SparklineAxis = SparklineAxis)
  
    __obj.asInstanceOf[DashboardDataAxisNamesStatic]
  }
}


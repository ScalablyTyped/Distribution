package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardDataAxisNamesStatic extends js.Object {
  /**
    * Identifies an argument axis in a chart, scatter chart and pie.
    */
  var ChartArgumentAxis: java.lang.String
  /**
    * Identifies a series axis in a chart and pie.
    */
  var ChartSeriesAxis: java.lang.String
  /**
    * Identifies a default axis in all data-bound dashboard items.
    */
  var DefaultAxis: java.lang.String
  /**
    * Identifies a pivot column axis.
    */
  var PivotColumnAxis: java.lang.String
  /**
    * Identifies a pivot row axis.
    */
  var PivotRowAxis: java.lang.String
  /**
    * Identifies a sparkline axis in a grid and cards.
    */
  var SparklineAxis: java.lang.String
}

object DashboardDataAxisNamesStatic {
  @scala.inline
  def apply(
    ChartArgumentAxis: java.lang.String,
    ChartSeriesAxis: java.lang.String,
    DefaultAxis: java.lang.String,
    PivotColumnAxis: java.lang.String,
    PivotRowAxis: java.lang.String,
    SparklineAxis: java.lang.String
  ): DashboardDataAxisNamesStatic = {
    val __obj = js.Dynamic.literal(ChartArgumentAxis = ChartArgumentAxis, ChartSeriesAxis = ChartSeriesAxis, DefaultAxis = DefaultAxis, PivotColumnAxis = PivotColumnAxis, PivotRowAxis = PivotRowAxis, SparklineAxis = SparklineAxis)
  
    __obj.asInstanceOf[DashboardDataAxisNamesStatic]
  }
}


package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists constants used to identify various types of data axes.
  */
@JSGlobal("DashboardDataAxisNames")
@js.native
class DashboardDataAxisNames ()
  extends typings.devexpressWeb.DashboardDataAxisNames

/* static members */
@JSGlobal("DashboardDataAxisNames")
@js.native
object DashboardDataAxisNames extends js.Object {
  /**
    * Identifies an argument axis in a chart, scatter chart and pie.
    */
  val ChartArgumentAxis: String = js.native
  /**
    * Identifies a series axis in a chart and pie.
    */
  val ChartSeriesAxis: String = js.native
  /**
    * Identifies a single axis in the data-bound dashboard items.
    */
  val DefaultAxis: String = js.native
  /**
    * Identifies a pivot column axis.
    */
  val PivotColumnAxis: String = js.native
  /**
    * Identifies a pivot row axis.
    */
  val PivotRowAxis: String = js.native
  /**
    * Identifies a sparkline axis in a grid and cards.
    */
  val SparklineAxis: String = js.native
}


package typings.gapiDotClientDotSpanner.gapi.client.spanner

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetStats extends js.Object {
  /** QueryPlan for the query associated with this result. */
  var queryPlan: js.UndefOr[QueryPlan] = js.undefined
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics as
    * follows:
    *
    * {
    * "rows_returned": "3",
    * "elapsed_time": "1.22 secs",
    * "cpu_time": "1.19 secs"
    * }
    */
  var queryStats: js.UndefOr[Record[String, _]] = js.undefined
}

object ResultSetStats {
  @scala.inline
  def apply(queryPlan: QueryPlan = null, queryStats: Record[String, _] = null): ResultSetStats = {
    val __obj = js.Dynamic.literal()
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (queryStats != null) __obj.updateDynamic("queryStats")(queryStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetStats]
  }
}


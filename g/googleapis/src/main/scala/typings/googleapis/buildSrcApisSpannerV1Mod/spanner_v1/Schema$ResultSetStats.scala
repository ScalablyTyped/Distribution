package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional statistics about a ResultSet or PartialResultSet.
  */
@js.native
trait Schema$ResultSetStats extends js.Object {
  /**
    * QueryPlan for the query associated with this result.
    */
  var queryPlan: js.UndefOr[Schema$QueryPlan] = js.native
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics
    * as follows:      {       &quot;rows_returned&quot;: &quot;3&quot;,
    * &quot;elapsed_time&quot;: &quot;1.22 secs&quot;, &quot;cpu_time&quot;:
    * &quot;1.19 secs&quot;     }
    */
  var queryStats: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Standard DML returns an exact count of rows that were modified.
    */
  var rowCountExact: js.UndefOr[String] = js.native
  /**
    * Partitioned DML does not offer exactly-once semantics, so it returns a
    * lower bound of the rows modified.
    */
  var rowCountLowerBound: js.UndefOr[String] = js.native
}

object Schema$ResultSetStats {
  @scala.inline
  def apply(
    queryPlan: Schema$QueryPlan = null,
    queryStats: StringDictionary[js.Any] = null,
    rowCountExact: String = null,
    rowCountLowerBound: String = null
  ): Schema$ResultSetStats = {
    val __obj = js.Dynamic.literal()
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (queryStats != null) __obj.updateDynamic("queryStats")(queryStats.asInstanceOf[js.Any])
    if (rowCountExact != null) __obj.updateDynamic("rowCountExact")(rowCountExact.asInstanceOf[js.Any])
    if (rowCountLowerBound != null) __obj.updateDynamic("rowCountLowerBound")(rowCountLowerBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultSetStats]
  }
}


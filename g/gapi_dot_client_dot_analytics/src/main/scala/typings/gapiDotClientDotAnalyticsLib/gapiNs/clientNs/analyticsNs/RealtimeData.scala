package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[gapiDotClientDotAnalyticsLib.Anon_ColumnType]] = js.undefined
  /** Unique ID for this data response. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information for the view (profile), for which the real time data was requested. */
  var profileInfo: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_AccountId] = js.undefined
  /** Real time data request query parameters. */
  var query: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_DimensionsFilters] = js.undefined
  /**
    * Real time data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
    * specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /** Link to this page. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as
    * the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object RealtimeData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[gapiDotClientDotAnalyticsLib.Anon_ColumnType] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    profileInfo: gapiDotClientDotAnalyticsLib.Anon_AccountId = null,
    query: gapiDotClientDotAnalyticsLib.Anon_DimensionsFilters = null,
    rows: js.Array[js.Array[java.lang.String]] = null,
    selfLink: java.lang.String = null,
    totalResults: scala.Int | scala.Double = null,
    totalsForAllResults: stdLib.Record[java.lang.String, java.lang.String] = null
  ): RealtimeData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo)
    if (query != null) __obj.updateDynamic("query")(query)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults)
    __obj.asInstanceOf[RealtimeData]
  }
}


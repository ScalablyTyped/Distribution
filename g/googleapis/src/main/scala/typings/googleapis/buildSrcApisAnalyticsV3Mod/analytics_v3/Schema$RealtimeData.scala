package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_AccountId
import typings.googleapis.Anon_ColumnType
import typings.googleapis.Anon_DimensionsFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Real time data for a given view (profile).
  */
@js.native
trait Schema$RealtimeData extends js.Object {
  /**
    * Column headers that list dimension names followed by the metric names.
    * The order of dimensions and metrics is same as specified in the request.
    */
  var columnHeaders: js.UndefOr[js.Array[Anon_ColumnType]] = js.native
  /**
    * Unique ID for this data response.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information for the view (profile), for which the real time data was
    * requested.
    */
  var profileInfo: js.UndefOr[Anon_AccountId] = js.native
  /**
    * Real time data request query parameters.
    */
  var query: js.UndefOr[Anon_DimensionsFilters] = js.native
  /**
    * Real time data rows, where each row contains a list of dimension values
    * followed by the metric values. The order of dimensions and metrics is
    * same as specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Link to this page.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The total number of rows for the query, regardless of the number of rows
    * in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
  /**
    * Total values for the requested metrics over all the results, not just the
    * results returned in this response. The order of the metric totals is same
    * as the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$RealtimeData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[Anon_ColumnType] = null,
    id: String = null,
    kind: String = null,
    profileInfo: Anon_AccountId = null,
    query: Anon_DimensionsFilters = null,
    rows: js.Array[js.Array[String]] = null,
    selfLink: String = null,
    totalResults: Int | Double = null,
    totalsForAllResults: StringDictionary[String] = null
  ): Schema$RealtimeData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RealtimeData]
  }
}


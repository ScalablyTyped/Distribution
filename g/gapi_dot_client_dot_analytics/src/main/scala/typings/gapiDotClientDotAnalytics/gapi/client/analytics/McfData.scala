package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClientDotAnalytics.Anon_AccountId
import typings.gapiDotClientDotAnalytics.Anon_ColumnType
import typings.gapiDotClientDotAnalytics.Anon_ConversionPathValue
import typings.gapiDotClientDotAnalytics.Anon_Dimensions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[Anon_ColumnType]] = js.undefined
  /** Determines if the Analytics data contains sampled data. */
  var containsSampledData: js.UndefOr[Boolean] = js.undefined
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value
    * of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Link to next page for this Analytics data query. */
  var nextLink: js.UndefOr[String] = js.undefined
  /** Link to previous page for this Analytics data query. */
  var previousLink: js.UndefOr[String] = js.undefined
  /** Information for the view (profile), for which the Analytics data was requested. */
  var profileInfo: js.UndefOr[Anon_AccountId] = js.undefined
  /** Analytics data request query parameters. */
  var query: js.UndefOr[Anon_Dimensions] = js.undefined
  /**
    * Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
    * specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[Anon_ConversionPathValue]]] = js.undefined
  /** The number of samples used to calculate the result. */
  var sampleSize: js.UndefOr[String] = js.undefined
  /** Total size of the sample space from which the samples were selected. */
  var sampleSpace: js.UndefOr[String] = js.undefined
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.undefined
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as
    * the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[Record[String, String]] = js.undefined
}

object McfData {
  @scala.inline
  def apply(
    columnHeaders: js.Array[Anon_ColumnType] = null,
    containsSampledData: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    profileInfo: Anon_AccountId = null,
    query: Anon_Dimensions = null,
    rows: js.Array[js.Array[Anon_ConversionPathValue]] = null,
    sampleSize: String = null,
    sampleSpace: String = null,
    selfLink: String = null,
    totalResults: Int | Double = null,
    totalsForAllResults: Record[String, String] = null
  ): McfData = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (!js.isUndefined(containsSampledData)) __obj.updateDynamic("containsSampledData")(containsSampledData)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink)
    if (profileInfo != null) __obj.updateDynamic("profileInfo")(profileInfo)
    if (query != null) __obj.updateDynamic("query")(query)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize)
    if (sampleSpace != null) __obj.updateDynamic("sampleSpace")(sampleSpace)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (totalsForAllResults != null) __obj.updateDynamic("totalsForAllResults")(totalsForAllResults)
    __obj.asInstanceOf[McfData]
  }
}


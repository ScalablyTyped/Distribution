package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait McfData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[gapiDotClientDotAnalyticsLib.Anon_Name]] = js.undefined
  /** Determines if the Analytics data contains sampled data. */
  var containsSampledData: js.UndefOr[scala.Boolean] = js.undefined
  /** Unique ID for this data response. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value
               * of 1000 by default, or otherwise specified by the max-results query parameter.
               */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to next page for this Analytics data query. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** Link to previous page for this Analytics data query. */
  var previousLink: js.UndefOr[java.lang.String] = js.undefined
  /** Information for the view (profile), for which the Analytics data was requested. */
  var profileInfo: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_ProfileIdProfileName] = js.undefined
  /** Analytics data request query parameters. */
  var query: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_MaxresultsStartindexSamplingLevel] = js.undefined
  /**
               * Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
               * specified in the request.
               */
  var rows: js.UndefOr[js.Array[js.Array[gapiDotClientDotAnalyticsLib.Anon_ConversionPathValue]]] = js.undefined
  /** The number of samples used to calculate the result. */
  var sampleSize: js.UndefOr[java.lang.String] = js.undefined
  /** Total size of the sample space from which the samples were selected. */
  var sampleSpace: js.UndefOr[java.lang.String] = js.undefined
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


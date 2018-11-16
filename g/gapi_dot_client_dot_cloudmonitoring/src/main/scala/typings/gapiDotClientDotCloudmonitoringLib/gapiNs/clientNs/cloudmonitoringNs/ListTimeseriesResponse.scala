package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListTimeseriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, set the
               * pageToken query parameter to this value. All of the points of a time series will be returned before returning any point of the subsequent time series.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The oldest timestamp of the interval of this query as an RFC 3339 string. */
  var oldest: js.UndefOr[java.lang.String] = js.undefined
  /** The returned time series. */
  var timeseries: js.UndefOr[js.Array[Timeseries]] = js.undefined
  /** The youngest timestamp of the interval of this query as an RFC 3339 string. */
  var youngest: js.UndefOr[java.lang.String] = js.undefined
}


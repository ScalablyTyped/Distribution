package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTimeseriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, set the
    * pageToken query parameter to this value. All of the points of a time series will be returned before returning any point of the subsequent time series.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The oldest timestamp of the interval of this query as an RFC 3339 string. */
  var oldest: js.UndefOr[String] = js.undefined
  /** The returned time series. */
  var timeseries: js.UndefOr[js.Array[Timeseries]] = js.undefined
  /** The youngest timestamp of the interval of this query as an RFC 3339 string. */
  var youngest: js.UndefOr[String] = js.undefined
}

object ListTimeseriesResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    oldest: String = null,
    timeseries: js.Array[Timeseries] = null,
    youngest: String = null
  ): ListTimeseriesResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (oldest != null) __obj.updateDynamic("oldest")(oldest.asInstanceOf[js.Any])
    if (timeseries != null) __obj.updateDynamic("timeseries")(timeseries.asInstanceOf[js.Any])
    if (youngest != null) __obj.updateDynamic("youngest")(youngest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimeseriesResponse]
  }
}


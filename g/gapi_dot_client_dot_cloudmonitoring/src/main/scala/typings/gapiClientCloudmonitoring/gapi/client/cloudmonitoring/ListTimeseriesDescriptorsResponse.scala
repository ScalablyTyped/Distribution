package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTimeseriesDescriptorsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listTimeseriesDescriptorsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, set this
    * value to the pageToken query parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The oldest timestamp of the interval of this query, as an RFC 3339 string. */
  var oldest: js.UndefOr[String] = js.undefined
  /** The returned time series descriptors. */
  var timeseries: js.UndefOr[js.Array[TimeseriesDescriptor]] = js.undefined
  /** The youngest timestamp of the interval of this query, as an RFC 3339 string. */
  var youngest: js.UndefOr[String] = js.undefined
}

object ListTimeseriesDescriptorsResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    oldest: String = null,
    timeseries: js.Array[TimeseriesDescriptor] = null,
    youngest: String = null
  ): ListTimeseriesDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (oldest != null) __obj.updateDynamic("oldest")(oldest.asInstanceOf[js.Any])
    if (timeseries != null) __obj.updateDynamic("timeseries")(timeseries.asInstanceOf[js.Any])
    if (youngest != null) __obj.updateDynamic("youngest")(youngest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimeseriesDescriptorsResponse]
  }
}


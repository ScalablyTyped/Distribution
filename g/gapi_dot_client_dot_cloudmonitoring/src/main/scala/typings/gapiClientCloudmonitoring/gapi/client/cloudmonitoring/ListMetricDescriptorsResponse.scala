package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricDescriptorsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listMetricDescriptorsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The returned metric descriptors. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, pass this
    * value to the pageToken query parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListMetricDescriptorsResponse {
  @scala.inline
  def apply(kind: String = null, metrics: js.Array[MetricDescriptor] = null, nextPageToken: String = null): ListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetricDescriptorsResponse]
  }
}


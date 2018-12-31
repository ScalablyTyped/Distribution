package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricDescriptorsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listMetricDescriptorsResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The returned metric descriptors. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, pass this
    * value to the pageToken query parameter.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


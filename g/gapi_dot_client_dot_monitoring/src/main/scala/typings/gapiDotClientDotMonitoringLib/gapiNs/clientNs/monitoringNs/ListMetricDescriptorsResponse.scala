package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListMetricDescriptorsResponse extends js.Object {
  /** The metric descriptors that are available to the project and that match the value of filter, if present. */
  var metricDescriptors: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  /**
               * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
               * pageToken in the next call to this method.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


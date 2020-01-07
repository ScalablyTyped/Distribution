package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListMetricDescriptors response.
  */
@js.native
trait Schema$ListMetricDescriptorsResponse extends js.Object {
  /**
    * The metric descriptors that are available to the project and that match
    * the value of filter, if present.
    */
  var metricDescriptors: js.UndefOr[js.Array[Schema$MetricDescriptor]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListMetricDescriptorsResponse {
  @scala.inline
  def apply(metricDescriptors: js.Array[Schema$MetricDescriptor] = null, nextPageToken: String = null): Schema$ListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    if (metricDescriptors != null) __obj.updateDynamic("metricDescriptors")(metricDescriptors.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListMetricDescriptorsResponse]
  }
}


package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMetricDescriptorsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "cloudmonitoring#listMetricDescriptorsResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The returned metric descriptors. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.native
  /**
    * Pagination token. If present, indicates that additional results are available for retrieval. To access the results past the pagination limit, pass this
    * value to the pageToken query parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListMetricDescriptorsResponse {
  @scala.inline
  def apply(): ListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricDescriptorsResponse]
  }
  @scala.inline
  implicit class ListMetricDescriptorsResponseOps[Self <: ListMetricDescriptorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: MetricDescriptor*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[MetricDescriptor]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


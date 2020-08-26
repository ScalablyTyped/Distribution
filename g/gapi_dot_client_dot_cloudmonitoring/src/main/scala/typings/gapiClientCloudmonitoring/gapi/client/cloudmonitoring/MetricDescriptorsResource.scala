package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudmonitoring.anon.Alt
import typings.gapiClientCloudmonitoring.anon.Count
import typings.gapiClientCloudmonitoring.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: Alt): Request[MetricDescriptor] = js.native
  /** Delete an existing metric. */
  def delete(request: Fields): Request[DeleteMetricDescriptorResponse] = js.native
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: Count): Request[ListMetricDescriptorsResponse] = js.native
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: Alt => Request[MetricDescriptor],
    delete: Fields => Request[DeleteMetricDescriptorResponse],
    list: Count => Request[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
  @scala.inline
  implicit class MetricDescriptorsResourceOps[Self <: MetricDescriptorsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[MetricDescriptor]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[DeleteMetricDescriptorResponse]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Count => Request[ListMetricDescriptorsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


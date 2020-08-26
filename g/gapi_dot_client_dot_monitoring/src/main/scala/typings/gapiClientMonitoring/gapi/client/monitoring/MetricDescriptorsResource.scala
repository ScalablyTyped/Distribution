package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: Accesstoken): Request[MetricDescriptor] = js.native
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: Accesstoken): Request[MetricDescriptor] = js.native
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Callback): Request[ListMetricDescriptorsResponse] = js.native
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[MetricDescriptor],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[MetricDescriptor],
    list: Callback => Request[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
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
    def setCreate(value: Accesstoken => Request[MetricDescriptor]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[MetricDescriptor]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListMetricDescriptorsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: Accesstoken): Request[MetricDescriptor]
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: Accesstoken): Request[js.Object]
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: Accesstoken): Request[MetricDescriptor]
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Callback): Request[ListMetricDescriptorsResponse]
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
}


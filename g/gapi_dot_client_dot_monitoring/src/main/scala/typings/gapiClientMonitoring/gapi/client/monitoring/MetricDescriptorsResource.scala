package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAccesstoken
import typings.gapiClientMonitoring.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: AnonAccesstoken): Request_[MetricDescriptor]
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: AnonAccesstoken): Request_[MetricDescriptor]
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[MetricDescriptor],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[MetricDescriptor],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}


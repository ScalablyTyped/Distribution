package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMonitoring.Anon_Accesstoken
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Creates a new metric descriptor. User-created metric descriptors define custom metrics. */
  def create(request: Anon_Accesstoken): Request[MetricDescriptor]
  /** Deletes a metric descriptor. Only user-created custom metrics can be deleted. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Gets a single metric descriptor. This method does not require a Stackdriver account. */
  def get(request: Anon_Accesstoken): Request[MetricDescriptor]
  /** Lists metric descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[MetricDescriptor],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[MetricDescriptor],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}


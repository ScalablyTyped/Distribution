package typings.gapiDotClientDotCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudmonitoring.Anon_Alt
import typings.gapiDotClientDotCloudmonitoring.Anon_AltCount
import typings.gapiDotClientDotCloudmonitoring.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: Anon_Alt): Request[MetricDescriptor]
  /** Delete an existing metric. */
  def delete(request: Anon_AltFields): Request[DeleteMetricDescriptorResponse]
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: Anon_AltCount): Request[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[MetricDescriptor],
    delete: Anon_AltFields => Request[DeleteMetricDescriptorResponse],
    list: Anon_AltCount => Request[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}


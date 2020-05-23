package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudmonitoring.anon.Alt
import typings.gapiClientCloudmonitoring.anon.Count
import typings.gapiClientCloudmonitoring.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: Alt): Request[MetricDescriptor]
  /** Delete an existing metric. */
  def delete(request: Fields): Request[DeleteMetricDescriptorResponse]
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: Count): Request[ListMetricDescriptorsResponse]
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
}


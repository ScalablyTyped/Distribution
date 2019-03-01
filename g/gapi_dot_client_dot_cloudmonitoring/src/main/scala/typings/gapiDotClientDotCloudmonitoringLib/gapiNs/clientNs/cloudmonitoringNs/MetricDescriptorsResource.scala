package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: gapiDotClientDotCloudmonitoringLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor]
  /** Delete an existing metric. */
  def delete(request: gapiDotClientDotCloudmonitoringLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DeleteMetricDescriptorResponse]
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: gapiDotClientDotCloudmonitoringLib.Anon_AltCount): gapiDotClientLib.gapiNs.clientNs.Request[ListMetricDescriptorsResponse]
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MetricDescriptor]
    ],
    delete: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeleteMetricDescriptorResponse]
    ],
    list: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_AltCount, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListMetricDescriptorsResponse]
    ]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
}


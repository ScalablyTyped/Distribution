package typings.gapiDotClientDotLogging.gapi.client.logging

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotLogging.Anon_Accesstoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotLogging.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: Anon_Accesstoken): Request[LogMetric]
  /** Deletes a logs-based metric. */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request[js.Object]
  /** Gets a logs-based metric. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request[LogMetric]
  /** Lists logs-based metrics. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListLogMetricsResponse]
  /** Creates or updates a logs-based metric. */
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request[LogMetric]
}

object MetricsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[LogMetric],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request[LogMetric],
    list: Anon_AccesstokenAltBearertoken => Request[ListLogMetricsResponse],
    update: Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MetricsResource]
  }
}


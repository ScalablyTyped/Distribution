package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: gapiDotClientDotLoggingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[LogMetric]
  /** Deletes a logs-based metric. */
  def delete(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a logs-based metric. */
  def get(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): gapiDotClientLib.gapiNs.clientNs.Request[LogMetric]
  /** Lists logs-based metrics. */
  def list(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListLogMetricsResponse]
  /** Creates or updates a logs-based metric. */
  def update(request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName): gapiDotClientLib.gapiNs.clientNs.Request[LogMetric]
}

object MetricsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotLoggingLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[LogMetric],
    delete: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => gapiDotClientLib.gapiNs.clientNs.Request[LogMetric],
    list: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListLogMetricsResponse],
    update: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyMetricName => gapiDotClientLib.gapiNs.clientNs.Request[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MetricsResource]
  }
}


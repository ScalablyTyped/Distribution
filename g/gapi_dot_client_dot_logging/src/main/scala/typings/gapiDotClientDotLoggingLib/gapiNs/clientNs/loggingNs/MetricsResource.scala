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


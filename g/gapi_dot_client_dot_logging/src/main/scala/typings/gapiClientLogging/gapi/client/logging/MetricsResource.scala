package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.Accesstoken
import typings.gapiClientLogging.anon.Bearertoken
import typings.gapiClientLogging.anon.MetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: Accesstoken): Request[LogMetric]
  /** Deletes a logs-based metric. */
  def delete(request: MetricName): Request[js.Object]
  /** Gets a logs-based metric. */
  def get(request: MetricName): Request[LogMetric]
  /** Lists logs-based metrics. */
  def list(request: Bearertoken): Request[ListLogMetricsResponse]
  /** Creates or updates a logs-based metric. */
  def update(request: MetricName): Request[LogMetric]
}

object MetricsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[LogMetric],
    delete: MetricName => Request[js.Object],
    get: MetricName => Request[LogMetric],
    list: Bearertoken => Request[ListLogMetricsResponse],
    update: MetricName => Request[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MetricsResource]
  }
}


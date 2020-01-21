package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertoken
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: AnonAccesstoken): Request_[LogMetric]
  /** Deletes a logs-based metric. */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request_[js.Object]
  /** Gets a logs-based metric. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request_[LogMetric]
  /** Lists logs-based metrics. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListLogMetricsResponse]
  /** Creates or updates a logs-based metric. */
  def update(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName): Request_[LogMetric]
}

object MetricsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[LogMetric],
    delete: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request_[LogMetric],
    list: AnonAccesstokenAltBearertoken => Request_[ListLogMetricsResponse],
    update: AnonAccesstokenAltBearertokenCallbackFieldsKeyMetricName => Request_[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MetricsResource]
  }
}


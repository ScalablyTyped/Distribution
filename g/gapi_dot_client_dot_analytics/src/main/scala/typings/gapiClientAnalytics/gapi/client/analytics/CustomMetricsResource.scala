package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonCustomMetricId
import typings.gapiClientAnalytics.AnonPrettyPrint
import typings.gapiClientAnalytics.AnonQuotaUser
import typings.gapiClientAnalytics.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: AnonCustomMetricId): Request_[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: AnonQuotaUser): Request_[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AnonUserIp): Request_[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: AnonUserIp): Request_[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: AnonCustomMetricId => Request_[CustomMetric],
    insert: AnonQuotaUser => Request_[CustomMetric],
    list: AnonPrettyPrint => Request_[CustomMetrics],
    patch: AnonUserIp => Request_[CustomMetric],
    update: AnonUserIp => Request_[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomMetricsResource]
  }
}


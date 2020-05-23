package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.CustomMetricId
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: CustomMetricId): Request[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: QuotaUser): Request[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: PrettyPrint): Request[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: UserIp): Request[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: UserIp): Request[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: CustomMetricId => Request[CustomMetric],
    insert: QuotaUser => Request[CustomMetric],
    list: PrettyPrint => Request[CustomMetrics],
    patch: UserIp => Request[CustomMetric],
    update: UserIp => Request[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomMetricsResource]
  }
}


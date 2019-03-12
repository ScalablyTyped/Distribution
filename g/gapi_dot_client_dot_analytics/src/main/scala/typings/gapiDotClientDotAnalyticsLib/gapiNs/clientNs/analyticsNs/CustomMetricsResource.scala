package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricId): gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricId => gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults => gapiDotClientLib.gapiNs.clientNs.Request[CustomMetrics],
    patch: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltCustomMetricIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomMetricsResource]
  }
}


package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltCustomMetricId
import typings.gapiClientAnalytics.AnonAccountIdAltCustomMetricIdFields
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresults
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: AnonAccountIdAltCustomMetricId): Request_[CustomMetric]
  /** Create a new custom metric. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[CustomMetric]
  /** Lists custom metrics to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresults): Request_[CustomMetrics]
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltCustomMetricIdFields): Request_[CustomMetric]
  /** Updates an existing custom metric. */
  def update(request: AnonAccountIdAltCustomMetricIdFields): Request_[CustomMetric]
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: AnonAccountIdAltCustomMetricId => Request_[CustomMetric],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[CustomMetric],
    list: AnonAccountIdAltFieldsKeyMaxresults => Request_[CustomMetrics],
    patch: AnonAccountIdAltCustomMetricIdFields => Request_[CustomMetric],
    update: AnonAccountIdAltCustomMetricIdFields => Request_[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CustomMetricsResource]
  }
}


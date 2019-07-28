package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetricsCollection extends js.Object {
  // Get a custom metric to which the user has access.
  def get(accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  // Create a new custom metric.
  def insert(resource: CustomMetric, accountId: String, webPropertyId: String): CustomMetric = js.native
  // Lists custom metrics to which the user has access.
  def list(accountId: String, webPropertyId: String): CustomMetrics = js.native
  // Lists custom metrics to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): CustomMetrics = js.native
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(resource: CustomMetric, accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(
    resource: CustomMetric,
    accountId: String,
    webPropertyId: String,
    customMetricId: String,
    optionalArgs: js.Object
  ): CustomMetric = js.native
  // Updates an existing custom metric.
  def update(resource: CustomMetric, accountId: String, webPropertyId: String, customMetricId: String): CustomMetric = js.native
  // Updates an existing custom metric.
  def update(
    resource: CustomMetric,
    accountId: String,
    webPropertyId: String,
    customMetricId: String,
    optionalArgs: js.Object
  ): CustomMetric = js.native
}


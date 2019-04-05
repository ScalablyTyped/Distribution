package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetricsCollection extends js.Object {
  // Get a custom metric to which the user has access.
  def get(accountId: java.lang.String, webPropertyId: java.lang.String, customMetricId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
  // Create a new custom metric.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric,
    accountId: java.lang.String,
    webPropertyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
  // Lists custom metrics to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetrics = js.native
  // Lists custom metrics to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetrics = js.native
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customMetricId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
  // Updates an existing custom metric. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customMetricId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
  // Updates an existing custom metric.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customMetricId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
  // Updates an existing custom metric.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customMetricId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.CustomMetric = js.native
}


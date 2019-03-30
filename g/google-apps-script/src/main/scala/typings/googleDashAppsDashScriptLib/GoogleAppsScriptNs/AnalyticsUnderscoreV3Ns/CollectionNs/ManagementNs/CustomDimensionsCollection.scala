package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDimensionsCollection extends js.Object {
  // Get a custom dimension to which the user has access.
  def get(accountId: java.lang.String, webPropertyId: java.lang.String, customDimensionId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
  // Create a new custom dimension.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension,
    accountId: java.lang.String,
    webPropertyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
  // Lists custom dimensions to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimensions = js.native
  // Lists custom dimensions to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimensions = js.native
  // Updates an existing custom dimension. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDimensionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
  // Updates an existing custom dimension. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDimensionId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
  // Updates an existing custom dimension.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDimensionId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
  // Updates an existing custom dimension.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDimensionId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.CustomDimension = js.native
}


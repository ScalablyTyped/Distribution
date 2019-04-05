package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersCollection extends js.Object {
  // Returns a filters to which the user has access.
  def get(accountId: java.lang.String, filterId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter = js.native
  // Create a new filter.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter = js.native
  // Lists all filters for an account
  def list(accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filters = js.native
  // Lists all filters for an account
  def list(accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filters = js.native
  // Updates an existing filter. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter,
    accountId: java.lang.String,
    filterId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter = js.native
  // Delete a filter.
  def remove(accountId: java.lang.String, filterId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter = js.native
  // Updates an existing filter.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter,
    accountId: java.lang.String,
    filterId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Filter = js.native
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfigurationsCollection extends js.Object {
  // Gets one floodlight configuration by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfiguration = js.native
  // Retrieves a list of floodlight configurations, possibly filtered.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfigurationsListResponse = js.native
  // Retrieves a list of floodlight configurations, possibly filtered.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfigurationsListResponse = js.native
  // Updates an existing floodlight configuration. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfiguration,
    profileId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfiguration = js.native
  // Updates an existing floodlight configuration.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfiguration,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FloodlightConfiguration = js.native
}


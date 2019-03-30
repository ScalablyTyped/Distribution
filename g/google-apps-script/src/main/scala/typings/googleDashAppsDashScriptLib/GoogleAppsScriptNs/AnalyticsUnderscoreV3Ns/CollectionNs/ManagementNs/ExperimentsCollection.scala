package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentsCollection extends js.Object {
  // Returns an experiment to which the user has access.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    experimentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment = js.native
  // Create a new experiment.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment = js.native
  // Lists experiments to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiments = js.native
  // Lists experiments to which the user has access.
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiments = js.native
  // Update an existing experiment. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    experimentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment = js.native
  // Delete an experiment.
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    experimentId: java.lang.String
  ): scala.Unit = js.native
  // Update an existing experiment.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    experimentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Experiment = js.native
}


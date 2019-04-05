package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturesCollection extends js.Object {
  // Retrieves a feature.
  def get(customer: java.lang.String, featureKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature = js.native
  // Inserts a feature.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature,
    customer: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature = js.native
  // Retrieves a list of features for an account.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Features = js.native
  // Retrieves a list of features for an account.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Features = js.native
  // Updates a feature. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature,
    customer: java.lang.String,
    featureKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature = js.native
  // Deletes a feature.
  def remove(customer: java.lang.String, featureKey: java.lang.String): scala.Unit = js.native
  // Renames a feature.
  def rename(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.FeatureRename,
    customer: java.lang.String,
    oldName: java.lang.String
  ): scala.Unit = js.native
  // Updates a feature.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature,
    customer: java.lang.String,
    featureKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature = js.native
}


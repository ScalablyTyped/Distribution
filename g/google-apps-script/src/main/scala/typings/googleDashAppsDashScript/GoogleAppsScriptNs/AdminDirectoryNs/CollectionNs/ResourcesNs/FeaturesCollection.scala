package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Feature
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.FeatureRename
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturesCollection extends js.Object {
  // Retrieves a feature.
  def get(customer: String, featureKey: String): Feature = js.native
  // Inserts a feature.
  def insert(resource: Feature, customer: String): Feature = js.native
  // Retrieves a list of features for an account.
  def list(customer: String): Features = js.native
  // Retrieves a list of features for an account.
  def list(customer: String, optionalArgs: js.Object): Features = js.native
  // Updates a feature. This method supports patch semantics.
  def patch(resource: Feature, customer: String, featureKey: String): Feature = js.native
  // Deletes a feature.
  def remove(customer: String, featureKey: String): Unit = js.native
  // Renames a feature.
  def rename(resource: FeatureRename, customer: String, oldName: String): Unit = js.native
  // Updates a feature.
  def update(resource: Feature, customer: String, featureKey: String): Feature = js.native
}


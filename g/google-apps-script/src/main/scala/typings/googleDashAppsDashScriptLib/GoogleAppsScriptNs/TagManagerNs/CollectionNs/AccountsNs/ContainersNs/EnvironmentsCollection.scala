package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentsCollection extends js.Object {
  // Creates a GTM Environment.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment = js.native
  // Gets a GTM Environment.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment = js.native
  // Lists all GTM Environments of a GTM Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListEnvironmentsResponse = js.native
  // Lists all GTM Environments of a GTM Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListEnvironmentsResponse = js.native
  // Re-generates the authorization code for a GTM Environment.
  def reauthorize(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment = js.native
  // Deletes a GTM Environment.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Updates a GTM Environment.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment = js.native
  // Updates a GTM Environment.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment = js.native
}


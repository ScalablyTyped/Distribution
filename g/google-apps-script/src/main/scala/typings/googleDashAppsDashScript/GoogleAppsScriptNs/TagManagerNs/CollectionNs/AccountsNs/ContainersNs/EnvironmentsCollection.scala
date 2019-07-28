package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Environment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListEnvironmentsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentsCollection extends js.Object {
  // Creates a GTM Environment.
  def create(resource: Environment, parent: String): Environment = js.native
  // Gets a GTM Environment.
  def get(path: String): Environment = js.native
  // Lists all GTM Environments of a GTM Container.
  def list(parent: String): ListEnvironmentsResponse = js.native
  // Lists all GTM Environments of a GTM Container.
  def list(parent: String, optionalArgs: js.Object): ListEnvironmentsResponse = js.native
  // Re-generates the authorization code for a GTM Environment.
  def reauthorize(resource: Environment, path: String): Environment = js.native
  // Deletes a GTM Environment.
  def remove(path: String): Unit = js.native
  // Updates a GTM Environment.
  def update(resource: Environment, path: String): Environment = js.native
  // Updates a GTM Environment.
  def update(resource: Environment, path: String, optionalArgs: js.Object): Environment = js.native
}


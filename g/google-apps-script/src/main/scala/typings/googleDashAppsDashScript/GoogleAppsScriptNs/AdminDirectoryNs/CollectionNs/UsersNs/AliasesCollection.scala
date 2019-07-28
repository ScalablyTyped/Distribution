package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Alias
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Aliases
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesCollection extends js.Object {
  // Add a alias for the user
  def insert(resource: Alias, userKey: String): Alias = js.native
  // List all aliases for a user
  def list(userKey: String): Aliases = js.native
  // List all aliases for a user
  def list(userKey: String, optionalArgs: js.Object): Aliases = js.native
  // Remove a alias for the user
  def remove(userKey: String, alias: String): Unit = js.native
  // Watch for changes in user aliases list
  def watch(resource: Channel, userKey: String): Channel = js.native
  // Watch for changes in user aliases list
  def watch(resource: Channel, userKey: String, optionalArgs: js.Object): Channel = js.native
}


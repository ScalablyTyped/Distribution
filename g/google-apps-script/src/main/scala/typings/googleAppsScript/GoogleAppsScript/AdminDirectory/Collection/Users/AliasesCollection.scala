package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Users

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Aliases
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

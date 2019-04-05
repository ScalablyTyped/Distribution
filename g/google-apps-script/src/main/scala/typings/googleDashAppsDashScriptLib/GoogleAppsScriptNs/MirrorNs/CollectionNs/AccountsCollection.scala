package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCollection extends js.Object {
  // Inserts a new account for a user
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account,
    userToken: java.lang.String,
    accountType: java.lang.String,
    accountName: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account
}

object AccountsCollection {
  @scala.inline
  def apply(
    insert: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account, java.lang.String, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Account
  ): AccountsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
  
    __obj.asInstanceOf[AccountsCollection]
  }
}


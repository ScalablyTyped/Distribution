package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensCollection extends js.Object {
  // Get information about an access token issued by a user.
  def get(userKey: java.lang.String, clientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Token
  // Returns the set of tokens specified user has issued to 3rd party applications.
  def list(userKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Tokens
  // Delete all access tokens issued by a user for an application.
  def remove(userKey: java.lang.String, clientId: java.lang.String): scala.Unit
}

object TokensCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Token,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Tokens,
    remove: (java.lang.String, java.lang.String) => scala.Unit
  ): TokensCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[TokensCollection]
  }
}


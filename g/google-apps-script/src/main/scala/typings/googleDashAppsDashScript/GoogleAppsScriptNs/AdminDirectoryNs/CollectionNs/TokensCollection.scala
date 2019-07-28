package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Token
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Tokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensCollection extends js.Object {
  // Get information about an access token issued by a user.
  def get(userKey: String, clientId: String): Token
  // Returns the set of tokens specified user has issued to 3rd party applications.
  def list(userKey: String): Tokens
  // Delete all access tokens issued by a user for an application.
  def remove(userKey: String, clientId: String): Unit
}

object TokensCollection {
  @scala.inline
  def apply(get: (String, String) => Token, list: String => Tokens, remove: (String, String) => Unit): TokensCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[TokensCollection]
  }
}


package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "AuthClientTwoLegged")
@js.native
class AuthClientTwoLegged protected () extends AuthClient {
  def this(clientId: String, clientSecret: String, scopes: js.Array[Scope], autoRefresh: Boolean) = this()
  
  def authenticate(): js.Promise[AuthToken] = js.native
  
  def getCredentials(): AuthToken = js.native
  
  def isAuthorized(): Boolean = js.native
  
  def setCredentials(credentials: AuthToken): Unit = js.native
}

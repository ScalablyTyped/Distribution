package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "AuthClientTwoLegged")
@js.native
class AuthClientTwoLegged protected () extends js.Object {
  def this(clientId: String, clientSecret: String, scope: js.Array[String]) = this()
  def authenticate(): js.Promise[AuthToken] = js.native
  def getCredentials(): AuthToken = js.native
  def isAuthorized(): Boolean = js.native
  def setCredentials(credentials: AuthToken): Unit = js.native
}


package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "AuthClientTwoLegged")
@js.native
class AuthClientTwoLegged protected () extends js.Object {
  def this(clientId: java.lang.String, clientSecret: java.lang.String, scope: js.Array[java.lang.String]) = this()
  def authenticate(): js.Promise[AuthToken] = js.native
  def getCredentials(): AuthToken = js.native
  def isAuthorized(): scala.Boolean = js.native
  def setCredentials(credentials: AuthToken): scala.Unit = js.native
}


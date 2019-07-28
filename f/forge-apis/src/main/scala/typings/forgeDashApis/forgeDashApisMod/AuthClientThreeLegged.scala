package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "AuthClientThreeLegged")
@js.native
class AuthClientThreeLegged protected () extends js.Object {
  def this(clientId: String, clientSecret: String, redirectUri: String, scope: js.Array[String]) = this()
  def generateAuthUrl(): String = js.native
  def getToken(code: String): js.Promise[AuthToken] = js.native
  def refreshToken(credentials: AuthToken): js.Promise[AuthToken] = js.native
}


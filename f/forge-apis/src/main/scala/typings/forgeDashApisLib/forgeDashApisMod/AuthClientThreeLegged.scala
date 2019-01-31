package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "AuthClientThreeLegged")
@js.native
class AuthClientThreeLegged protected () extends js.Object {
  def this(clientId: java.lang.String, clientSecret: java.lang.String, redirectUri: java.lang.String, scope: js.Array[java.lang.String]) = this()
  def generateAuthUrl(): java.lang.String = js.native
  def getToken(code: java.lang.String): js.Promise[AuthToken] = js.native
  def refreshToken(credentials: AuthToken): js.Promise[AuthToken] = js.native
}


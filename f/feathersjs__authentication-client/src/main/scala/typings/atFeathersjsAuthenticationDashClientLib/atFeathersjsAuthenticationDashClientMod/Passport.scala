package typings
package atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Passport extends js.Object {
  def authenticate(): js.Any = js.native
  def authenticate(credentials: FeathersAuthCredentials): js.Any = js.native
  def authenticateSocket(credentials: FeathersAuthCredentials, socket: js.Any, emit: js.Any): js.Any = js.native
  def clearCookie(name: java.lang.String): scala.Null = js.native
  def connected(): js.Promise[_] = js.native
  def getCookie(name: java.lang.String): java.lang.String = js.native
  def getJWT(): js.Promise[_] = js.native
  def getStorage(storage: js.Any): js.Any = js.native
  def logout(): js.Promise[_] = js.native
  def logoutSocket(socket: js.Any, emit: js.Any): js.Promise[_] = js.native
  def payloadIsValid(payload: java.lang.String): scala.Boolean = js.native
  def setJWT(data: js.Any): js.Promise[_] = js.native
  def setupSocketListeners(): scala.Unit = js.native
  def verifyJWT(token: java.lang.String): js.Promise[_] = js.native
}


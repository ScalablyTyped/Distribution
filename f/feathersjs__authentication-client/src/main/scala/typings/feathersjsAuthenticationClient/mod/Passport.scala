package typings.feathersjsAuthenticationClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Passport extends js.Object {
  def authenticate(): js.Any = js.native
  def authenticate(credentials: FeathersAuthCredentials): js.Any = js.native
  def authenticateSocket(credentials: FeathersAuthCredentials, socket: js.Any, emit: js.Any): js.Any = js.native
  def clearCookie(name: String): Null = js.native
  def connected(): js.Promise[_] = js.native
  def getCookie(name: String): String = js.native
  def getJWT(): js.Promise[_] = js.native
  def getStorage(storage: js.Any): js.Any = js.native
  def logout(): js.Promise[_] = js.native
  def logoutSocket(socket: js.Any, emit: js.Any): js.Promise[_] = js.native
  def payloadIsValid(payload: String): Boolean = js.native
  def setJWT(data: js.Any): js.Promise[_] = js.native
  def setupSocketListeners(): Unit = js.native
  def verifyJWT(token: String): js.Promise[_] = js.native
}


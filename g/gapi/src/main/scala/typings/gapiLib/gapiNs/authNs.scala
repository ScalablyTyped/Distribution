package typings
package gapiLib.gapiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth")
@js.native
object authNs extends js.Object {
  def authorize(
    params: gapiLib.Anon_Scope,
    callback: js.Function1[/* token */ gapiLib.GoogleApiOAuth2TokenObject, _]
  ): scala.Unit = js.native
  def getToken(): gapiLib.GoogleApiOAuth2TokenObject = js.native
  def init(callback: js.Function0[_]): scala.Unit = js.native
  def setToken(token: gapiLib.GoogleApiOAuth2TokenObject): scala.Unit = js.native
  def signIn(params: gapiLib.Anon_Includegrantedscopes): scala.Unit = js.native
  def signOut(): scala.Unit = js.native
}


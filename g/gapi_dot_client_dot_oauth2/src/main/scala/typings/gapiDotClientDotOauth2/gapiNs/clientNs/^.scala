package typings.gapiDotClientDotOauth2.gapiNs.clientNs

import typings.gapiDotClientDotOauth2.gapiDotClientDotOauth2Strings.oauth2
import typings.gapiDotClientDotOauth2.gapiDotClientDotOauth2Strings.v2
import typings.gapiDotClientDotOauth2.gapiNs.clientNs.oauth2Ns.UserinfoResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val userinfo: UserinfoResource = js.native
  /** Load Google OAuth2 API v2 */
  def load(name: oauth2, version: v2): js.Thenable[Unit] = js.native
  def load(name: oauth2, version: v2, callback: js.Function0[_]): Unit = js.native
}


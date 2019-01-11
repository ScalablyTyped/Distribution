package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val userinfo: gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns.UserinfoResource = js.native
  /** Load Google OAuth2 API v2 */
  def load(
    name: gapiDotClientDotOauth2Lib.gapiDotClientDotOauth2LibStrings.oauth2,
    version: gapiDotClientDotOauth2Lib.gapiDotClientDotOauth2LibStrings.v2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotOauth2Lib.gapiDotClientDotOauth2LibStrings.oauth2,
    version: gapiDotClientDotOauth2Lib.gapiDotClientDotOauth2LibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


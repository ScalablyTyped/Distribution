package typings.gapiDotClientDotTagmanager.gapiNs.clientNs

import typings.gapiDotClientDotTagmanager.gapiDotClientDotTagmanagerStrings.tagmanager
import typings.gapiDotClientDotTagmanager.gapiDotClientDotTagmanagerStrings.v2
import typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs.AccountsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  /** Load Tag Manager API v2 */
  def load(name: tagmanager, version: v2): js.Thenable[Unit] = js.native
  def load(name: tagmanager, version: v2, callback: js.Function0[_]): Unit = js.native
}


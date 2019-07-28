package typings.gapiDotClientDotPlaycustomapp.gapiNs.clientNs

import typings.gapiDotClientDotPlaycustomapp.gapiDotClientDotPlaycustomappStrings.playcustomapp
import typings.gapiDotClientDotPlaycustomapp.gapiDotClientDotPlaycustomappStrings.v1
import typings.gapiDotClientDotPlaycustomapp.gapiNs.clientNs.playcustomappNs.AccountsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  /** Load Google Play Custom App Publishing API v1 */
  def load(name: playcustomapp, version: v1): js.Thenable[Unit] = js.native
  def load(name: playcustomapp, version: v1, callback: js.Function0[_]): Unit = js.native
}


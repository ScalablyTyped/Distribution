package typings.gapiDotClientDotPlaymoviespartner.gapiNs.clientNs

import typings.gapiDotClientDotPlaymoviespartner.gapiDotClientDotPlaymoviespartnerStrings.playmoviespartner
import typings.gapiDotClientDotPlaymoviespartner.gapiDotClientDotPlaymoviespartnerStrings.v1
import typings.gapiDotClientDotPlaymoviespartner.gapiNs.clientNs.playmoviespartnerNs.AccountsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  /** Load Google Play Movies Partner API v1 */
  def load(name: playmoviespartner, version: v1): js.Thenable[Unit] = js.native
  def load(name: playmoviespartner, version: v1, callback: js.Function0[_]): Unit = js.native
}


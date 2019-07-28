package typings.gapiDotClientDotVault.gapiNs.clientNs

import typings.gapiDotClientDotVault.gapiDotClientDotVaultStrings.v1
import typings.gapiDotClientDotVault.gapiDotClientDotVaultStrings.vault
import typings.gapiDotClientDotVault.gapiNs.clientNs.vaultNs.MattersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val matters: MattersResource = js.native
  /** Load Google Vault API v1 */
  def load(name: vault, version: v1): js.Thenable[Unit] = js.native
  def load(name: vault, version: v1, callback: js.Function0[_]): Unit = js.native
}


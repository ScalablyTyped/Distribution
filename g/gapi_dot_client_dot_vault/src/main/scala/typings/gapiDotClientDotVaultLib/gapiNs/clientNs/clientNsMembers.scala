package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val matters: gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs.MattersResource = js.native
  /** Load Google Vault API v1 */
  def load(
    name: gapiDotClientDotVaultLib.gapiDotClientDotVaultLibStrings.vault,
    version: gapiDotClientDotVaultLib.gapiDotClientDotVaultLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotVaultLib.gapiDotClientDotVaultLibStrings.vault,
    version: gapiDotClientDotVaultLib.gapiDotClientDotVaultLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


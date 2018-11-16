package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val accounts: gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs.AccountsResource = js.native
  /** Load Tag Manager API v2 */
  def load(
    name: gapiDotClientDotTagmanagerLib.gapiDotClientDotTagmanagerLibStrings.tagmanager,
    version: gapiDotClientDotTagmanagerLib.gapiDotClientDotTagmanagerLibStrings.v2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotTagmanagerLib.gapiDotClientDotTagmanagerLibStrings.tagmanager,
    version: gapiDotClientDotTagmanagerLib.gapiDotClientDotTagmanagerLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val googleServiceAccounts: gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs.GoogleServiceAccountsResource = js.native
  val transferJobs: gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs.TransferJobsResource = js.native
  val transferOperations: gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs.TransferOperationsResource = js.native
  /** Load Google Storage Transfer API v1 */
  def load(
    name: gapiDotClientDotStoragetransferLib.gapiDotClientDotStoragetransferLibStrings.storagetransfer,
    version: gapiDotClientDotStoragetransferLib.gapiDotClientDotStoragetransferLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotStoragetransferLib.gapiDotClientDotStoragetransferLibStrings.storagetransfer,
    version: gapiDotClientDotStoragetransferLib.gapiDotClientDotStoragetransferLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


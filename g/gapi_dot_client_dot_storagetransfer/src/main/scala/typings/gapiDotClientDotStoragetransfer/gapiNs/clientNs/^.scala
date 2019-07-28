package typings.gapiDotClientDotStoragetransfer.gapiNs.clientNs

import typings.gapiDotClientDotStoragetransfer.gapiDotClientDotStoragetransferStrings.storagetransfer
import typings.gapiDotClientDotStoragetransfer.gapiDotClientDotStoragetransferStrings.v1
import typings.gapiDotClientDotStoragetransfer.gapiNs.clientNs.storagetransferNs.GoogleServiceAccountsResource
import typings.gapiDotClientDotStoragetransfer.gapiNs.clientNs.storagetransferNs.TransferJobsResource
import typings.gapiDotClientDotStoragetransfer.gapiNs.clientNs.storagetransferNs.TransferOperationsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val googleServiceAccounts: GoogleServiceAccountsResource = js.native
  val transferJobs: TransferJobsResource = js.native
  val transferOperations: TransferOperationsResource = js.native
  /** Load Google Storage Transfer API v1 */
  def load(name: storagetransfer, version: v1): js.Thenable[Unit] = js.native
  def load(name: storagetransfer, version: v1, callback: js.Function0[_]): Unit = js.native
}


package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val billingAccounts: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.BillingAccountsResource = js.native
  val entries: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.EntriesResource = js.native
  val folders: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.FoldersResource = js.native
  val monitoredResourceDescriptors: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.MonitoredResourceDescriptorsResource = js.native
  val organizations: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.OrganizationsResource = js.native
  val projects: gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs.ProjectsResource = js.native
  /** Load Stackdriver Logging API v2 */
  def load(
    name: gapiDotClientDotLoggingLib.gapiDotClientDotLoggingLibStrings.logging,
    version: gapiDotClientDotLoggingLib.gapiDotClientDotLoggingLibStrings.v2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotLoggingLib.gapiDotClientDotLoggingLibStrings.logging,
    version: gapiDotClientDotLoggingLib.gapiDotClientDotLoggingLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


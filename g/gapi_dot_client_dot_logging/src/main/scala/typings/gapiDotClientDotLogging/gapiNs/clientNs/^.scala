package typings.gapiDotClientDotLogging.gapiNs.clientNs

import typings.gapiDotClientDotLogging.gapiDotClientDotLoggingStrings.logging
import typings.gapiDotClientDotLogging.gapiDotClientDotLoggingStrings.v2
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.BillingAccountsResource
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.EntriesResource
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.FoldersResource
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.MonitoredResourceDescriptorsResource
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.OrganizationsResource
import typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val billingAccounts: BillingAccountsResource = js.native
  val entries: EntriesResource = js.native
  val folders: FoldersResource = js.native
  val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
  val organizations: OrganizationsResource = js.native
  val projects: ProjectsResource = js.native
  /** Load Stackdriver Logging API v2 */
  def load(name: logging, version: v2): js.Thenable[Unit] = js.native
  def load(name: logging, version: v2, callback: js.Function0[_]): Unit = js.native
}


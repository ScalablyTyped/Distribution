package typings.gapiDotClientDotDns.gapiNs.clientNs

import typings.gapiDotClientDotDns.gapiDotClientDotDnsStrings.dns
import typings.gapiDotClientDotDns.gapiDotClientDotDnsStrings.v1
import typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs.ChangesResource
import typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs.ManagedZonesResource
import typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs.ProjectsResource
import typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs.ResourceRecordSetsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val changes: ChangesResource = js.native
  val managedZones: ManagedZonesResource = js.native
  val projects: ProjectsResource = js.native
  val resourceRecordSets: ResourceRecordSetsResource = js.native
  /** Load Google Cloud DNS API v1 */
  def load(name: dns, version: v1): js.Thenable[Unit] = js.native
  def load(name: dns, version: v1, callback: js.Function0[_]): Unit = js.native
}


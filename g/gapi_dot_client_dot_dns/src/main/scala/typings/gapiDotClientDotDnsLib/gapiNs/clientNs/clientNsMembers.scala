package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val changes: gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs.ChangesResource = js.native
  val managedZones: gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs.ManagedZonesResource = js.native
  val projects: gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs.ProjectsResource = js.native
  val resourceRecordSets: gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs.ResourceRecordSetsResource = js.native
  /** Load Google Cloud DNS API v1 */
  def load(
    name: gapiDotClientDotDnsLib.gapiDotClientDotDnsLibStrings.dns,
    version: gapiDotClientDotDnsLib.gapiDotClientDotDnsLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotDnsLib.gapiDotClientDotDnsLibStrings.dns,
    version: gapiDotClientDotDnsLib.gapiDotClientDotDnsLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}


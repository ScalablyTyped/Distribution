package typings.gapiClientDns

import typings.gapiClientDns.gapi.client.dns.ChangesResource
import typings.gapiClientDns.gapi.client.dns.ManagedZonesResource
import typings.gapiClientDns.gapi.client.dns.ProjectsResource
import typings.gapiClientDns.gapi.client.dns.ResourceRecordSetsResource
import typings.gapiClientDns.gapiClientDnsStrings.dns
import typings.gapiClientDns.gapiClientDnsStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val changes: ChangesResource = js.native
      val managedZones: ManagedZonesResource = js.native
      val projects: ProjectsResource = js.native
      val resourceRecordSets: ResourceRecordSetsResource = js.native
      /** Load Google Cloud DNS API v1 */
      def load(name: dns, version: v1): js.Thenable[Unit] = js.native
      def load(name: dns, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


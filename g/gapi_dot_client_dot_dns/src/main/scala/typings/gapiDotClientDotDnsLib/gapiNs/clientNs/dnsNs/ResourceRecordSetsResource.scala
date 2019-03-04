package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSetsResource extends js.Object {
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(request: gapiDotClientDotDnsLib.Anon_AltFieldsKeyManagedZone): gapiDotClientLib.gapiNs.clientNs.Request[ResourceRecordSetsListResponse]
}

object ResourceRecordSetsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDnsLib.Anon_AltFieldsKeyManagedZone, 
      gapiDotClientLib.gapiNs.clientNs.Request[ResourceRecordSetsListResponse]
    ]
  ): ResourceRecordSetsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[ResourceRecordSetsResource]
  }
}


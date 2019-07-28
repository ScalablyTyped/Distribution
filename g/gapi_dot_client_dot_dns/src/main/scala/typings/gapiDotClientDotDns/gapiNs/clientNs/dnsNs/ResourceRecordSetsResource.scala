package typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDns.Anon_AltFieldsKeyManagedZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSetsResource extends js.Object {
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(request: Anon_AltFieldsKeyManagedZone): Request[ResourceRecordSetsListResponse]
}

object ResourceRecordSetsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKeyManagedZone => Request[ResourceRecordSetsListResponse]): ResourceRecordSetsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ResourceRecordSetsResource]
  }
}


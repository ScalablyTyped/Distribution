package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDns.AnonAltFieldsKeyManagedZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSetsResource extends js.Object {
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(request: AnonAltFieldsKeyManagedZone): Request_[ResourceRecordSetsListResponse]
}

object ResourceRecordSetsResource {
  @scala.inline
  def apply(list: AnonAltFieldsKeyManagedZone => Request_[ResourceRecordSetsListResponse]): ResourceRecordSetsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ResourceRecordSetsResource]
  }
}


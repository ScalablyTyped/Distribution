package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDns.AnonAlt
import typings.gapiClientDns.AnonAltChangeId
import typings.gapiClientDns.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: AnonAlt): Request_[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: AnonAltChangeId): Request_[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: AnonAltFields): Request_[ChangesListResponse]
}

object ChangesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Change],
    get: AnonAltChangeId => Request_[Change],
    list: AnonAltFields => Request_[ChangesListResponse]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ChangesResource]
  }
}


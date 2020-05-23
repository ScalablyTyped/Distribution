package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDns.anon.Alt
import typings.gapiClientDns.anon.ChangeId
import typings.gapiClientDns.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Alt): Request[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: ChangeId): Request[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: Fields): Request[ChangesListResponse]
}

object ChangesResource {
  @scala.inline
  def apply(
    create: Alt => Request[Change],
    get: ChangeId => Request[Change],
    list: Fields => Request[ChangesListResponse]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ChangesResource]
  }
}


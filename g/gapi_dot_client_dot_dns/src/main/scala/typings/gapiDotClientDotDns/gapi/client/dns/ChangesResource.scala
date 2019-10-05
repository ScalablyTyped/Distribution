package typings.gapiDotClientDotDns.gapi.client.dns

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDns.Anon_Alt
import typings.gapiDotClientDotDns.Anon_AltChangeId
import typings.gapiDotClientDotDns.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Anon_Alt): Request[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: Anon_AltChangeId): Request[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: Anon_AltFields): Request[ChangesListResponse]
}

object ChangesResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Change],
    get: Anon_AltChangeId => Request[Change],
    list: Anon_AltFields => Request[ChangesListResponse]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ChangesResource]
  }
}


package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: Alt): Request[ListGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(list: Alt => Request[ListGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MembersResource]
  }
}


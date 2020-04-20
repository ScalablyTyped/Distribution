package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: AnonAlt): Request_[ListGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MembersResource]
  }
}


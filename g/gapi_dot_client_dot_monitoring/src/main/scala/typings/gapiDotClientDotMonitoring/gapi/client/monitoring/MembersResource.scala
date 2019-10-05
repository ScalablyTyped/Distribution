package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: Anon_AccesstokenAlt): Request[ListGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAlt => Request[ListGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MembersResource]
  }
}


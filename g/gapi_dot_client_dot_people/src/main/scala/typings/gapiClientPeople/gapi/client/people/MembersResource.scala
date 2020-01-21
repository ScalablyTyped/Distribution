package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Modify the members of a contact group owned by the authenticated user. */
  def modify(request: AnonAccesstoken): Request_[ModifyContactGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(modify: AnonAccesstoken => Request_[ModifyContactGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
  
    __obj.asInstanceOf[MembersResource]
  }
}


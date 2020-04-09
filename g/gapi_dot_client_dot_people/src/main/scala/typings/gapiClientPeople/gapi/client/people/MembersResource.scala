package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstoken
import typings.gapiClientPeople.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersResource extends js.Object {
  /**
    * Modify the members of a contact group owned by the authenticated user.
    *
    * The only system contact groups that can have members added are
    * `contactGroups/myContacts` and `contactGroups/starred`. Other system
    * contact groups are deprecated and can only have contacts removed.
    */
  def modify(request: AnonAccesstoken): Request_[ModifyContactGroupMembersResponse] = js.native
  def modify(request: AnonAlt, body: ModifyContactGroupMembersRequest): Request_[ModifyContactGroupMembersResponse] = js.native
}


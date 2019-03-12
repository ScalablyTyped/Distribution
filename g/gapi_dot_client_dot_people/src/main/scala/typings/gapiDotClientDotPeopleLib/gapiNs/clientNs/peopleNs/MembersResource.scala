package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Modify the members of a contact group owned by the authenticated user. */
  def modify(request: gapiDotClientDotPeopleLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ModifyContactGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(
    modify: gapiDotClientDotPeopleLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[ModifyContactGroupMembersResponse]
  ): MembersResource = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
  
    __obj.asInstanceOf[MembersResource]
  }
}


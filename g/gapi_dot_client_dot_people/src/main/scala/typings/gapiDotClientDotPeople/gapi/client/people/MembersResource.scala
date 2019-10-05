package typings.gapiDotClientDotPeople.gapi.client.people

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPeople.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Modify the members of a contact group owned by the authenticated user. */
  def modify(request: Anon_Accesstoken): Request[ModifyContactGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(modify: Anon_Accesstoken => Request[ModifyContactGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction1(modify))
  
    __obj.asInstanceOf[MembersResource]
  }
}


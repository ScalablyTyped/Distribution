package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMonitoring.Anon_Accesstoken
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAltAncestorsOfGroup
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Group]
  /** Deletes an existing group. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Gets a single group. */
  def get(request: Anon_Accesstoken): Request[Group]
  /** Lists the existing groups. */
  def list(request: Anon_AccesstokenAltAncestorsOfGroup): Request[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: Anon_AccesstokenAltBearertoken): Request[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[Group],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[Group],
    list: Anon_AccesstokenAltAncestorsOfGroup => Request[ListGroupsResponse],
    members: MembersResource,
    update: Anon_AccesstokenAltBearertoken => Request[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}


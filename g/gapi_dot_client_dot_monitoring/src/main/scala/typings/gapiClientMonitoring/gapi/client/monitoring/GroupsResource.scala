package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAccesstoken
import typings.gapiClientMonitoring.AnonAccesstokenAltAncestorsOfGroup
import typings.gapiClientMonitoring.AnonAccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[Group]
  /** Deletes an existing group. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a single group. */
  def get(request: AnonAccesstoken): Request_[Group]
  /** Lists the existing groups. */
  def list(request: AnonAccesstokenAltAncestorsOfGroup): Request_[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: AnonAccesstokenAltBearertoken): Request_[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[Group],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Group],
    list: AnonAccesstokenAltAncestorsOfGroup => Request_[ListGroupsResponse],
    members: MembersResource,
    update: AnonAccesstokenAltBearertoken => Request_[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}


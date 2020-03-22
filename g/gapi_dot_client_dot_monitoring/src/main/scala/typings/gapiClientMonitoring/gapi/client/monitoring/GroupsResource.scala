package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAccesstoken
import typings.gapiClientMonitoring.AnonAncestorsOfGroup
import typings.gapiClientMonitoring.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: AnonBearertoken): Request_[Group]
  /** Deletes an existing group. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a single group. */
  def get(request: AnonAccesstoken): Request_[Group]
  /** Lists the existing groups. */
  def list(request: AnonAncestorsOfGroup): Request_[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: AnonBearertoken): Request_[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Group],
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[Group],
    list: AnonAncestorsOfGroup => Request_[ListGroupsResponse],
    members: MembersResource,
    update: AnonBearertoken => Request_[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}


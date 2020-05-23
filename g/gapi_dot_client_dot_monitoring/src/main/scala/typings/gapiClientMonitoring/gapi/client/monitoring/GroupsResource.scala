package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.AncestorsOfGroup
import typings.gapiClientMonitoring.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: Bearertoken): Request[Group]
  /** Deletes an existing group. */
  def delete(request: Accesstoken): Request[js.Object]
  /** Gets a single group. */
  def get(request: Accesstoken): Request[Group]
  /** Lists the existing groups. */
  def list(request: AncestorsOfGroup): Request[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: Bearertoken): Request[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Group],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Group],
    list: AncestorsOfGroup => Request[ListGroupsResponse],
    members: MembersResource,
    update: Bearertoken => Request[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
}


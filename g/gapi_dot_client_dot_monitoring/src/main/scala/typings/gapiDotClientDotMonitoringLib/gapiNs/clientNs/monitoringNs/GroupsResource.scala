package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  var members: MembersResource
  /** Creates a new group. */
  def create(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Group]
  /** Deletes an existing group. */
  def delete(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a single group. */
  def get(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Group]
  /** Lists the existing groups. */
  def list(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltAncestorsOfGroup): gapiDotClientLib.gapiNs.clientNs.Request[ListGroupsResponse]
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Group]
    ],
    delete: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Group]
    ],
    list: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_AccesstokenAltAncestorsOfGroup, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListGroupsResponse]
    ],
    members: MembersResource,
    update: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Group]
    ]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GroupsResource]
  }
}


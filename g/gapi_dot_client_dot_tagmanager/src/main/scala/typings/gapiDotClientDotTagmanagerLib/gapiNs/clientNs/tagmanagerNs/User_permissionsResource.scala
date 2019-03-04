package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User_permissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a user's Account & Container access. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
}

object User_permissionsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
    ],
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListUserPermissionsResponse]
    ],
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
    ]
  ): User_permissionsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, update = update)
  
    __obj.asInstanceOf[User_permissionsResource]
  }
}


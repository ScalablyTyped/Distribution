package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait User_permissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a user's Account & Container access. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[UserPermission]
}


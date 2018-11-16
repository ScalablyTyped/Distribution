package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroup]
  /** Gets a list of all supported user role permission groups. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionGroupsListResponse]
}


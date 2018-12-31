package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermission]
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintQuotaUserKeyUserIpOauthtokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[UserRolePermissionsListResponse]
}


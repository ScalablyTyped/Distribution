package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one user role by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UserRole]
  /** Inserts a new user role. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(
    request: gapiDotClientDotDfareportingLib.Anon_ProfileIdSortFieldMaxResultsPrettyPrintPageTokenQuotaUserSearchStringKeyUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[UserRole]
  /** Updates an existing user role. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[UserRole]
}


package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: gapiDotClientDotSqladminLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}


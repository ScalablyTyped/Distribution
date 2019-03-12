package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_AltFieldsHost): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: gapiDotClientDotSqladminLib.Anon_AltFieldsHost): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotSqladminLib.Anon_AltFieldsHost => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    insert: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[UsersListResponse],
    update: gapiDotClientDotSqladminLib.Anon_AltFieldsHost => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}


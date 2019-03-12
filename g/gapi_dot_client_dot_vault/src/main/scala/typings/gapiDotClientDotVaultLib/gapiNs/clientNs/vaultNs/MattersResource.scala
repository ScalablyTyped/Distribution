package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CloseMatterResponse]
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Gets the specified matter. */
  def get(request: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Lists matters the user has access to. */
  def list(request: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[MatterPermission],
    close: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[CloseMatterResponse],
    create: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[Matter],
    delete: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Matter],
    get: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[Matter],
    holds: HoldsResource,
    list: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListMattersResponse],
    removePermissions: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    reopen: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[ReopenMatterResponse],
    undelete: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Matter],
    update: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(addPermissions = js.Any.fromFunction1(addPermissions), close = js.Any.fromFunction1(close), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), holds = holds, list = js.Any.fromFunction1(list), removePermissions = js.Any.fromFunction1(removePermissions), reopen = js.Any.fromFunction1(reopen), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MattersResource]
  }
}


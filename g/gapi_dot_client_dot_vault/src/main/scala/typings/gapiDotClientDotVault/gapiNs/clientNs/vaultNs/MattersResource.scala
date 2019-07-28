package typings.gapiDotClientDotVault.gapiNs.clientNs.vaultNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotVault.Anon_AccesstokenAlt
import typings.gapiDotClientDotVault.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotVault.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotVault.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: Anon_AccesstokenAlt): Request[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: Anon_AccesstokenAlt): Request[CloseMatterResponse]
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: Anon_AccesstokenAltBearertokenCallback): Request[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: Anon_AccesstokenAlt): Request[Matter]
  /** Gets the specified matter. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Matter]
  /** Lists matters the user has access to. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: Anon_AccesstokenAlt): Request[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: Anon_AccesstokenAlt): Request[Matter]
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: Anon_AccesstokenAlt): Request[Matter]
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: Anon_AccesstokenAlt => Request[MatterPermission],
    close: Anon_AccesstokenAlt => Request[CloseMatterResponse],
    create: Anon_AccesstokenAltBearertokenCallback => Request[Matter],
    delete: Anon_AccesstokenAlt => Request[Matter],
    get: Anon_AccesstokenAltBearertokenCallbackFields => Request[Matter],
    holds: HoldsResource,
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[ListMattersResponse],
    removePermissions: Anon_AccesstokenAlt => Request[js.Object],
    reopen: Anon_AccesstokenAlt => Request[ReopenMatterResponse],
    undelete: Anon_AccesstokenAlt => Request[Matter],
    update: Anon_AccesstokenAlt => Request[Matter]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(addPermissions = js.Any.fromFunction1(addPermissions), close = js.Any.fromFunction1(close), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), holds = holds, list = js.Any.fromFunction1(list), removePermissions = js.Any.fromFunction1(removePermissions), reopen = js.Any.fromFunction1(reopen), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MattersResource]
  }
}


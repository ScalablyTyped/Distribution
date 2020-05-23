package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVault.anon.Alt
import typings.gapiClientVault.anon.Callback
import typings.gapiClientVault.anon.Fields
import typings.gapiClientVault.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: Alt): Request[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: Alt): Request[CloseMatterResponse]
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: Callback): Request[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: Alt): Request[Matter]
  /** Gets the specified matter. */
  def get(request: Fields): Request[Matter]
  /** Lists matters the user has access to. */
  def list(request: Key): Request[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: Alt): Request[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: Alt): Request[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: Alt): Request[Matter]
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: Alt): Request[Matter]
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: Alt => Request[MatterPermission],
    close: Alt => Request[CloseMatterResponse],
    create: Callback => Request[Matter],
    delete: Alt => Request[Matter],
    get: Fields => Request[Matter],
    holds: HoldsResource,
    list: Key => Request[ListMattersResponse],
    removePermissions: Alt => Request[js.Object],
    reopen: Alt => Request[ReopenMatterResponse],
    undelete: Alt => Request[Matter],
    update: Alt => Request[Matter]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(addPermissions = js.Any.fromFunction1(addPermissions), close = js.Any.fromFunction1(close), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), holds = holds.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), removePermissions = js.Any.fromFunction1(removePermissions), reopen = js.Any.fromFunction1(reopen), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MattersResource]
  }
}


package typings.gapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientVault.AnonAccesstokenAlt
import typings.gapiClientVault.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientVault.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientVault.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: AnonAccesstokenAlt): Request_[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: AnonAccesstokenAlt): Request_[CloseMatterResponse]
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: AnonAccesstokenAltBearertokenCallback): Request_[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: AnonAccesstokenAlt): Request_[Matter]
  /** Gets the specified matter. */
  def get(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Matter]
  /** Lists matters the user has access to. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: AnonAccesstokenAlt): Request_[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: AnonAccesstokenAlt): Request_[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: AnonAccesstokenAlt): Request_[Matter]
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: AnonAccesstokenAlt): Request_[Matter]
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: AnonAccesstokenAlt => Request_[MatterPermission],
    close: AnonAccesstokenAlt => Request_[CloseMatterResponse],
    create: AnonAccesstokenAltBearertokenCallback => Request_[Matter],
    delete: AnonAccesstokenAlt => Request_[Matter],
    get: AnonAccesstokenAltBearertokenCallbackFields => Request_[Matter],
    holds: HoldsResource,
    list: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[ListMattersResponse],
    removePermissions: AnonAccesstokenAlt => Request_[js.Object],
    reopen: AnonAccesstokenAlt => Request_[ReopenMatterResponse],
    undelete: AnonAccesstokenAlt => Request_[Matter],
    update: AnonAccesstokenAlt => Request_[Matter]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(addPermissions = js.Any.fromFunction1(addPermissions), close = js.Any.fromFunction1(close), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), holds = holds.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), removePermissions = js.Any.fromFunction1(removePermissions), reopen = js.Any.fromFunction1(reopen), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MattersResource]
  }
}


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
    addPermissions: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MatterPermission]
    ],
    close: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CloseMatterResponse]
    ],
    create: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Matter]
    ],
    delete: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Matter]
    ],
    get: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Matter]
    ],
    holds: HoldsResource,
    list: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListMattersResponse]
    ],
    removePermissions: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    reopen: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ReopenMatterResponse]
    ],
    undelete: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Matter]
    ],
    update: js.Function1[
      gapiDotClientDotVaultLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Matter]
    ]
  ): MattersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPermissions")(addPermissions)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("holds")(holds)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("removePermissions")(removePermissions)
    __obj.updateDynamic("reopen")(reopen)
    __obj.updateDynamic("undelete")(undelete)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[MattersResource]
  }
}


package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[CloseMatterResponse]
  /**
               * Creates a new matter with the given name and description. The initial state
               * is open, and the owner is the method caller. Returns the created matter
               * with default view.
               */
  def create(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Gets the specified matter. */
  def get(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertokenCallbackQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /** Lists matters the user has access to. */
  def list(request: gapiDotClientDotVaultLib.Anon_AccesstokenPageSizeState): gapiDotClientLib.gapiNs.clientNs.Request[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
  /**
               * Updates the specified matter.
               * This updates only the name and description of the matter, identified by
               * matter id. Changes to any other fields are ignored.
               * Returns the default view of the matter.
               */
  def update(request: gapiDotClientDotVaultLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Matter]
}


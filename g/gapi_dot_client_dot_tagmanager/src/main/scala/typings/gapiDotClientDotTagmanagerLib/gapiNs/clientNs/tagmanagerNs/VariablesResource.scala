package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Variable. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
}


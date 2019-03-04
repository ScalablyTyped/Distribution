package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Variable. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Variable]
    ],
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Variable]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListVariablesResponse]
    ],
    revert: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[RevertVariableResponse]
    ],
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Variable]
    ]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, revert = revert, update = update)
  
    __obj.asInstanceOf[VariablesResource]
  }
}


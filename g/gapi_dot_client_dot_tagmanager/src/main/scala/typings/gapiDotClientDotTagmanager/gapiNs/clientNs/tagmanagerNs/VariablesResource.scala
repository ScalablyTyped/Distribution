package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: Anon_Alt): Request[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a GTM Variable. */
  def get(request: Anon_AltFields): Request[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: Anon_AltFieldsKey): Request[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: Anon_AltFieldsFingerprint): Request[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: Anon_AltFieldsFingerprint): Request[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Variable],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Variable],
    list: Anon_AltFieldsKey => Request[ListVariablesResponse],
    revert: Anon_AltFieldsFingerprint => Request[RevertVariableResponse],
    update: Anon_AltFieldsFingerprint => Request[Variable]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VariablesResource]
  }
}


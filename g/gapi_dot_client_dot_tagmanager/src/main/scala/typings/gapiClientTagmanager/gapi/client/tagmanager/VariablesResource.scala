package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: Alt): Request[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: Fields): Request[Unit]
  /** Gets a GTM Variable. */
  def get(request: Fields): Request[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: Key): Request[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: Fingerprint): Request[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: Alt => Request[Variable],
    delete: Fields => Request[Unit],
    get: Fields => Request[Variable],
    list: Key => Request[ListVariablesResponse],
    revert: Fingerprint => Request[RevertVariableResponse],
    update: Fingerprint => Request[Variable]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VariablesResource]
  }
}


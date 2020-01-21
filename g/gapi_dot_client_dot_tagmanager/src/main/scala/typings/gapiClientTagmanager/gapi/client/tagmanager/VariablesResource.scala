package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: AnonAlt): Request_[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a GTM Variable. */
  def get(request: AnonAltFields): Request_[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: AnonAltFieldsKey): Request_[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: AnonAltFieldsFingerprint): Request_[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: AnonAltFieldsFingerprint): Request_[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Variable],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Variable],
    list: AnonAltFieldsKey => Request_[ListVariablesResponse],
    revert: AnonAltFieldsFingerprint => Request_[RevertVariableResponse],
    update: AnonAltFieldsFingerprint => Request_[Variable]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VariablesResource]
  }
}


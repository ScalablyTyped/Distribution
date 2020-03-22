package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonFingerprint
import typings.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: AnonAlt): Request_[Variable]
  /** Deletes a GTM Variable. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Variable. */
  def get(request: AnonFields): Request_[Variable]
  /** Lists all GTM Variables of a Container. */
  def list(request: AnonKey): Request_[ListVariablesResponse]
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertVariableResponse]
  /** Updates a GTM Variable. */
  def update(request: AnonFingerprint): Request_[Variable]
}

object VariablesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Variable],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Variable],
    list: AnonKey => Request_[ListVariablesResponse],
    revert: AnonFingerprint => Request_[RevertVariableResponse],
    update: AnonFingerprint => Request_[Variable]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VariablesResource]
  }
}


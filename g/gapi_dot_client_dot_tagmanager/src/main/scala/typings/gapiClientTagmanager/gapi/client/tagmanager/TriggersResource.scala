package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: AnonAlt): Request_[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a GTM Trigger. */
  def get(request: AnonAltFields): Request_[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: AnonAltFieldsKey): Request_[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: AnonAltFieldsFingerprint): Request_[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: AnonAltFieldsFingerprint): Request_[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Trigger],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Trigger],
    list: AnonAltFieldsKey => Request_[ListTriggersResponse],
    revert: AnonAltFieldsFingerprint => Request_[RevertTriggerResponse],
    update: AnonAltFieldsFingerprint => Request_[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TriggersResource]
  }
}


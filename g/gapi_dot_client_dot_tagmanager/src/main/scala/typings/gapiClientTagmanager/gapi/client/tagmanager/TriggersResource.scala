package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonFingerprint
import typings.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: AnonAlt): Request_[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Trigger. */
  def get(request: AnonFields): Request_[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: AnonKey): Request_[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: AnonFingerprint): Request_[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Trigger],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Trigger],
    list: AnonKey => Request_[ListTriggersResponse],
    revert: AnonFingerprint => Request_[RevertTriggerResponse],
    update: AnonFingerprint => Request_[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TriggersResource]
  }
}


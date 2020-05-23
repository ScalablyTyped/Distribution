package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: Alt): Request[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: Fields): Request[Unit]
  /** Gets a GTM Trigger. */
  def get(request: Fields): Request[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: Key): Request[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: Fingerprint): Request[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Trigger],
    delete: Fields => Request[Unit],
    get: Fields => Request[Trigger],
    list: Key => Request[ListTriggersResponse],
    revert: Fingerprint => Request[RevertTriggerResponse],
    update: Fingerprint => Request[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TriggersResource]
  }
}


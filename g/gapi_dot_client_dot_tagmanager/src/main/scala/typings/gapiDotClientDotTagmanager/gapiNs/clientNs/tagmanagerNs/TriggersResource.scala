package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: Anon_Alt): Request[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a GTM Trigger. */
  def get(request: Anon_AltFields): Request[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: Anon_AltFieldsKey): Request[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: Anon_AltFieldsFingerprint): Request[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: Anon_AltFieldsFingerprint): Request[Trigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Trigger],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Trigger],
    list: Anon_AltFieldsKey => Request[ListTriggersResponse],
    revert: Anon_AltFieldsFingerprint => Request[RevertTriggerResponse],
    update: Anon_AltFieldsFingerprint => Request[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TriggersResource]
  }
}


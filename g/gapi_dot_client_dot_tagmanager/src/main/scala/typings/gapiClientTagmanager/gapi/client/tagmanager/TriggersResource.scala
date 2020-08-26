package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: Alt): Request[Trigger] = js.native
  /** Deletes a GTM Trigger. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Trigger. */
  def get(request: Fields): Request[Trigger] = js.native
  /** Lists all GTM Triggers of a Container. */
  def list(request: Key): Request[ListTriggersResponse] = js.native
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertTriggerResponse] = js.native
  /** Updates a GTM Trigger. */
  def update(request: Fingerprint): Request[Trigger] = js.native
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
  @scala.inline
  implicit class TriggersResourceOps[Self <: TriggersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Alt => Request[Trigger]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Trigger]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListTriggersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: Fingerprint => Request[RevertTriggerResponse]): Self = this.set("revert", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Trigger]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}


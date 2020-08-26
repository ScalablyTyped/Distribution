package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: Alt): Request[Label] = js.native
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets the specified label. */
  def get(request: Fields): Request[Label] = js.native
  /** Lists all labels in the user's mailbox. */
  def list(request: Alt): Request[ListLabelsResponse] = js.native
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: Fields): Request[Label] = js.native
  /** Updates the specified label. */
  def update(request: Fields): Request[Label] = js.native
}

object LabelsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Label],
    delete: Fields => Request[Unit],
    get: Fields => Request[Label],
    list: Alt => Request[ListLabelsResponse],
    patch: Fields => Request[Label],
    update: Fields => Request[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LabelsResource]
  }
  @scala.inline
  implicit class LabelsResourceOps[Self <: LabelsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Label]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Label]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListLabelsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Label]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fields => Request[Label]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}


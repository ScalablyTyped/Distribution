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
trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: Alt): Request[Variable] = js.native
  /** Deletes a GTM Variable. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Variable. */
  def get(request: Fields): Request[Variable] = js.native
  /** Lists all GTM Variables of a Container. */
  def list(request: Key): Request[ListVariablesResponse] = js.native
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertVariableResponse] = js.native
  /** Updates a GTM Variable. */
  def update(request: Fingerprint): Request[Variable] = js.native
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
  @scala.inline
  implicit class VariablesResourceOps[Self <: VariablesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Variable]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Variable]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListVariablesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: Fingerprint => Request[RevertVariableResponse]): Self = this.set("revert", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Variable]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}


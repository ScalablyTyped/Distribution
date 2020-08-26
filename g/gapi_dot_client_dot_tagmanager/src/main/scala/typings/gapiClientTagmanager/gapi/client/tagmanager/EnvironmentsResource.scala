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
trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: Alt): Request[Environment] = js.native
  /** Deletes a GTM Environment. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Environment. */
  def get(request: Fields): Request[Environment] = js.native
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: Key): Request[ListEnvironmentsResponse] = js.native
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: Fingerprint): Request[Environment] = js.native
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: Fields): Request[Environment] = js.native
  /** Updates a GTM Environment. */
  def update(request: Fingerprint): Request[Environment] = js.native
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Environment],
    delete: Fields => Request[Unit],
    get: Fields => Request[Environment],
    list: Key => Request[ListEnvironmentsResponse],
    patch: Fingerprint => Request[Environment],
    reauthorize: Fields => Request[Environment],
    update: Fingerprint => Request[Environment]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), reauthorize = js.Any.fromFunction1(reauthorize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EnvironmentsResource]
  }
  @scala.inline
  implicit class EnvironmentsResourceOps[Self <: EnvironmentsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Environment]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Environment]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListEnvironmentsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fingerprint => Request[Environment]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setReauthorize(value: Fields => Request[Environment]): Self = this.set("reauthorize", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Environment]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}


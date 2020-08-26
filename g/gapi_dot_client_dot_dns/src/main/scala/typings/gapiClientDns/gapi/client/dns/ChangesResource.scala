package typings.gapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDns.anon.Alt
import typings.gapiClientDns.anon.ChangeId
import typings.gapiClientDns.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Alt): Request[Change] = js.native
  /** Fetch the representation of an existing Change. */
  def get(request: ChangeId): Request[Change] = js.native
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: Fields): Request[ChangesListResponse] = js.native
}

object ChangesResource {
  @scala.inline
  def apply(
    create: Alt => Request[Change],
    get: ChangeId => Request[Change],
    list: Fields => Request[ChangesListResponse]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ChangesResource]
  }
  @scala.inline
  implicit class ChangesResourceOps[Self <: ChangesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Change]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ChangeId => Request[Change]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[ChangesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


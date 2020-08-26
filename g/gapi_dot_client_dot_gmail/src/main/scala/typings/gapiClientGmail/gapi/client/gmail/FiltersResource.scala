package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: Alt): Request[Filter] = js.native
  /** Deletes a filter. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a filter. */
  def get(request: Fields): Request[Filter] = js.native
  /** Lists the message filters of a Gmail user. */
  def list(request: Alt): Request[ListFiltersResponse] = js.native
}

object FiltersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Filter],
    delete: Fields => Request[Unit],
    get: Fields => Request[Filter],
    list: Alt => Request[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FiltersResource]
  }
  @scala.inline
  implicit class FiltersResourceOps[Self <: FiltersResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Filter]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Filter]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListFiltersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


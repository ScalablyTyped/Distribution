package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Approved
import typings.gapiClientDfareporting.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: Id): Request[OrderDocument] = js.native
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: Approved): Request[OrderDocumentsListResponse] = js.native
}

object OrderDocumentsResource {
  @scala.inline
  def apply(get: Id => Request[OrderDocument], list: Approved => Request[OrderDocumentsListResponse]): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrderDocumentsResource]
  }
  @scala.inline
  implicit class OrderDocumentsResourceOps[Self <: OrderDocumentsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Id => Request[OrderDocument]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Approved => Request[OrderDocumentsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


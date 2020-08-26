package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request
import typings.gapiClientResourceviews.anon.Alt
import typings.gapiClientResourceviews.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: Alt): Request[Operation] = js.native
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList] = js.native
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: Alt => Request[Operation], list: Fields => Request[OperationList]): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
  @scala.inline
  implicit class ZoneOperationsResourceOps[Self <: ZoneOperationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[OperationList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


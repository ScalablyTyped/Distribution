package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.CreativeStatusId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailsResource extends js.Object {
  /**
    * List all details associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each detail.
    */
  def list(request: CreativeStatusId): Request[ListCreativeStatusBreakdownByDetailResponse] = js.native
}

object DetailsResource {
  @scala.inline
  def apply(list: CreativeStatusId => Request[ListCreativeStatusBreakdownByDetailResponse]): DetailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DetailsResource]
  }
  @scala.inline
  implicit class DetailsResourceOps[Self <: DetailsResource] (val x: Self) extends AnyVal {
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
    def setList(value: CreativeStatusId => Request[ListCreativeStatusBreakdownByDetailResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


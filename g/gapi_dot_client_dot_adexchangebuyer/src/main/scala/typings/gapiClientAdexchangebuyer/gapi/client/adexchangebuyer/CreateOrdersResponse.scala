package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrdersResponse extends js.Object {
  /** The list of proposals successfully created. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.native
}

object CreateOrdersResponse {
  @scala.inline
  def apply(): CreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrdersResponse]
  }
  @scala.inline
  implicit class CreateOrdersResponseOps[Self <: CreateOrdersResponse] (val x: Self) extends AnyVal {
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
    def setProposalsVarargs(value: Proposal*): Self = this.set("proposals", js.Array(value :_*))
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = this.set("proposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposals: Self = this.set("proposals", js.undefined)
  }
  
}


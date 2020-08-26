package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: PrettyPrint): Request[Unit] = js.native
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: PrettyPrint => Request[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
  @scala.inline
  implicit class MarketplaceprivateauctionResourceOps[Self <: MarketplaceprivateauctionResource] (val x: Self) extends AnyVal {
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
    def setUpdateproposal(value: PrettyPrint => Request[Unit]): Self = this.set("updateproposal", js.Any.fromFunction1(value))
  }
  
}


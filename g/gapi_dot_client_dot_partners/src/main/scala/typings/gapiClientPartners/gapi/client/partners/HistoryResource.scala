package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.EntireCompany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(request: EntireCompany): Request[ListOffersHistoryResponse] = js.native
}

object HistoryResource {
  @scala.inline
  def apply(list: EntireCompany => Request[ListOffersHistoryResponse]): HistoryResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[HistoryResource]
  }
  @scala.inline
  implicit class HistoryResourceOps[Self <: HistoryResource] (val x: Self) extends AnyVal {
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
    def setList(value: EntireCompany => Request[ListOffersHistoryResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


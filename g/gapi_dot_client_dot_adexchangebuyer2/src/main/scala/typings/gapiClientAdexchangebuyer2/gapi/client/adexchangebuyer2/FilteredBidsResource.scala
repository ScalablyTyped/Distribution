package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteredBidsResource extends js.Object {
  var creatives: CreativesResource = js.native
  var details: DetailsResource = js.native
  /**
    * List all reasons for which bids were filtered, with the number of bids
    * filtered for each reason.
    */
  def list(request: FilterSetId): Request[ListFilteredBidsResponse] = js.native
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: FilterSetId => Request[ListFilteredBidsResponse]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FilteredBidsResource]
  }
  @scala.inline
  implicit class FilteredBidsResourceOps[Self <: FilteredBidsResource] (val x: Self) extends AnyVal {
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
    def setCreatives(value: CreativesResource): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: DetailsResource): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: FilterSetId => Request[ListFilteredBidsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


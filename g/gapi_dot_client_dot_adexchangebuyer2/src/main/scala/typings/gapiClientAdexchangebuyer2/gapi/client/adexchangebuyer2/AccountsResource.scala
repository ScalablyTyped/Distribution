package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var clients: ClientsResource = js.native
  var creatives: CreativesResource = js.native
  var filterSets: FilterSetsResource = js.native
}

object AccountsResource {
  @scala.inline
  def apply(clients: ClientsResource, creatives: CreativesResource, filterSets: FilterSetsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], creatives = creatives.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
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
    def setClients(value: ClientsResource): Self = this.set("clients", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatives(value: CreativesResource): Self = this.set("creatives", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterSets(value: FilterSetsResource): Self = this.set("filterSets", value.asInstanceOf[js.Any])
  }
  
}


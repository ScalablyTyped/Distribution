package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var clients: ClientsResource
  var creatives: CreativesResource
  var filterSets: FilterSetsResource
}

object AccountsResource {
  @scala.inline
  def apply(clients: ClientsResource, creatives: CreativesResource, filterSets: FilterSetsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], creatives = creatives.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
}


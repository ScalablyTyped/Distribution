package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

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
    val __obj = js.Dynamic.literal(clients = clients, creatives = creatives, filterSets = filterSets)
  
    __obj.asInstanceOf[AccountsResource]
  }
}


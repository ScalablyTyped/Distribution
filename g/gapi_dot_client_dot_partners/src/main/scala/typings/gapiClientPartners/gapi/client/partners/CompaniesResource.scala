package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAccesstokenAddress
import typings.gapiClientPartners.AnonAccesstokenAddressAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: AnonAccesstokenAddress): Request_[GetCompanyResponse]
  /** Lists companies. */
  def list(request: AnonAccesstokenAddressAlt): Request_[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAddress => Request_[GetCompanyResponse],
    leads: LeadsResource,
    list: AnonAccesstokenAddressAlt => Request_[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CompaniesResource]
  }
}


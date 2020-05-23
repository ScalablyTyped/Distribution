package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Address
import typings.gapiClientPartners.anon.CompanyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: Address): Request[GetCompanyResponse]
  /** Lists companies. */
  def list(request: CompanyName): Request[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: Address => Request[GetCompanyResponse],
    leads: LeadsResource,
    list: CompanyName => Request[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CompaniesResource]
  }
}


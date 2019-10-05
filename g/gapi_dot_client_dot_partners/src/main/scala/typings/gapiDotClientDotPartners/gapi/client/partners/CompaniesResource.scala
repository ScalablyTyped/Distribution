package typings.gapiDotClientDotPartners.gapi.client.partners

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAddress
import typings.gapiDotClientDotPartners.Anon_AccesstokenAddressAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: Anon_AccesstokenAddress): Request[GetCompanyResponse]
  /** Lists companies. */
  def list(request: Anon_AccesstokenAddressAlt): Request[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAddress => Request[GetCompanyResponse],
    leads: LeadsResource,
    list: Anon_AccesstokenAddressAlt => Request[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CompaniesResource]
  }
}


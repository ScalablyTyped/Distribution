package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAddress
import typings.gapiClientPartners.AnonCompanyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: AnonAddress): Request_[GetCompanyResponse]
  /** Lists companies. */
  def list(request: AnonCompanyName): Request_[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: AnonAddress => Request_[GetCompanyResponse],
    leads: LeadsResource,
    list: AnonCompanyName => Request_[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CompaniesResource]
  }
}


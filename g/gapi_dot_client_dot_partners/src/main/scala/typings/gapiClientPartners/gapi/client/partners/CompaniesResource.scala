package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Address
import typings.gapiClientPartners.anon.CompanyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompaniesResource extends js.Object {
  var leads: LeadsResource = js.native
  /** Gets a company. */
  def get(request: Address): Request[GetCompanyResponse] = js.native
  /** Lists companies. */
  def list(request: CompanyName): Request[ListCompaniesResponse] = js.native
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
  @scala.inline
  implicit class CompaniesResourceOps[Self <: CompaniesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Address => Request[GetCompanyResponse]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setLeads(value: LeadsResource): Self = this.set("leads", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: CompanyName => Request[ListCompaniesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


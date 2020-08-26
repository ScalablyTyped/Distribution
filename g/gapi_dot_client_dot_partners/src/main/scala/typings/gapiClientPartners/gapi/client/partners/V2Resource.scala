package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Fields
import typings.gapiClientPartners.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: Fields): Request[GetPartnersStatusResponse] = js.native
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: Pp): Request[Company] = js.native
  /** Updates the specified lead. */
  def updateLeads(request: Pp): Request[Lead] = js.native
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: Fields => Request[GetPartnersStatusResponse],
    updateCompanies: Pp => Request[Company],
    updateLeads: Pp => Request[Lead]
  ): V2Resource = {
    val __obj = js.Dynamic.literal(getPartnersstatus = js.Any.fromFunction1(getPartnersstatus), updateCompanies = js.Any.fromFunction1(updateCompanies), updateLeads = js.Any.fromFunction1(updateLeads))
    __obj.asInstanceOf[V2Resource]
  }
  @scala.inline
  implicit class V2ResourceOps[Self <: V2Resource] (val x: Self) extends AnyVal {
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
    def setGetPartnersstatus(value: Fields => Request[GetPartnersStatusResponse]): Self = this.set("getPartnersstatus", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateCompanies(value: Pp => Request[Company]): Self = this.set("updateCompanies", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateLeads(value: Pp => Request[Lead]): Self = this.set("updateLeads", js.Any.fromFunction1(value))
  }
  
}


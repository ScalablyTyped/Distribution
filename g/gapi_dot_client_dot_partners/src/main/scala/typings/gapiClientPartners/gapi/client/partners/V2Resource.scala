package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Fields
import typings.gapiClientPartners.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: Fields): Request[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: Pp): Request[Company]
  /** Updates the specified lead. */
  def updateLeads(request: Pp): Request[Lead]
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
}


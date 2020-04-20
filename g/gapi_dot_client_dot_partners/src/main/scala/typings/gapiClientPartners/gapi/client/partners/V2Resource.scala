package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonFields
import typings.gapiClientPartners.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: AnonFields): Request_[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: AnonPp): Request_[Company]
  /** Updates the specified lead. */
  def updateLeads(request: AnonPp): Request_[Lead]
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: AnonFields => Request_[GetPartnersStatusResponse],
    updateCompanies: AnonPp => Request_[Company],
    updateLeads: AnonPp => Request_[Lead]
  ): V2Resource = {
    val __obj = js.Dynamic.literal(getPartnersstatus = js.Any.fromFunction1(getPartnersstatus), updateCompanies = js.Any.fromFunction1(updateCompanies), updateLeads = js.Any.fromFunction1(updateLeads))
    __obj.asInstanceOf[V2Resource]
  }
}


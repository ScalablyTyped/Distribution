package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientPartners.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Company]
  /** Updates the specified lead. */
  def updateLeads(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Lead]
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: AnonAccesstokenAltBearertokenCallbackFields => Request_[GetPartnersStatusResponse],
    updateCompanies: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Company],
    updateLeads: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Lead]
  ): V2Resource = {
    val __obj = js.Dynamic.literal(getPartnersstatus = js.Any.fromFunction1(getPartnersstatus), updateCompanies = js.Any.fromFunction1(updateCompanies), updateLeads = js.Any.fromFunction1(updateLeads))
  
    __obj.asInstanceOf[V2Resource]
  }
}


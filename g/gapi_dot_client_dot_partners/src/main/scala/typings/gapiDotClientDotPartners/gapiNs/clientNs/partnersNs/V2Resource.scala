package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[Company]
  /** Updates the specified lead. */
  def updateLeads(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[Lead]
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: Anon_AccesstokenAltBearertokenCallbackFields => Request[GetPartnersStatusResponse],
    updateCompanies: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[Company],
    updateLeads: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[Lead]
  ): V2Resource = {
    val __obj = js.Dynamic.literal(getPartnersstatus = js.Any.fromFunction1(getPartnersstatus), updateCompanies = js.Any.fromFunction1(updateCompanies), updateLeads = js.Any.fromFunction1(updateLeads))
  
    __obj.asInstanceOf[V2Resource]
  }
}


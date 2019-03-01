package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V2Resource extends js.Object {
  /**
    * Gets Partners Status of the logged in user's agency.
    * Should only be called if the logged in user is the admin of the agency.
    */
  def getPartnersstatus(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GetPartnersStatusResponse]
  /**
    * Update company.
    * Should only be called within the context of an authorized logged in user.
    */
  def updateCompanies(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[Company]
  /** Updates the specified lead. */
  def updateLeads(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[Lead]
}

object V2Resource {
  @scala.inline
  def apply(
    getPartnersstatus: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetPartnersStatusResponse]
    ],
    updateCompanies: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp, 
      gapiDotClientLib.gapiNs.clientNs.Request[Company]
    ],
    updateLeads: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp, 
      gapiDotClientLib.gapiNs.clientNs.Request[Lead]
    ]
  ): V2Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPartnersstatus")(getPartnersstatus)
    __obj.updateDynamic("updateCompanies")(updateCompanies)
    __obj.updateDynamic("updateLeads")(updateLeads)
    __obj.asInstanceOf[V2Resource]
  }
}


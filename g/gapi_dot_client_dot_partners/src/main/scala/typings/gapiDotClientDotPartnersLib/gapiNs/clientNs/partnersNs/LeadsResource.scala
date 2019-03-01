package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[CreateLeadResponse]
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListLeadsResponse]
}

object LeadsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreateLeadResponse]
    ],
    list: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLeadsResponse]
    ]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[LeadsResource]
  }
}


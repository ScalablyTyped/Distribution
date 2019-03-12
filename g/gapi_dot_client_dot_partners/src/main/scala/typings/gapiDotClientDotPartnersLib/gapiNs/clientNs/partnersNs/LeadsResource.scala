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
    create: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[CreateLeadResponse],
    list: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListLeadsResponse]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeadsResource]
  }
}


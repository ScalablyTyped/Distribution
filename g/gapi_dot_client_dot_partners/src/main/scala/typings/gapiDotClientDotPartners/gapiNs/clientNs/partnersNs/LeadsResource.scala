package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[CreateLeadResponse]
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListLeadsResponse]
}

object LeadsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[CreateLeadResponse],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListLeadsResponse]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeadsResource]
  }
}


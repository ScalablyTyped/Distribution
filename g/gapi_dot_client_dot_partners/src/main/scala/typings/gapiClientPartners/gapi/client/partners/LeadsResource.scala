package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAccesstokenAltBearertoken
import typings.gapiClientPartners.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[CreateLeadResponse]
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListLeadsResponse]
}

object LeadsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[CreateLeadResponse],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListLeadsResponse]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LeadsResource]
  }
}


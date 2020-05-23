package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Bearertoken
import typings.gapiClientPartners.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: Bearertoken): Request[CreateLeadResponse]
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: Callback): Request[ListLeadsResponse]
}

object LeadsResource {
  @scala.inline
  def apply(create: Bearertoken => Request[CreateLeadResponse], list: Callback => Request[ListLeadsResponse]): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeadsResource]
  }
}


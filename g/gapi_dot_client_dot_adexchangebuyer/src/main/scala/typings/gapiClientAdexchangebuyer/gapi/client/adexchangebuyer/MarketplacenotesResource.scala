package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKey
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: AnonAltFieldsKey): Request_[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: AnonAltFieldsKeyOauthtoken): Request_[GetOrderNotesResponse]
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: AnonAltFieldsKey => Request_[AddOrderNotesResponse],
    list: AnonAltFieldsKeyOauthtoken => Request_[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MarketplacenotesResource]
  }
}


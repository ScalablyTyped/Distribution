package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonOauthtoken
import typings.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderNotesResponse]
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: AnonOauthtoken => Request_[AddOrderNotesResponse],
    list: AnonPqlQuery => Request_[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MarketplacenotesResource]
  }
}


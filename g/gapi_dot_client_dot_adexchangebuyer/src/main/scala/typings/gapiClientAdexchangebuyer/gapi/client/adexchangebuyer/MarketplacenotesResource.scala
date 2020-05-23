package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.Oauthtoken
import typings.gapiClientAdexchangebuyer.anon.PqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: Oauthtoken): Request[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: PqlQuery): Request[GetOrderNotesResponse]
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: Oauthtoken => Request[AddOrderNotesResponse],
    list: PqlQuery => Request[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MarketplacenotesResource]
  }
}


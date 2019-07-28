package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKey
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: Anon_AltFieldsKey): Request[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: Anon_AltFieldsKeyOauthtoken): Request[GetOrderNotesResponse]
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: Anon_AltFieldsKey => Request[AddOrderNotesResponse],
    list: Anon_AltFieldsKeyOauthtoken => Request[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MarketplacenotesResource]
  }
}


package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[js.Object]
  /** List all creative-deal associations. */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields): Request[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId): Request[js.Object]
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId => Request[js.Object],
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields => Request[ListDealAssociationsResponse],
    remove: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId => Request[js.Object]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[DealAssociationsResource]
  }
}


package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltBuyerCreativeId
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltBuyerCreativeIdFields
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: Anon_AccountIdAltBuyerCreativeId): Request[Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: Anon_AccountIdAltBuyerCreativeIdFields): Request[Creative]
  /** Submit a new creative. */
  def insert(request: Anon_AltFields): Request[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter): Request[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: Anon_AccountIdAltBuyerCreativeIdFields): Request[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: Anon_AccountIdAltBuyerCreativeId): Request[Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: Anon_AccountIdAltBuyerCreativeId => Request[Unit],
    get: Anon_AccountIdAltBuyerCreativeIdFields => Request[Creative],
    insert: Anon_AltFields => Request[Creative],
    list: Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter => Request[CreativesList],
    listDeals: Anon_AccountIdAltBuyerCreativeIdFields => Request[CreativeDealIds],
    removeDeal: Anon_AccountIdAltBuyerCreativeId => Request[Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
  
    __obj.asInstanceOf[CreativesResource]
  }
}


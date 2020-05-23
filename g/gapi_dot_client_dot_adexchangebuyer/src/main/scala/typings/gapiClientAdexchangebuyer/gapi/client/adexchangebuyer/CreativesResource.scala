package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.BuyerCreativeId
import typings.gapiClientAdexchangebuyer.anon.DealsStatusFilter
import typings.gapiClientAdexchangebuyer.anon.Fields
import typings.gapiClientAdexchangebuyer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: BuyerCreativeId): Request[Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: Key): Request[Creative]
  /** Submit a new creative. */
  def insert(request: Fields): Request[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: DealsStatusFilter): Request[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: Key): Request[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: BuyerCreativeId): Request[Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: BuyerCreativeId => Request[Unit],
    get: Key => Request[Creative],
    insert: Fields => Request[Creative],
    list: DealsStatusFilter => Request[CreativesList],
    listDeals: Key => Request[CreativeDealIds],
    removeDeal: BuyerCreativeId => Request[Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
    __obj.asInstanceOf[CreativesResource]
  }
}


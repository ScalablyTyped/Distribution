package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAccountIdAltBuyerCreativeId
import typings.gapiClientAdexchangebuyer.AnonAccountIdAltBuyerCreativeIdDealsStatusFilter
import typings.gapiClientAdexchangebuyer.AnonAccountIdAltBuyerCreativeIdFields
import typings.gapiClientAdexchangebuyer.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: AnonAccountIdAltBuyerCreativeId): Request_[Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: AnonAccountIdAltBuyerCreativeIdFields): Request_[Creative]
  /** Submit a new creative. */
  def insert(request: AnonAltFields): Request_[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: AnonAccountIdAltBuyerCreativeIdDealsStatusFilter): Request_[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: AnonAccountIdAltBuyerCreativeIdFields): Request_[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: AnonAccountIdAltBuyerCreativeId): Request_[Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: AnonAccountIdAltBuyerCreativeId => Request_[Unit],
    get: AnonAccountIdAltBuyerCreativeIdFields => Request_[Creative],
    insert: AnonAltFields => Request_[Creative],
    list: AnonAccountIdAltBuyerCreativeIdDealsStatusFilter => Request_[CreativesList],
    listDeals: AnonAccountIdAltBuyerCreativeIdFields => Request_[CreativeDealIds],
    removeDeal: AnonAccountIdAltBuyerCreativeId => Request_[Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
  
    __obj.asInstanceOf[CreativesResource]
  }
}


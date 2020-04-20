package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonBuyerCreativeId
import typings.gapiClientAdexchangebuyer.AnonDealsStatusFilter
import typings.gapiClientAdexchangebuyer.AnonFields
import typings.gapiClientAdexchangebuyer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: AnonBuyerCreativeId): Request_[Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: AnonKey): Request_[Creative]
  /** Submit a new creative. */
  def insert(request: AnonFields): Request_[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: AnonDealsStatusFilter): Request_[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: AnonKey): Request_[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: AnonBuyerCreativeId): Request_[Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: AnonBuyerCreativeId => Request_[Unit],
    get: AnonKey => Request_[Creative],
    insert: AnonFields => Request_[Creative],
    list: AnonDealsStatusFilter => Request_[CreativesList],
    listDeals: AnonKey => Request_[CreativeDealIds],
    removeDeal: AnonBuyerCreativeId => Request_[Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
    __obj.asInstanceOf[CreativesResource]
  }
}


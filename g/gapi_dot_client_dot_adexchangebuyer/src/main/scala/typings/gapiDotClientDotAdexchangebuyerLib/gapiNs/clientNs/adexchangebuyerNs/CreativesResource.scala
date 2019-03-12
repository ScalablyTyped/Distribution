package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Submit a new creative. */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter): gapiDotClientLib.gapiNs.clientNs.Request[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Creative],
    insert: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Creative],
    list: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter => gapiDotClientLib.gapiNs.clientNs.Request[CreativesList],
    listDeals: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields => gapiDotClientLib.gapiNs.clientNs.Request[CreativeDealIds],
    removeDeal: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(addDeal = js.Any.fromFunction1(addDeal), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listDeals = js.Any.fromFunction1(listDeals), removeDeal = js.Any.fromFunction1(removeDeal))
  
    __obj.asInstanceOf[CreativesResource]
  }
}


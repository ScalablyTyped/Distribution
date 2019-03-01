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
    addDeal: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Creative]
    ],
    insert: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Creative]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativesList]
    ],
    listDeals: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeDealIds]
    ],
    removeDeal: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltBuyerCreativeId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDeal")(addDeal)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("listDeals")(listDeals)
    __obj.updateDynamic("removeDeal")(removeDeal)
    __obj.asInstanceOf[CreativesResource]
  }
}


package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[DeleteOrderDealsResponse],
    insert: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[AddOrderDealsResponse],
    list: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[GetOrderDealsResponse],
    update: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}


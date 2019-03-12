package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[Order]
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_AltFieldsId => gapiDotClientLib.gapiNs.clientNs.Request[Order],
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsKeyMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrdersResource]
  }
}


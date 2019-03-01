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
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Order]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[OrdersListResponse]
    ]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[OrdersResource]
  }
}


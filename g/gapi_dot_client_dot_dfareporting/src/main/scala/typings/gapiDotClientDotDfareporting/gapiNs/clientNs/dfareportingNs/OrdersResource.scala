package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIdsKeyMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: Anon_AltFieldsId): Request[Order]
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIdsKeyMaxResults): Request[OrdersListResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsId => Request[Order],
    list: Anon_AltFieldsIdsKeyMaxResults => Request[OrdersListResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrdersResource]
  }
}


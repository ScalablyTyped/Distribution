package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsId
import typings.gapiClientDfareporting.AnonAltFieldsIdsKeyMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: AnonAltFieldsId): Request_[Order]
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIdsKeyMaxResults): Request_[OrdersListResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsId => Request_[Order],
    list: AnonAltFieldsIdsKeyMaxResults => Request_[OrdersListResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrdersResource]
  }
}


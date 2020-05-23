package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Id
import typings.gapiClientDfareporting.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: Id): Request[Order]
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: ProjectId): Request[OrdersListResponse]
}

object OrdersResource {
  @scala.inline
  def apply(get: Id => Request[Order], list: ProjectId => Request[OrdersListResponse]): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrdersResource]
  }
}


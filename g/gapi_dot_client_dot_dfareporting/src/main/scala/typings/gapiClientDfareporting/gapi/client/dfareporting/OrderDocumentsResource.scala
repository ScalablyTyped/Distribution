package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Approved
import typings.gapiClientDfareporting.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: Id): Request[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: Approved): Request[OrderDocumentsListResponse]
}

object OrderDocumentsResource {
  @scala.inline
  def apply(get: Id => Request[OrderDocument], list: Approved => Request[OrderDocumentsListResponse]): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrderDocumentsResource]
  }
}


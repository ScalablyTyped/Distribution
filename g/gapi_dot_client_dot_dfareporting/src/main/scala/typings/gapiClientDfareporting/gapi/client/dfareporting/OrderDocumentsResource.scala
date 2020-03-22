package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonApproved
import typings.gapiClientDfareporting.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: AnonId): Request_[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: AnonApproved): Request_[OrderDocumentsListResponse]
}

object OrderDocumentsResource {
  @scala.inline
  def apply(get: AnonId => Request_[OrderDocument], list: AnonApproved => Request_[OrderDocumentsListResponse]): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrderDocumentsResource]
  }
}


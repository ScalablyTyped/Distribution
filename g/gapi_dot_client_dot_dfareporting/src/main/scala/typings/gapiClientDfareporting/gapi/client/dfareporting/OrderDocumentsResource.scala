package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltApproved
import typings.gapiClientDfareporting.AnonAltFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: AnonAltFieldsId): Request_[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: AnonAltApproved): Request_[OrderDocumentsListResponse]
}

object OrderDocumentsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsId => Request_[OrderDocument],
    list: AnonAltApproved => Request_[OrderDocumentsListResponse]
  ): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrderDocumentsResource]
  }
}


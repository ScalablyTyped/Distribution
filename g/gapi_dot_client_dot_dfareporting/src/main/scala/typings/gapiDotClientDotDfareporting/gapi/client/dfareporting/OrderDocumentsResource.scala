package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltApproved
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: Anon_AltFieldsId): Request[OrderDocument]
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: Anon_AltApproved): Request[OrderDocumentsListResponse]
}

object OrderDocumentsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsId => Request[OrderDocument],
    list: Anon_AltApproved => Request[OrderDocumentsListResponse]
  ): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrderDocumentsResource]
  }
}


package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonCode
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: AnonCode): Request_[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: AnonKey): Request_[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(get: AnonCode => Request_[PostalCode], list: AnonKey => Request_[PostalCodesListResponse]): PostalCodesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PostalCodesResource]
  }
}


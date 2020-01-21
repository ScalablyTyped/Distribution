package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltCode
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: AnonAltCode): Request_[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: AnonAltFieldsKey): Request_[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(
    get: AnonAltCode => Request_[PostalCode],
    list: AnonAltFieldsKey => Request_[PostalCodesListResponse]
  ): PostalCodesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PostalCodesResource]
  }
}


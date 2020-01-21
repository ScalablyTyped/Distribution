package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: AnonAltFields): Request_[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: AnonAltFieldsKey): Request_[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[MobileCarrier],
    list: AnonAltFieldsKey => Request_[MobileCarriersListResponse]
  ): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MobileCarriersResource]
  }
}


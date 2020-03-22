package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: AnonFields): Request_[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: AnonKey): Request_[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(get: AnonFields => Request_[MobileCarrier], list: AnonKey => Request_[MobileCarriersListResponse]): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MobileCarriersResource]
  }
}


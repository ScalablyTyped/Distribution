package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: Fields): Request[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: Key): Request[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(get: Fields => Request[MobileCarrier], list: Key => Request[MobileCarriersListResponse]): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MobileCarriersResource]
  }
}


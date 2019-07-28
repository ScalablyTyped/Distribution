package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: Anon_AltFields): Request[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: Anon_AltFieldsKey): Request[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[MobileCarrier],
    list: Anon_AltFieldsKey => Request[MobileCarriersListResponse]
  ): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MobileCarriersResource]
  }
}


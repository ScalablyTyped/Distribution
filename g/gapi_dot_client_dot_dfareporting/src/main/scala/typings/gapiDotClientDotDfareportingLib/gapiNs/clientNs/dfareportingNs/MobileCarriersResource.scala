package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersResource extends js.Object {
  /** Gets one mobile carrier by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[MobileCarrier]
  /** Retrieves a list of mobile carriers. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[MobileCarriersListResponse]
}

object MobileCarriersResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileCarrier]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileCarriersListResponse]
    ]
  ): MobileCarriersResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[MobileCarriersResource]
  }
}


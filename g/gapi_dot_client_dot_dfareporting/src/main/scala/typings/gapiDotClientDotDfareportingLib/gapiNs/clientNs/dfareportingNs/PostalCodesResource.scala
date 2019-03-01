package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltCode): gapiDotClientLib.gapiNs.clientNs.Request[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCode, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostalCode]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[PostalCodesListResponse]
    ]
  ): PostalCodesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[PostalCodesResource]
  }
}


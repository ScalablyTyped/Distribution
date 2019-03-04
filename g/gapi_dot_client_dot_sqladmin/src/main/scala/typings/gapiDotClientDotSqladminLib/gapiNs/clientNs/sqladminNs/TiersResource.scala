package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TiersListResponse]
}

object TiersResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TiersListResponse]
    ]
  ): TiersResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[TiersResource]
  }
}


package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TiersListResponse]
}


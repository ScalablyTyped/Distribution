package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersListResponse extends js.Object {
  /** List of tiers. */
  var items: js.UndefOr[js.Array[Tier]] = js.undefined
  /** This is always sql#tiersList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TiersListResponse {
  @scala.inline
  def apply(items: js.Array[Tier] = null, kind: java.lang.String = null): TiersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TiersListResponse]
  }
}


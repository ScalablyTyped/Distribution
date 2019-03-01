package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeDealIds extends js.Object {
  /** A list of external deal ids and ARC approval status. */
  var dealStatuses: js.UndefOr[js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_ArcStatus]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeDealIds {
  @scala.inline
  def apply(
    dealStatuses: js.Array[gapiDotClientDotAdexchangebuyerLib.Anon_ArcStatus] = null,
    kind: java.lang.String = null
  ): CreativeDealIds = {
    val __obj = js.Dynamic.literal()
    if (dealStatuses != null) __obj.updateDynamic("dealStatuses")(dealStatuses)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CreativeDealIds]
  }
}


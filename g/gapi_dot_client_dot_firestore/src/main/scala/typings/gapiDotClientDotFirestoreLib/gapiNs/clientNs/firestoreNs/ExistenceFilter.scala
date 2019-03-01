package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistenceFilter extends js.Object {
  /**
    * The total count of documents that match target_id.
    *
    * If different from the count of documents in the client that match, the
    * client must manually determine which documents no longer match the target.
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** The target ID to which this filter applies. */
  var targetId: js.UndefOr[scala.Double] = js.undefined
}

object ExistenceFilter {
  @scala.inline
  def apply(count: scala.Int | scala.Double = null, targetId: scala.Int | scala.Double = null): ExistenceFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistenceFilter]
  }
}


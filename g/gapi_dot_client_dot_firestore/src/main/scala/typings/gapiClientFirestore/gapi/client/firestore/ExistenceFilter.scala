package typings.gapiClientFirestore.gapi.client.firestore

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
  var count: js.UndefOr[Double] = js.undefined
  /** The target ID to which this filter applies. */
  var targetId: js.UndefOr[Double] = js.undefined
}

object ExistenceFilter {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, targetId: js.UndefOr[Double] = js.undefined): ExistenceFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetId)) __obj.updateDynamic("targetId")(targetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistenceFilter]
  }
}


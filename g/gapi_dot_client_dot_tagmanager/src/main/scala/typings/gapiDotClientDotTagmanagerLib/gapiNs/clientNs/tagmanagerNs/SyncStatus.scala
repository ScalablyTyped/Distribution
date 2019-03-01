package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncStatus extends js.Object {
  /** Synchornization operation detected a merge conflict. */
  var mergeConflict: js.UndefOr[scala.Boolean] = js.undefined
  /** An error occurred during the synchronization operation. */
  var syncError: js.UndefOr[scala.Boolean] = js.undefined
}

object SyncStatus {
  @scala.inline
  def apply(
    mergeConflict: js.UndefOr[scala.Boolean] = js.undefined,
    syncError: js.UndefOr[scala.Boolean] = js.undefined
  ): SyncStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergeConflict)) __obj.updateDynamic("mergeConflict")(mergeConflict)
    if (!js.isUndefined(syncError)) __obj.updateDynamic("syncError")(syncError)
    __obj.asInstanceOf[SyncStatus]
  }
}


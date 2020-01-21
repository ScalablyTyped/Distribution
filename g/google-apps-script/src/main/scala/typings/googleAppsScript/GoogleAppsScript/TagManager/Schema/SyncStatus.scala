package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncStatus extends js.Object {
  var mergeConflict: js.UndefOr[Boolean] = js.undefined
  var syncError: js.UndefOr[Boolean] = js.undefined
}

object SyncStatus {
  @scala.inline
  def apply(mergeConflict: js.UndefOr[Boolean] = js.undefined, syncError: js.UndefOr[Boolean] = js.undefined): SyncStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mergeConflict)) __obj.updateDynamic("mergeConflict")(mergeConflict.asInstanceOf[js.Any])
    if (!js.isUndefined(syncError)) __obj.updateDynamic("syncError")(syncError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncStatus]
  }
}


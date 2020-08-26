package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncStatus extends js.Object {
  /** Synchornization operation detected a merge conflict. */
  var mergeConflict: js.UndefOr[Boolean] = js.native
  /** An error occurred during the synchronization operation. */
  var syncError: js.UndefOr[Boolean] = js.native
}

object SyncStatus {
  @scala.inline
  def apply(): SyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncStatus]
  }
  @scala.inline
  implicit class SyncStatusOps[Self <: SyncStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMergeConflict(value: Boolean): Self = this.set("mergeConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeConflict: Self = this.set("mergeConflict", js.undefined)
    @scala.inline
    def setSyncError(value: Boolean): Self = this.set("syncError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncError: Self = this.set("syncError", js.undefined)
  }
  
}


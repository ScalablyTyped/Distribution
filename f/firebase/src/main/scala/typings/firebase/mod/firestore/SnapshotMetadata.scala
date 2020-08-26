package typings.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotMetadata extends js.Object {
  /**
    * True if the snapshot was created from cached data rather than guaranteed
    * up-to-date server data. If your listener has opted into metadata updates
    * (via `SnapshotListenOptions`)
    * you will receive another snapshot with `fromCache` set to false once
    * the client has received up-to-date data from the backend.
    */
  val fromCache: Boolean = js.native
  /**
    * True if the snapshot contains the result of local writes (e.g. set() or
    * update() calls) that have not yet been committed to the backend.
    * If your listener has opted into metadata updates (via
    * `SnapshotListenOptions`) you will receive another
    * snapshot with `hasPendingWrites` equal to false once the writes have been
    * committed to the backend.
    */
  val hasPendingWrites: Boolean = js.native
  /**
    * Returns true if this `SnapshotMetadata` is equal to the provided one.
    *
    * @param other The `SnapshotMetadata` to compare against.
    * @return true if this `SnapshotMetadata` is equal to the provided one.
    */
  def isEqual(other: SnapshotMetadata): Boolean = js.native
}

object SnapshotMetadata {
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean, isEqual: SnapshotMetadata => Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[SnapshotMetadata]
  }
  @scala.inline
  implicit class SnapshotMetadataOps[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
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
    def setFromCache(value: Boolean): Self = this.set("fromCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPendingWrites(value: Boolean): Self = this.set("hasPendingWrites", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEqual(value: SnapshotMetadata => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
  }
  
}


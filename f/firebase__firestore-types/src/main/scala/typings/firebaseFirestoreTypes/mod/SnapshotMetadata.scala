package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMetadata extends js.Object {
  val fromCache: Boolean
  val hasPendingWrites: Boolean
  def isEqual(other: SnapshotMetadata): Boolean
}

object SnapshotMetadata {
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean, isEqual: SnapshotMetadata => Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[SnapshotMetadata]
  }
}


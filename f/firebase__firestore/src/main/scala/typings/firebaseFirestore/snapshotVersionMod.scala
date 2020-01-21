package typings.firebaseFirestore

import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/snapshot_version", JSImport.Namespace)
@js.native
object snapshotVersionMod extends js.Object {
  @js.native
  class SnapshotVersion protected () extends js.Object {
    var timestamp: js.Any = js.native
    def compareTo(other: SnapshotVersion): Double = js.native
    def isEqual(other: SnapshotVersion): Boolean = js.native
    /** Returns a number representation of the version for use in spec tests. */
    def toMicroseconds(): Double = js.native
    def toTimestamp(): Timestamp = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotVersion extends js.Object {
    val MIN: SnapshotVersion = js.native
    def forDeletedDoc(): SnapshotVersion = js.native
    def fromMicroseconds(value: Double): SnapshotVersion = js.native
    def fromTimestamp(value: Timestamp): SnapshotVersion = js.native
  }
  
}


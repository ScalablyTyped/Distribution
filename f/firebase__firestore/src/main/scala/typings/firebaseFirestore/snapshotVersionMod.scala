package typings.firebaseFirestore

import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/snapshot_version", JSImport.Namespace)
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
    def fromTimestamp(value: Timestamp): SnapshotVersion = js.native
    def min(): SnapshotVersion = js.native
  }
  
}


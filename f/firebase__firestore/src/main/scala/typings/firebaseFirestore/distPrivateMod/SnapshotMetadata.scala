package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/private", "SnapshotMetadata")
@js.native
open class SnapshotMetadata protected () extends StObject {
  /** @hideconstructor */
  def this(hasPendingWrites: Boolean, fromCache: Boolean) = this()
  
  /**
    * True if the snapshot was created from cached data rather than guaranteed
    * up-to-date server data. If your listener has opted into metadata updates
    * (via `SnapshotListenOptions`) you will receive another snapshot with
    * `fromCache` set to false once the client has received up-to-date data from
    * the backend.
    */
  val fromCache: Boolean = js.native
  
  /**
    * True if the snapshot contains the result of local writes (for example
    * `set()` or `update()` calls) that have not yet been committed to the
    * backend. If your listener has opted into metadata updates (via
    * `SnapshotListenOptions`) you will receive another snapshot with
    * `hasPendingWrites` equal to false once the writes have been committed to
    * the backend.
    */
  val hasPendingWrites: Boolean = js.native
  
  /**
    * Returns true if this `SnapshotMetadata` is equal to the provided one.
    *
    * @param other - The `SnapshotMetadata` to compare against.
    * @returns true if this `SnapshotMetadata` is equal to the provided one.
    */
  def isEqual(other: SnapshotMetadata): Boolean = js.native
}

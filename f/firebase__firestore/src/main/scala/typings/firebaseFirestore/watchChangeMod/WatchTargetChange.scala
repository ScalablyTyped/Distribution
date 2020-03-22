package typings.firebaseFirestore.watchChangeMod

import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/watch_change", "WatchTargetChange")
@js.native
class WatchTargetChange protected () extends WatchChange {
  def this(
    /** What kind of change occurred to the watch target. */
  state: WatchTargetChangeState,
    /** The target IDs that were added/removed/set. */
  targetIds: js.Array[TargetId]
  ) = this()
  def this(
    /** What kind of change occurred to the watch target. */
  state: WatchTargetChangeState,
    /** The target IDs that were added/removed/set. */
  targetIds: js.Array[TargetId],
    /**
    * An opaque, server-assigned token that allows watching a target to be
    * resumed after disconnecting without retransmitting all the data that
    * matches the target. The resume token essentially identifies a point in
    * time from which the server should resume sending results.
    */
  resumeToken: ByteString
  ) = this()
  def this(
    /** What kind of change occurred to the watch target. */
  state: WatchTargetChangeState,
    /** The target IDs that were added/removed/set. */
  targetIds: js.Array[TargetId],
    /**
    * An opaque, server-assigned token that allows watching a target to be
    * resumed after disconnecting without retransmitting all the data that
    * matches the target. The resume token essentially identifies a point in
    * time from which the server should resume sending results.
    */
  resumeToken: ByteString,
    /** An RPC error indicating why the watch failed. */
  cause: FirestoreError
  ) = this()
  /** An RPC error indicating why the watch failed. */
  var cause: FirestoreError | Null = js.native
  /**
    * An opaque, server-assigned token that allows watching a target to be
    * resumed after disconnecting without retransmitting all the data that
    * matches the target. The resume token essentially identifies a point in
    * time from which the server should resume sending results.
    */
  var resumeToken: ByteString = js.native
  /** What kind of change occurred to the watch target. */
  var state: WatchTargetChangeState = js.native
  /** The target IDs that were added/removed/set. */
  var targetIds: js.Array[TargetId] = js.native
}


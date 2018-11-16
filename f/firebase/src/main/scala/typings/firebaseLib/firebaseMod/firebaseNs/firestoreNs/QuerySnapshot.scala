package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySnapshot extends js.Object {
  /** An array of all the documents in the QuerySnapshot. */
  val docs: coreDashJsLib.Array[QueryDocumentSnapshot] = js.native
  /** True if there are no documents in the QuerySnapshot. */
  val empty: scala.Boolean = js.native
  /**
       * Metadata about this snapshot, concerning its source and if it has local
       * modifications.
       */
  val metadata: SnapshotMetadata = js.native
  /**
       * The query on which you called `get` or `onSnapshot` in order to get this
       * `QuerySnapshot`.
       */
  val query: Query = js.native
  /** The number of documents in the QuerySnapshot. */
  val size: scala.Double = js.native
  /**
       * Returns an array of the documents changes since the last snapshot. If this
       * is the first snapshot, all documents will be in the list as added changes.
       *
       * @param options `SnapshotListenOptions` that control whether metadata-only
       * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
       * snapshot events.
       */
  def docChanges(): coreDashJsLib.Array[DocumentChange] = js.native
  /**
       * Returns an array of the documents changes since the last snapshot. If this
       * is the first snapshot, all documents will be in the list as added changes.
       *
       * @param options `SnapshotListenOptions` that control whether metadata-only
       * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
       * snapshot events.
       */
  def docChanges(options: SnapshotListenOptions): coreDashJsLib.Array[DocumentChange] = js.native
  /**
       * Enumerates all of the documents in the QuerySnapshot.
       *
       * @param callback A callback to be called with a `QueryDocumentSnapshot` for
       * each document in the snapshot.
       * @param thisArg The `this` binding for the callback.
       */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot, scala.Unit]): scala.Unit = js.native
  /**
       * Enumerates all of the documents in the QuerySnapshot.
       *
       * @param callback A callback to be called with a `QueryDocumentSnapshot` for
       * each document in the snapshot.
       * @param thisArg The `this` binding for the callback.
       */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot, scala.Unit], thisArg: js.Any): scala.Unit = js.native
  /**
       * Returns true if this `QuerySnapshot` is equal to the provided one.
       *
       * @param other The `QuerySnapshot` to compare against.
       * @return true if this `QuerySnapshot` is equal to the provided one.
       */
  def isEqual(other: QuerySnapshot): scala.Boolean = js.native
}


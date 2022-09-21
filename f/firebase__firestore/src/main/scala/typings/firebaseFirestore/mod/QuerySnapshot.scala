package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "QuerySnapshot")
@js.native
/* private */ open class QuerySnapshot[T] () extends StObject {
  
  /**
    * Returns an array of the documents changes since the last snapshot. If this
    * is the first snapshot, all documents will be in the list as 'added'
    * changes.
    *
    * @param options - `SnapshotListenOptions` that control whether metadata-only
    * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
    * snapshot events.
    */
  def docChanges(): js.Array[DocumentChange[T]] = js.native
  def docChanges(options: SnapshotListenOptions): js.Array[DocumentChange[T]] = js.native
  
  /** An array of all the documents in the `QuerySnapshot`. */
  def docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  /** True if there are no documents in the `QuerySnapshot`. */
  def empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the `QuerySnapshot`.
    *
    * @param callback - A callback to be called with a `QueryDocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg - The `this` binding for the callback.
    */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit], thisArg: Any): Unit = js.native
  
  /**
    * Metadata about this snapshot, concerning its source and if it has local
    * modifications.
    */
  val metadata: SnapshotMetadata = js.native
  
  /**
    * The query on which you called `get` or `onSnapshot` in order to get this
    * `QuerySnapshot`.
    */
  val query: Query_[T] = js.native
  
  /** The number of documents in the `QuerySnapshot`. */
  def size: Double = js.native
}

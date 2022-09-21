package typings.firebaseFirestore

import typings.firebaseFirestore.apiDatabaseMod.Firestore
import typings.firebaseFirestore.apiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.coreViewSnapshotMod.ChangeType
import typings.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.firebaseFirestoreStrings.estimate
import typings.firebaseFirestore.firebaseFirestoreStrings.none
import typings.firebaseFirestore.firebaseFirestoreStrings.previous
import typings.firebaseFirestore.liteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.liteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.srcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.srcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.srcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiSnapshotMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/snapshot", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.srcLiteApiSnapshotMod.DocumentSnapshot[T] {
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Null,
      metadata: SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Document,
      metadata: SnapshotMetadata
    ) = this()
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Null,
      metadata: SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Document,
      metadata: SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    
    /* private */ val _firestoreImpl: Any = js.native
    
    def data(options: SnapshotOptions): js.UndefOr[T] = js.native
    
    def get(fieldPath: String, options: SnapshotOptions): Any = js.native
    def get(fieldPath: FieldPath, options: SnapshotOptions): Any = js.native
    
    /**
      *  Metadata about the `DocumentSnapshot`, including information about its
      *  source and local modifications.
      */
    val metadata: SnapshotMetadata = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/snapshot", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Null,
      metadata: SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Document,
      metadata: SnapshotMetadata
    ) = this()
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Null,
      metadata: SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: Firestore,
      userDataWriter: AbstractUserDataWriter,
      key: DocumentKey,
      document: Document,
      metadata: SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/snapshot", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected () extends StObject {
    /** @hideconstructor */
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      query: Query[T],
      _snapshot: ViewSnapshot
    ) = this()
    
    /* private */ var _cachedChanges: Any = js.native
    
    /* private */ var _cachedChangesIncludeMetadataChanges: Any = js.native
    
    val _firestore: Firestore = js.native
    
    val _snapshot: ViewSnapshot = js.native
    
    val _userDataWriter: AbstractUserDataWriter = js.native
    
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
    val query: Query[T] = js.native
    
    /** The number of documents in the `QuerySnapshot`. */
    def size: Double = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/api/snapshot", "SnapshotMetadata")
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
  
  inline def changesFromSnapshot[T](querySnapshot: QuerySnapshot[T], includeMetadataChanges: Boolean): js.Array[DocumentChange[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("changesFromSnapshot")(querySnapshot.asInstanceOf[js.Any], includeMetadataChanges.asInstanceOf[js.Any])).asInstanceOf[js.Array[DocumentChange[T]]]
  
  inline def resultChangeType(`type`: ChangeType): DocumentChangeType = ^.asInstanceOf[js.Dynamic].applyDynamic("resultChangeType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DocumentChangeType]
  
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait DocumentChange[T] extends StObject {
    
    /** The document affected by this change. */
    val doc: QueryDocumentSnapshot[T]
    
    /**
      * The index of the changed document in the result set immediately after
      * this `DocumentChange` (i.e. supposing that all prior `DocumentChange`
      * objects and the current `DocumentChange` object have been applied).
      * Is -1 for 'removed' events.
      */
    val newIndex: Double
    
    /**
      * The index of the changed document in the result set immediately prior to
      * this `DocumentChange` (i.e. supposing that all prior `DocumentChange` objects
      * have been applied). Is `-1` for 'added' events.
      */
    val oldIndex: Double
    
    /** The type of change ('added', 'modified', or 'removed'). */
    val `type`: DocumentChangeType
  }
  object DocumentChange {
    
    inline def apply[T](doc: QueryDocumentSnapshot[T], newIndex: Double, oldIndex: Double, `type`: DocumentChangeType): DocumentChange[T] = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentChange[T]]
    }
    
    extension [Self <: DocumentChange[?], T](x: Self & DocumentChange[T]) {
      
      inline def setDoc(value: QueryDocumentSnapshot[T]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: DocumentChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.added
    - typings.firebaseFirestore.firebaseFirestoreStrings.removed
    - typings.firebaseFirestore.firebaseFirestoreStrings.modified
  */
  trait DocumentChangeType extends StObject
  object DocumentChangeType {
    
    inline def added: typings.firebaseFirestore.firebaseFirestoreStrings.added = "added".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.added]
    
    inline def modified: typings.firebaseFirestore.firebaseFirestoreStrings.modified = "modified".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.modified]
    
    inline def removed: typings.firebaseFirestore.firebaseFirestoreStrings.removed = "removed".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.removed]
  }
  
  @js.native
  trait FirestoreDataConverter[T]
    extends StObject
       with typings.firebaseFirestore.srcLiteApiSnapshotMod.FirestoreDataConverter[T] {
    
    /**
      * Called by the Firestore SDK to convert Firestore data into an object of
      * type T. You can access your data by calling: `snapshot.data(options)`.
      *
      * @param snapshot - A `QueryDocumentSnapshot` containing your data and metadata.
      * @param options - The `SnapshotOptions` from the initial call to `data()`.
      */
    def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): T = js.native
    def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData], options: SnapshotOptions): T = js.native
  }
  
  trait SnapshotOptions extends StObject {
    
    /**
      * If set, controls the return value for server timestamps that have not yet
      * been set to their final value.
      *
      * By specifying 'estimate', pending server timestamps return an estimate
      * based on the local clock. This estimate will differ from the final value
      * and cause these values to change once the server result becomes available.
      *
      * By specifying 'previous', pending timestamps will be ignored and return
      * their previous value instead.
      *
      * If omitted or set to 'none', `null` will be returned by default until the
      * server value becomes available.
      */
    val serverTimestamps: js.UndefOr[estimate | previous | none] = js.undefined
  }
  object SnapshotOptions {
    
    inline def apply(): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotOptions]
    }
    
    extension [Self <: SnapshotOptions](x: Self) {
      
      inline def setServerTimestamps(value: estimate | previous | none): Self = StObject.set(x, "serverTimestamps", value.asInstanceOf[js.Any])
      
      inline def setServerTimestampsUndefined: Self = StObject.set(x, "serverTimestamps", js.undefined)
    }
  }
}

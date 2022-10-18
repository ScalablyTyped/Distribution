package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLiteApiSnapshotMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/snapshot", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected () extends StObject {
    /** @hideconstructor protected */
    def this(_firestore: Firestore, _userDataWriter: AbstractUserDataWriter, _key: DocumentKey) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    
    var _converter: UntypedFirestoreDataConverter[T] | Null = js.native
    
    var _document: Document | Null = js.native
    
    var _firestore: Firestore = js.native
    
    var _key: DocumentKey = js.native
    
    var _userDataWriter: AbstractUserDataWriter = js.native
    
    /**
      * Retrieves all fields in the document as an `Object`. Returns `undefined` if
      * the document doesn't exist.
      *
      * @returns An `Object` containing all fields in the document or `undefined`
      * if the document doesn't exist.
      */
    def data(): js.UndefOr[T] = js.native
    
    /**
      * Signals whether or not the document at the snapshot's location exists.
      *
      * @returns true if the document exists.
      */
    def exists(): /* is @firebase/firestore.@firebase/firestore/dist/lite/firestore/src/lite-api/snapshot.QueryDocumentSnapshot<T> */ Boolean = js.native
    
    /**
      * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
      * document or field doesn't exist.
      *
      * @param fieldPath - The path (for example 'foo' or 'foo.bar') to a specific
      * field.
      * @returns The data at the specified field location or undefined if no such
      * field exists in the document.
      */
    def get(fieldPath: String): Any = js.native
    def get(fieldPath: FieldPath): Any = js.native
    
    /** Property of the `DocumentSnapshot` that provides the document's ID. */
    def id: String = js.native
    
    /**
      * The `DocumentReference` for the document included in the `DocumentSnapshot`.
      */
    def ref: DocumentReference[T] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/snapshot", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
    /** @hideconstructor protected */
    def this(_firestore: Firestore, _userDataWriter: AbstractUserDataWriter, _key: DocumentKey) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/snapshot", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected () extends StObject {
    /** @hideconstructor */
    def this(_query: Query[T], _docs: js.Array[QueryDocumentSnapshot[T]]) = this()
    
    val _docs: js.Array[QueryDocumentSnapshot[T]] = js.native
    
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
      * The query on which you called {@link getDocs} in order to get this
      * `QuerySnapshot`.
      */
    val query: Query[T] = js.native
    
    /** The number of documents in the `QuerySnapshot`. */
    def size: Double = js.native
  }
  
  inline def fieldPathFromArgument(methodName: String, arg: String): typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath]
  inline def fieldPathFromArgument(methodName: String, arg: FieldPath): typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath]
  inline def fieldPathFromArgument(methodName: String, arg: Compat[FieldPath]): typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldPathFromArgument")(methodName.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath]
  
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait FirestoreDataConverter[T] extends StObject {
    
    /**
      * Called by the Firestore SDK to convert Firestore data into an object of
      * type T. You can access your data by calling: `snapshot.data()`.
      *
      * @param snapshot - A `QueryDocumentSnapshot` containing your data and
      * metadata.
      */
    def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): T = js.native
    
    /**
      * Called by the Firestore SDK to convert a custom model object of type `T`
      * into a plain Javascript object (suitable for writing directly to the
      * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
      * and {@link @firebase/firestore/lite#(Transaction.set:1)} with `merge:true` or `mergeFields`.
      *
      * The `PartialWithFieldValue<T>` type extends `Partial<T>` to allow
      * FieldValues such as {@link (arrayUnion:1)} to be used as property values.
      * It also supports nested `Partial` by allowing nested fields to be
      * omitted.
      */
    def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
    /**
      * Called by the Firestore SDK to convert a custom model object of type `T`
      * into a plain Javascript object (suitable for writing directly to the
      * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
      * and {@link @firebase/firestore/lite#(Transaction.set:1)}.
      *
      * The `WithFieldValue<T>` type extends `T` to also allow FieldValues such as
      * {@link (deleteField:1)} to be used as property values.
      */
    def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
  }
}

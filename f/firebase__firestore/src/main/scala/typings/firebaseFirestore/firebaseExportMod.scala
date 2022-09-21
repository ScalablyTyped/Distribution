package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.Complete
import typings.firebaseFirestore.anon.Error
import typings.firebaseFirestore.anon.Instantiable
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.Next
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.errorMod.FirestoreErrorCode
import typings.firebaseFirestore.firestoreClientMod.FirestoreClient
import typings.firebaseFirestore.indexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.liteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.liteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.liteApiReferenceMod.DocumentData
import typings.firebaseFirestore.liteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.liteApiReferenceMod.Query
import typings.firebaseFirestore.liteApiReferenceMod.SetOptions
import typings.firebaseFirestore.liteApiReferenceMod.UpdateData
import typings.firebaseFirestore.liteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.liteApiSettingsMod.PrivateSettings
import typings.firebaseFirestore.liteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.liteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.referenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.referenceImplMod.Unsubscribe
import typings.firebaseFirestore.settingsMod.FirestoreSettings
import typings.firebaseFirestore.settingsMod.PersistenceSettings
import typings.firebaseFirestore.userDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.userMod.User
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.firebaseLogger.srcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseExportMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "AbstractUserDataWriter")
  @js.native
  abstract class AbstractUserDataWriter ()
    extends typings.firebaseFirestore.srcMod.AbstractUserDataWriter
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString")
  @js.native
  /* private */ open class ByteString ()
    extends typings.firebaseFirestore.srcMod.ByteString
  /* static members */
  object ByteString {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString.EMPTY_BYTE_STRING")
    @js.native
    val EMPTY_BYTE_STRING: typings.firebaseFirestore.byteStringMod.ByteString = js.native
    
    inline def fromBase64String(base64: String): typings.firebaseFirestore.byteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.byteStringMod.ByteString]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.byteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.byteStringMod.ByteString]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Bytes")
  @js.native
  open class Bytes protected ()
    extends typings.firebaseFirestore.srcMod.Bytes {
    /** @hideconstructor */
    def this(byteString: typings.firebaseFirestore.byteStringMod.ByteString) = this()
  }
  /* static members */
  object Bytes {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typings.firebaseFirestore.liteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiBytesMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.liteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiBytesMod.Bytes]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: /* -1 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.srcMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      converter: Null,
      _path: typings.firebaseFirestore.pathMod.ResourcePath
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[T],
      _path: typings.firebaseFirestore.pathMod.ResourcePath
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DatabaseId")
  @js.native
  open class DatabaseId protected ()
    extends typings.firebaseFirestore.srcMod.DatabaseId {
    def this(projectId: String) = this()
    def this(projectId: String, database: String) = this()
  }
  /* static members */
  object DatabaseId {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DatabaseId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): typings.firebaseFirestore.databaseInfoMod.DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.databaseInfoMod.DatabaseId]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DocumentKey")
  @js.native
  open class DocumentKey protected ()
    extends typings.firebaseFirestore.srcMod.DocumentKey {
    def this(path: typings.firebaseFirestore.pathMod.ResourcePath) = this()
  }
  /* static members */
  object DocumentKey {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DocumentKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def comparator(
      k1: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      k2: typings.firebaseFirestore.documentKeyMod.DocumentKey
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def empty(): typings.firebaseFirestore.documentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.documentKeyMod.DocumentKey]
    
    inline def fromName(name: String): typings.firebaseFirestore.documentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.documentKeyMod.DocumentKey]
    
    inline def fromPath(path: String): typings.firebaseFirestore.documentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.documentKeyMod.DocumentKey]
    
    /**
      * Creates and returns a new document key with the given segments.
      *
      * @param segments - The segments of the path to the document
      * @returns A new instance of DocumentKey
      */
    inline def fromSegments(segments: js.Array[String]): typings.firebaseFirestore.documentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.documentKeyMod.DocumentKey]
    
    inline def isDocumentKey(path: typings.firebaseFirestore.pathMod.ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.srcMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: typings.firebaseFirestore.documentKeyMod.DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: typings.firebaseFirestore.documentKeyMod.DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.srcMod.DocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_EmptyAppCheckTokenProvider")
  @js.native
  open class EmptyAppCheckTokenProvider ()
    extends typings.firebaseFirestore.srcMod.EmptyAppCheckTokenProvider
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_EmptyAuthCredentialsProvider")
  @js.native
  open class EmptyAuthCredentialsProvider ()
    extends typings.firebaseFirestore.srcMod.EmptyAuthCredentialsProvider
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.srcMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FieldValue")
  @js.native
  abstract class FieldValue protected ()
    extends typings.firebaseFirestore.srcMod.FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestore.srcMod.Firestore {
    /** @hideconstructor */
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.databaseInfoMod.DatabaseId
    ) = this()
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.databaseInfoMod.DatabaseId,
      app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FirestoreError")
  @js.native
  open class FirestoreError protected ()
    extends typings.firebaseFirestore.srcMod.FirestoreError {
    /** @hideconstructor */
    def this(
      /**
      * The backend error code associated with this error.
      */
    code: FirestoreErrorCode,
      /**
      * A custom error description.
      */
    message: String
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.srcMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "LoadBundleTask")
  @js.native
  open class LoadBundleTask ()
    extends typings.firebaseFirestore.srcMod.LoadBundleTask
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryConstraint")
  @js.native
  abstract class QueryConstraint ()
    extends typings.firebaseFirestore.srcMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.srcMod.QueryDocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.documentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.snapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestore.srcMod.QuerySnapshot[T] {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      _userDataWriter: typings.firebaseFirestore.userDataWriterMod.AbstractUserDataWriter,
      query: Query[T],
      _snapshot: ViewSnapshot
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Query")
  @js.native
  open class Query_[T] protected ()
    extends typings.firebaseFirestore.srcMod.Query_[T] {
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.queryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.queryMod.Query
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ResourcePath")
  @js.native
  open class ResourcePath ()
    extends typings.firebaseFirestore.srcMod.ResourcePath
  /* static members */
  object ResourcePath {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ResourcePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.pathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.pathMod.ResourcePath]
    
    /**
      * Creates a resource path from the given slash-delimited string. If multiple
      * arguments are provided, all components are combined. Leading and trailing
      * slashes from all components are ignored.
      */
    inline def fromString(pathComponents: String*): typings.firebaseFirestore.pathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.pathMod.ResourcePath]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "SnapshotMetadata")
  @js.native
  open class SnapshotMetadata protected ()
    extends typings.firebaseFirestore.srcMod.SnapshotMetadata {
    /** @hideconstructor */
    def this(hasPendingWrites: Boolean, fromCache: Boolean) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.srcMod.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds - The number of seconds of UTC time since Unix epoch
      *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      *     9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds - The non-negative fractions of a second at nanosecond
      *     resolution. Negative second values with fractions must still have
      *     non-negative nanoseconds values that count forward in time. Must be
      *     from 0 to 999,999,999 inclusive.
      */
    def this(
      /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    seconds: Double,
      /**
      * The fractions of a second at nanosecond resolution.*
      */
    nanoseconds: Double
    ) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.liteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.liteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.liteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.liteApiTimestampMod.Timestamp]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.srcMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.databaseMod.Firestore,
      _transaction: typings.firebaseFirestore.coreTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.srcMod.WriteBatch_ {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
      _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_FieldPath")
  @js.native
  open class _FieldPath ()
    extends typings.firebaseFirestore.srcMod._FieldPath
  /* static members */
  object _FieldPath {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.pathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.pathMod.FieldPath]
    
    /**
      * Parses a field string from the given server-formatted string.
      *
      * - Splitting the empty string is not allowed (for now at least).
      * - Empty segments within the string (e.g. if there are two consecutive
      *   separators) are not allowed.
      *
      * TODO(b/37244157): we should make this more strict. Right now, it allows
      * non-identifier path components, even if they aren't escaped.
      */
    inline def fromServerFormat(path: String): typings.firebaseFirestore.pathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.pathMod.FieldPath]
    
    /**
      * Returns true if the string could be used as a segment in a field path
      * without escaping.
      */
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_FieldPath.isValidIdentifier")
    @js.native
    def isValidIdentifier: Any = js.native
    inline def isValidIdentifier_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidIdentifier")(x.asInstanceOf[js.Any])
    
    /**
      * The field designating the key of a document.
      */
    inline def keyField(): typings.firebaseFirestore.pathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[typings.firebaseFirestore.pathMod.FieldPath]
  }
  
  inline def addDoc[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T],
    data: WithFieldValue[T]
  ): js.Promise[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]]]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.liteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiFieldValueMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.liteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiFieldValueMod.FieldValue]
  
  inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]
  
  inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def collection(
    firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore, collectionId: String): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def deleteDoc(reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.liteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.liteApiFieldValueMod.FieldValue]
  
  inline def disableNetwork(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def doc(
    firestore: typings.firebaseFirestore.liteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.liteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.liteApiFieldPathMod.FieldPath]
  
  inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enableIndexedDbPersistence(
    firestore: typings.firebaseFirestore.databaseMod.Firestore,
    persistenceSettings: PersistenceSettings
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableNetwork(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.liteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.liteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def ensureFirestoreConfigured(firestore: typings.firebaseFirestore.databaseMod.Firestore): FirestoreClient = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(firestore.asInstanceOf[js.Any]).asInstanceOf[FirestoreClient]
  
  inline def executeWrite(firestore: typings.firebaseFirestore.databaseMod.Firestore, mutations: js.Array[Mutation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(firestore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocFromCache[T](reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocFromServer[T](reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]]]
  
  inline def getDocsFromCache[T](query: Query[T]): js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]]]
  
  inline def getDocsFromServer[T](query: Query[T]): js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typings.firebaseFirestore.databaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.databaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.databaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  inline def getFirestore(databaseId: String): typings.firebaseFirestore.databaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.liteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiFieldValueMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.databaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.databaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.databaseMod.Firestore]
  
  inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]
  
  inline def limit(limit: Double): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def loadBundle(firestore: typings.firebaseFirestore.databaseMod.Firestore, bundleData: String): typings.firebaseFirestore.bundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.bundleMod.LoadBundleTask]
  inline def loadBundle(firestore: typings.firebaseFirestore.databaseMod.Firestore, bundleData: js.typedarray.ArrayBuffer): typings.firebaseFirestore.bundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.bundleMod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.databaseMod.Firestore,
    bundleData: ReadableStream[js.typedarray.Uint8Array]
  ): typings.firebaseFirestore.bundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.bundleMod.LoadBundleTask]
  
  inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def namedQuery(firestore: typings.firebaseFirestore.databaseMod.Firestore, name: String): js.Promise[Query[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query[DocumentData] | Null]]
  
  inline def newTestApp(projectId: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestApp")(projectId.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  inline def newTestApp(projectId: String, appName: String): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestApp")(projectId.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  
  inline def newTestFirestore(app: FirebaseApp): typings.firebaseFirestore.srcMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.srcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: Unit, dbName: String): typings.firebaseFirestore.srcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.srcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: PrivateSettings): typings.firebaseFirestore.srcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.srcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: PrivateSettings, dbName: String): typings.firebaseFirestore.srcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.srcMod.Firestore]
  
  inline def onSnapshot[T](query: Query[T], observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.QuerySnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T], observer: Error[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    observer: Error[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.firebaseFirestore.errorMod.FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T], Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.databaseMod.Firestore, observer: Next): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.databaseMod.Firestore, onSync: js.Function0[Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.liteApiFieldPathMod.FieldPath): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.liteApiFieldPathMod.FieldPath, directionStr: OrderByDirection): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def query[T](query: Query[T], queryConstraints: typings.firebaseFirestore.liteApiQueryMod.QueryConstraint*): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.liteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.databaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.transactionMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.databaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.transactionMod.Transaction, 
      js.Promise[T]
    ],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.liteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.liteApiFieldValueMod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T],
    data: WithFieldValue[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.databaseMod.Firestore, configuration: IndexConfiguration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.databaseMod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.snapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.snapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.snapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.liteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.liteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[Any],
    field: typings.firebaseFirestore.liteApiFieldPathMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: typings.firebaseFirestore.liteApiReferenceMod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForPendingWrites(firestore: typings.firebaseFirestore.databaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.liteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.liteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.liteApiQueryMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.databaseMod.Firestore): typings.firebaseFirestore.liteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.liteApiWriteBatchMod.WriteBatch_]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      @JSName("firestore/lite")
      var firestoreSlashlite: typings.firebaseFirestore.liteApiDatabaseMod.Firestore
    }
    object NameServiceMapping {
      
      inline def apply(firestoreSlashlite: typings.firebaseFirestore.liteApiDatabaseMod.Firestore): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("firestore/lite")(firestoreSlashlite.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFirestoreSlashlite(value: typings.firebaseFirestore.liteApiDatabaseMod.Firestore): Self = StObject.set(x, "firestore/lite", value.asInstanceOf[js.Any])
      }
    }
  }
}

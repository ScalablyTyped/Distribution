package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.Complete
import typings.firebaseFirestore.anon.CountAggregateField
import typings.firebaseFirestore.anon.Error
import typings.firebaseFirestore.anon.Instantiable
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.Next
import typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distFirestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.distFirestoreSrcApiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.distFirestoreSrcApiReferenceImplMod.Unsubscribe
import typings.firebaseFirestore.distFirestoreSrcApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distFirestoreSrcApiSettingsMod.PersistenceSettings
import typings.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distFirestoreSrcCoreFirestoreClientMod.FirestoreClient
import typings.firebaseFirestore.distFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpecData
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiSettingsMod.PrivateSettings
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestIntegrationUtilFirebaseExportMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "AbstractUserDataWriter")
  @js.native
  open class AbstractUserDataWriter ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.AbstractUserDataWriter
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.AggregateField[T]
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "AggregateQuerySnapshot")
  @js.native
  open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.AggregateQuerySnapshot[T] {
    /** @hideconstructor */
    def this(query: Query[Any], _data: AggregateSpecData[T]) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString")
  @js.native
  /* private */ open class ByteString ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.ByteString
  /* static members */
  object ByteString {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ByteString.EMPTY_BYTE_STRING")
    @js.native
    val EMPTY_BYTE_STRING: typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString = js.native
    
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Bytes")
  @js.native
  open class Bytes protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.Bytes {
    /** @hideconstructor */
    def this(byteString: typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString) = this()
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
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiBytesMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiBytesMod.Bytes]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: /* -1 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: Null,
      _path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[T],
      _path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DatabaseId")
  @js.native
  open class DatabaseId protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.DatabaseId {
    def this(projectId: String) = this()
    def this(projectId: String, database: String) = this()
  }
  /* static members */
  object DatabaseId {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DatabaseId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DocumentKey")
  @js.native
  open class DocumentKey protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.DocumentKey {
    def this(path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath) = this()
  }
  /* static members */
  object DocumentKey {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_DocumentKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def comparator(
      k1: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      k2: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def empty(): typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def fromName(name: String): typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def fromPath(path: String): typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    /**
      * Creates and returns a new document key with the given segments.
      *
      * @param segments - The segments of the path to the document
      * @returns A new instance of DocumentKey
      */
    inline def fromSegments(segments: js.Array[String]): typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def isDocumentKey(path: typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.DocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_EmptyAppCheckTokenProvider")
  @js.native
  open class EmptyAppCheckTokenProvider ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.EmptyAppCheckTokenProvider
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_EmptyAuthCredentialsProvider")
  @js.native
  open class EmptyAuthCredentialsProvider ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.EmptyAuthCredentialsProvider
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.Firestore {
    /** @hideconstructor */
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
    ) = this()
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId,
      app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "FirestoreError")
  @js.native
  open class FirestoreError protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.FirestoreError {
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
    extends typings.firebaseFirestore.distFirestoreSrcMod.GeoPoint {
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
    extends typings.firebaseFirestore.distFirestoreSrcMod.LoadBundleTask
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.QueryDocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.QuerySnapshot[T] {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      _userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      query: Query[T],
      _snapshot: ViewSnapshot
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Query")
  @js.native
  open class Query_[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.Query_[T] {
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ResourcePath")
  @js.native
  open class ResourcePath ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.ResourcePath
  /* static members */
  object ResourcePath {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_ResourcePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath]
    
    /**
      * Creates a resource path from the given slash-delimited string. If multiple
      * arguments are provided, all components are combined. Leading and trailing
      * slashes from all components are ignored.
      */
    inline def fromString(pathComponents: String*): typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "SnapshotMetadata")
  @js.native
  open class SnapshotMetadata protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.SnapshotMetadata {
    /** @hideconstructor */
    def this(hasPendingWrites: Boolean, fromCache: Boolean) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.Timestamp {
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
    inline def fromDate(date: js.Date): typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
      _transaction: typings.firebaseFirestore.distFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distFirestoreSrcMod.WriteBatch_ {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_FieldPath")
  @js.native
  open class _FieldPath ()
    extends typings.firebaseFirestore.distFirestoreSrcMod._FieldPath
  /* static members */
  object _FieldPath {
    
    @JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "_FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
    
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
    inline def fromServerFormat(path: String): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
    
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
    inline def keyField(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath]
  }
  
  inline def addDoc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    data: WithFieldValue[T]
  ): js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]
  
  inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def collection(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    collectionId: String
  ): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]
  
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def deleteDoc(reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def disableNetwork(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def doc(
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath]
  
  inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enableIndexedDbPersistence(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    persistenceSettings: PersistenceSettings
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableNetwork(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def ensureFirestoreConfigured(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): FirestoreClient = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(firestore.asInstanceOf[js.Any]).asInstanceOf[FirestoreClient]
  
  inline def executeWrite(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    mutations: js.Array[Mutation]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(firestore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getCountFromServer(query: typings.firebaseFirestore.distFirestoreSrcApiMod.Query_[Any]): js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[CountAggregateField]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[CountAggregateField]
  ]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocFromCache[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocFromServer[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]
  
  inline def getDocsFromCache[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]
  
  inline def getDocsFromServer[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore]
  
  inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def loadBundle(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, bundleData: String): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    bundleData: js.typedarray.ArrayBuffer
  ): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    bundleData: ReadableStream[js.typedarray.Uint8Array]
  ): typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcApiBundleMod.LoadBundleTask]
  
  inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def namedQuery(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, name: String): js.Promise[Query[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query[DocumentData] | Null]]
  
  inline def newTestApp(projectId: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestApp")(projectId.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  inline def newTestApp(projectId: String, appName: String): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestApp")(projectId.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  
  inline def newTestFirestore(app: FirebaseApp): typings.firebaseFirestore.distFirestoreSrcMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: Unit, dbName: String): typings.firebaseFirestore.distFirestoreSrcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: PrivateSettings): typings.firebaseFirestore.distFirestoreSrcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcMod.Firestore]
  inline def newTestFirestore(app: FirebaseApp, settings: PrivateSettings, dbName: String): typings.firebaseFirestore.distFirestoreSrcMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcMod.Firestore]
  
  inline def onSnapshot[T](query: Query[T], observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    observer: Error[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    observer: Error[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onSnapshotsInSync(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, observer: Next): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshotsInSync(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    onSync: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distFirestoreSrcApiTransactionMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distFirestoreSrcApiTransactionMod.Transaction, 
      js.Promise[T]
    ],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: WithFieldValue[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIndexConfiguration(
    firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore,
    configuration: IndexConfiguration
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](
    reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: UpdateData[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForPendingWrites(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore
    }
    object NameServiceMapping {
      
      inline def apply(firestore: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): NameServiceMapping = {
        val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setFirestore(value: typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
      }
    }
  }
}

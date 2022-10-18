package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.Instantiable
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.`39`
import typings.firebaseFirestore.anon.`40`
import typings.firebaseFirestore.anon.`41`
import typings.firebaseFirestore.anon.`42`
import typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distPackagesFirestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.distPackagesFirestoreSrcApiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcApiReferenceImplMod.Unsubscribe
import typings.firebaseFirestore.distPackagesFirestoreSrcApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distPackagesFirestoreSrcApiSettingsMod.PersistenceSettings
import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreFirestoreClientMod.FirestoreClient
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpecData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcIndexDotnodeMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "AbstractUserDataWriter")
  @js.native
  open class AbstractUserDataWriter ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.AbstractUserDataWriter
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.AggregateField[T]
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "AggregateQuerySnapshot")
  @js.native
  open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.AggregateQuerySnapshot[T] {
    /** @hideconstructor */
    def this(query: Query[Any], _data: AggregateSpecData[T]) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_ByteString")
  @js.native
  /* private */ open class ByteString ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.ByteString
  /* static members */
  object ByteString {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_ByteString")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_ByteString.EMPTY_BYTE_STRING")
    @js.native
    val EMPTY_BYTE_STRING: typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString = js.native
    
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Bytes")
  @js.native
  open class Bytes protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Bytes {
    /** @hideconstructor */
    def this(byteString: typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString) = this()
  }
  /* static members */
  object Bytes {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiBytesMod.Bytes]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: /* -1 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: Null,
      _path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[T],
      _path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DatabaseId")
  @js.native
  open class DatabaseId protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.DatabaseId {
    def this(projectId: String) = this()
    def this(projectId: String, database: String) = this()
  }
  /* static members */
  object DatabaseId {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DatabaseId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DocumentKey")
  @js.native
  open class DocumentKey protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.DocumentKey {
    def this(path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath) = this()
  }
  /* static members */
  object DocumentKey {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_DocumentKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def comparator(
      k1: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      k2: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def empty(): typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def fromName(name: String): typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def fromPath(path: String): typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    /**
      * Creates and returns a new document key with the given segments.
      *
      * @param segments - The segments of the path to the document
      * @returns A new instance of DocumentKey
      */
    inline def fromSegments(segments: js.Array[String]): typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey]
    
    inline def isDocumentKey(path: typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.DocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_EmptyAppCheckTokenProvider")
  @js.native
  open class EmptyAppCheckTokenProvider ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.EmptyAppCheckTokenProvider
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_EmptyAuthCredentialsProvider")
  @js.native
  open class EmptyAuthCredentialsProvider ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.EmptyAuthCredentialsProvider
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Firestore {
    /** @hideconstructor */
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
    ) = this()
    def this(
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      databaseId: typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId,
      app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "FirestoreError")
  @js.native
  open class FirestoreError protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.FirestoreError {
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
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "LoadBundleTask")
  @js.native
  open class LoadBundleTask ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.LoadBundleTask
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.QueryDocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Null,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      key: typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey,
      document: Document,
      metadata: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.SnapshotMetadata,
      converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.QuerySnapshot[T] {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      _userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
      query: Query[T],
      _snapshot: ViewSnapshot
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Query")
  @js.native
  open class Query_[T] protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Query_[T] {
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_ResourcePath")
  @js.native
  open class ResourcePath ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.ResourcePath
  /* static members */
  object ResourcePath {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_ResourcePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath]
    
    /**
      * Creates a resource path from the given slash-delimited string. If multiple
      * arguments are provided, all components are combined. Leading and trailing
      * slashes from all components are ignored.
      */
    inline def fromString(pathComponents: String*): typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "SnapshotMetadata")
  @js.native
  open class SnapshotMetadata protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.SnapshotMetadata {
    /** @hideconstructor */
    def this(hasPendingWrites: Boolean, fromCache: Boolean) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Timestamp {
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
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
      _transaction: typings.firebaseFirestore.distPackagesFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.WriteBatch_ {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
      _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_FieldPath")
  @js.native
  open class _FieldPath ()
    extends typings.firebaseFirestore.distPackagesFirestoreSrcApiMod._FieldPath
  /* static members */
  object _FieldPath {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath]
    
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
    inline def fromServerFormat(path: String): typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath]
    
    /**
      * Returns true if the string could be used as a segment in a field path
      * without escaping.
      */
    @JSImport("@firebase/firestore/dist/packages/firestore/src/index.node", "_FieldPath.isValidIdentifier")
    @js.native
    def isValidIdentifier: Any = js.native
    inline def isValidIdentifier_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidIdentifier")(x.asInstanceOf[js.Any])
    
    /**
      * The field designating the key of a document.
      */
    inline def keyField(): typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath]
  }
  
  inline def addDoc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    data: WithFieldValue[T]
  ): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def cast[T](obj: js.Object, constructor: Instantiable[T]): T | scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("_cast")(obj.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[T | scala.Nothing]
  
  inline def clearIndexedDbPersistence(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def collection(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    collectionId: String
  ): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]
  
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debugAssert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_debugAssert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts assertion */ Boolean]
  
  inline def deleteDoc(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def disableNetwork(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def doc(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath]
  
  inline def enableIndexedDbPersistence(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def enableIndexedDbPersistence(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    persistenceSettings: PersistenceSettings
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enableNetwork(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(
    snapshot: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(
    snapshot: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def ensureFirestoreConfigured(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): FirestoreClient = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFirestoreConfigured")(firestore.asInstanceOf[js.Any]).asInstanceOf[FirestoreClient]
  
  inline def executeWrite(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    mutations: js.Array[Mutation]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWrite")(firestore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getCountFromServer(query: typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Query_[Any]): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`39`]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`39`]
  ]]
  
  inline def getDoc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ]]
  
  inline def getDocFromCache[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ]]
  
  inline def getDocFromServer[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ]]
  
  inline def getDocsFromCache[T](query: Query[T]): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ]]
  
  inline def getDocsFromServer[T](query: Query[T]): js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ]]
  
  inline def getFirestore(): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  inline def getFirestore(databaseId: String): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore]
  
  inline def isBase64Available(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBase64Available")().asInstanceOf[Boolean]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def loadBundle(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    bundleData: String
  ): typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    bundleData: js.typedarray.ArrayBuffer
  ): typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask]
  inline def loadBundle(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    bundleData: ReadableStream[js.typedarray.Uint8Array]
  ): typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.LoadBundleTask]
  
  inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logWarn")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def namedQuery(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    name: String
  ): js.Promise[Query[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query[DocumentData] | Null]]
  
  inline def onSnapshot[T](query: Query[T], observer: `40`[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: `40`[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    query: Query[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    observer: `41`[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    observer: `41`[T]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: js.Function1[
      /* error */ typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError, 
      Unit
    ],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshot[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    options: SnapshotListenOptions,
    onNext: js.Function1[
      /* snapshot */ typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T], 
      Unit
    ],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onSnapshotsInSync(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    observer: `42`
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onSnapshotsInSync(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    onSync: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distPackagesFirestoreSrcApiTransactionMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distPackagesFirestoreSrcApiTransactionMod.Transaction, 
      js.Promise[T]
    ],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: WithFieldValue[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIndexConfiguration(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    configuration: IndexConfiguration
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(
    firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore,
    json: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(
    snapshot: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(
    snapshot: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](
    reference: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: UpdateData[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Boolean, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateIsNotUsedTogether(optionName1: String, argument1: Unit, optionName2: String, argument2: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateIsNotUsedTogether")(optionName1.asInstanceOf[js.Any], argument1.asInstanceOf[js.Any], optionName2.asInstanceOf[js.Any], argument2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def waitForPendingWrites(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distPackagesFirestoreSrcApiDatabaseMod.Firestore): typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
}

package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.`11`
import typings.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateSpecData
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.OrderByDirection
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreLiteMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateField[T]
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "AggregateQuerySnapshot")
  @js.native
  open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T] {
    /** @hideconstructor */
    def this(query: Query[Any], _data: AggregateSpecData[T]) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Bytes")
  @js.native
  open class Bytes protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiBytesMod.Bytes {
    /** @hideconstructor */
    def this(byteString: ByteString) = this()
  }
  /* static members */
  object Bytes {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiBytesMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiBytesMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiBytesMod.Bytes]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: Null,
      _path: ResourcePath
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[T],
      _path: ResourcePath
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T] {
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/lite", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore {
    /** @hideconstructor */
    def this(
      _authCredentials: CredentialsProvider[User],
      _appCheckCredentials: CredentialsProvider[String],
      _databaseId: DatabaseId
    ) = this()
    def this(
      _authCredentials: CredentialsProvider[User],
      _appCheckCredentials: CredentialsProvider[String],
      _databaseId: DatabaseId,
      _app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "FirestoreError")
  @js.native
  open class FirestoreError protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError {
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
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiGeoPointMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/lite", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QueryDocumentSnapshot[T] {
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T] {
    /** @hideconstructor */
    def this(
      _query: Query[T],
      _docs: js.Array[
            typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QueryDocumentSnapshot[T]
          ]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Query")
  @js.native
  open class Query_[T] protected () extends Query[T] {
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp {
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
    
    @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _transaction: typings.firebaseFirestore.distLiteFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/lite", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
      _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
    ) = this()
  }
  
  inline def addDoc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    data: WithFieldValue[T]
  ): js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def collection(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    collectionId: String
  ): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]
  
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def doc(
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def getCount(query: Query[Any]): js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`11`]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[`11`]
  ]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ]]
  
  inline def getFirestore(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(databaseId: String): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def orderBy(
    fieldPath: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def query[T](
    query: Query[T],
    queryConstraints: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint*
  ): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTransactionMod.Transaction, 
      js.Promise[T]
    ],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: WithFieldValue[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[Any],
    field: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](
    reference: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.DocumentReference[T],
    data: UpdateData[T]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiDatabaseMod.Firestore): typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
}

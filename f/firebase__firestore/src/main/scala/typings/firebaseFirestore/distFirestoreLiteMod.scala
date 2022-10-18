package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.CountAggregateField
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
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
import typings.firebaseFirestore.distFirestoreSrcLiteApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UntypedFirestoreDataConverter
import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreLiteMod {
  
  @JSImport("@firebase/firestore/dist/firestore/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateField[T]
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "AggregateQuerySnapshot")
  @js.native
  open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T] {
    /** @hideconstructor */
    def this(query: Query[Any], _data: AggregateSpecData[T]) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "Bytes")
  @js.native
  open class Bytes protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiBytesMod.Bytes {
    /** @hideconstructor */
    def this(byteString: ByteString) = this()
  }
  /* static members */
  object Bytes {
    
    @JSImport("@firebase/firestore/dist/firestore/lite", "Bytes")
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
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: Null,
      _path: ResourcePath
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[T],
      _path: ResourcePath
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: DocumentKey
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T] {
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/lite", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue {
    /**
      * @param _methodName - The public API endpoint that returns this class.
      * @hideconstructor
      */
    def this(_methodName: String) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore {
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
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "FirestoreError")
  @js.native
  open class FirestoreError protected ()
    extends typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreError {
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
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiGeoPointMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/firestore/lite", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QueryDocumentSnapshot[T] {
    /** @hideconstructor protected */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Null,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _userDataWriter: AbstractUserDataWriter,
      _key: DocumentKey,
      _document: Document,
      _converter: UntypedFirestoreDataConverter[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T] {
    /** @hideconstructor */
    def this(
      _query: Query[T],
      _docs: js.Array[
            typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QueryDocumentSnapshot[T]
          ]
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "Query")
  @js.native
  open class Query_[T] protected () extends Query[T] {
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
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiTimestampMod.Timestamp {
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
    
    @JSImport("@firebase/firestore/dist/firestore/lite", "Timestamp")
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
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionMod.Transaction {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _transaction: typings.firebaseFirestore.distFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
  }
  
  @JSImport("@firebase/firestore/dist/firestore/lite", "WriteBatch")
  @js.native
  open class WriteBatch_ protected ()
    extends typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ {
    /** @hideconstructor */
    def this(
      _firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
      _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]
    ) = this()
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
  
  inline def deleteDoc(reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
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
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def getCount(query: Query[Any]): js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[CountAggregateField]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[CountAggregateField]
  ]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: Query[T]): js.Promise[typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(app: FirebaseApp, databaseId: String): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def getFirestore(databaseId: String): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(databaseId.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiFieldValueMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: String): typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
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
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionMod.Transaction, 
      js.Promise[T]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore,
    updateFunction: js.Function1[
      /* transaction */ typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionMod.Transaction, 
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
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
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
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  inline def where(
    fieldPath: typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore): typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcLiteApiWriteBatchMod.WriteBatch_]
}

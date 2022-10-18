package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.Count
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.distLiteMod.AggregateSpec
import typings.firebaseFirestore.distLiteMod.DocumentData
import typings.firebaseFirestore.distLiteMod.OrderByDirection
import typings.firebaseFirestore.distLiteMod.PartialWithFieldValue
import typings.firebaseFirestore.distLiteMod.SetOptions
import typings.firebaseFirestore.distLiteMod.Settings
import typings.firebaseFirestore.distLiteMod.TransactionOptions
import typings.firebaseFirestore.distLiteMod.UpdateData
import typings.firebaseFirestore.distLiteMod.WhereFilterOp
import typings.firebaseFirestore.distLiteMod.WithFieldValue
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatAuthDistFirestoreLiteMod {
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "AggregateField")
  @js.native
  open class AggregateField[T] ()
    extends typings.firebaseFirestore.liteMod.AggregateField[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "AggregateQuerySnapshot")
  @js.native
  /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] ()
    extends typings.firebaseFirestore.liteMod.AggregateQuerySnapshot[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "Bytes")
  @js.native
  /* private */ open class Bytes ()
    extends typings.firebaseFirestore.liteMod.Bytes
  /* static members */
  object Bytes {
    
    @JSImport("firebase/compat/auth/dist/firestore/lite", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): typings.firebaseFirestore.distLiteMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestore.distLiteMod.Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.Bytes]
  }
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends typings.firebaseFirestore.liteMod.CollectionReference[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends typings.firebaseFirestore.liteMod.DocumentReference[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends typings.firebaseFirestore.liteMod.DocumentSnapshot[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestore.liteMod.FieldPath {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/compat/auth/dist/firestore/lite", "FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends typings.firebaseFirestore.liteMod.FieldValue
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "Firestore")
  @js.native
  /* private */ open class Firestore ()
    extends typings.firebaseFirestore.liteMod.Firestore
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "FirestoreError")
  @js.native
  /* private */ open class FirestoreError ()
    extends typings.firebaseFirestore.liteMod.FirestoreError
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestore.liteMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("firebase/compat/auth/dist/firestore/lite", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typings.firebaseFirestore.liteMod.QueryConstraint
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "QueryDocumentSnapshot")
  @js.native
  /* protected */ open class QueryDocumentSnapshot[T] ()
    extends typings.firebaseFirestore.liteMod.QueryDocumentSnapshot[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends typings.firebaseFirestore.liteMod.QuerySnapshot[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "Query")
  @js.native
  /* protected */ open class Query_[T] ()
    extends typings.firebaseFirestore.liteMod.Query_[T]
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestore.liteMod.Timestamp {
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
    
    @JSImport("firebase/compat/auth/dist/firestore/lite", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.distLiteMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.distLiteMod.Timestamp]
  }
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends typings.firebaseFirestore.liteMod.Transaction
  
  @JSImport("firebase/compat/auth/dist/firestore/lite", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch_ ()
    extends typings.firebaseFirestore.liteMod.WriteBatch_
  
  inline def addDoc[T](reference: typings.firebaseFirestore.distLiteMod.CollectionReference[T], data: WithFieldValue[T]): js.Promise[typings.firebaseFirestore.distLiteMod.DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseFirestore.distLiteMod.DocumentReference[T]]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](
    left: typings.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): typings.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def arrayUnion(elements: Any*): typings.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def collection(firestore: typings.firebaseFirestore.distLiteMod.Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distLiteMod.CollectionReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  inline def collection(
    reference: typings.firebaseFirestore.distLiteMod.DocumentReference[DocumentData],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: typings.firebaseFirestore.distLiteMod.Firestore, collectionId: String): typings.firebaseFirestore.distLiteMod.Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.Query_[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: typings.firebaseFirestore.distLiteMod.Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(
    firestore: typings.firebaseFirestore.distLiteMod.Firestore,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(reference: typings.firebaseFirestore.distLiteMod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): typings.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def doc(firestore: typings.firebaseFirestore.distLiteMod.Firestore, path: String, pathSegments: String*): typings.firebaseFirestore.distLiteMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.DocumentReference[DocumentData]]
  inline def doc(
    reference: typings.firebaseFirestore.distLiteMod.DocumentReference[Any],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteMod.DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.DocumentReference[DocumentData]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distLiteMod.CollectionReference[T],
    path: String,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.DocumentReference[T]]
  inline def doc[T](
    reference: typings.firebaseFirestore.distLiteMod.CollectionReference[T],
    path: Unit,
    pathSegments: String*
  ): typings.firebaseFirestore.distLiteMod.DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.distLiteMod.DocumentReference[T]]
  
  inline def documentId(): typings.firebaseFirestore.distLiteMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldPath]
  
  inline def endAt(fieldValues: Any*): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def endAt(snapshot: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def endBefore(snapshot: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def getCount(query: typings.firebaseFirestore.distLiteMod.Query_[Any]): js.Promise[typings.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[Count]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distLiteMod.AggregateQuerySnapshot[Count]]]
  
  inline def getDoc[T](reference: typings.firebaseFirestore.distLiteMod.DocumentReference[T]): js.Promise[typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: typings.firebaseFirestore.distLiteMod.Query_[T]): js.Promise[typings.firebaseFirestore.distLiteMod.QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseFirestore.distLiteMod.QuerySnapshot[T]]]
  
  inline def getFirestore(): typings.firebaseFirestore.distLiteMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[typings.firebaseFirestore.distLiteMod.Firestore]
  inline def getFirestore(app: FirebaseApp): typings.firebaseFirestore.distLiteMod.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.Firestore]
  
  inline def increment(n: Double): typings.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: Settings): typings.firebaseFirestore.distLiteMod.Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.Firestore]
  
  inline def limit(limit: Double): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def orderBy(fieldPath: String): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): typings.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distLiteMod.FieldPath): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def orderBy(fieldPath: typings.firebaseFirestore.distLiteMod.FieldPath, directionStr: OrderByDirection): typings.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def query[T](
    query: typings.firebaseFirestore.distLiteMod.Query_[T],
    queryConstraints: typings.firebaseFirestore.distLiteMod.QueryConstraint*
  ): typings.firebaseFirestore.distLiteMod.Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.firebaseFirestore.distLiteMod.Query_[T]]
  
  inline def queryEqual[T](
    left: typings.firebaseFirestore.distLiteMod.Query_[T],
    right: typings.firebaseFirestore.distLiteMod.Query_[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteMod.CollectionReference[T],
    right: typings.firebaseFirestore.distLiteMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteMod.CollectionReference[T],
    right: typings.firebaseFirestore.distLiteMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteMod.DocumentReference[T],
    right: typings.firebaseFirestore.distLiteMod.CollectionReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](
    left: typings.firebaseFirestore.distLiteMod.DocumentReference[T],
    right: typings.firebaseFirestore.distLiteMod.DocumentReference[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distLiteMod.Firestore,
    updateFunction: js.Function1[/* transaction */ typings.firebaseFirestore.distLiteMod.Transaction, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: typings.firebaseFirestore.distLiteMod.Firestore,
    updateFunction: js.Function1[/* transaction */ typings.firebaseFirestore.distLiteMod.Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): typings.firebaseFirestore.distLiteMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestore.distLiteMod.FieldValue]
  
  inline def setDoc[T](
    reference: typings.firebaseFirestore.distLiteMod.DocumentReference[T],
    data: PartialWithFieldValue[T],
    options: SetOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](reference: typings.firebaseFirestore.distLiteMod.DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T],
    right: typings.firebaseFirestore.distLiteMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](
    left: typings.firebaseFirestore.distLiteMod.QuerySnapshot[T],
    right: typings.firebaseFirestore.distLiteMod.QuerySnapshot[T]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def startAfter(snapshot: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def startAt(fieldValues: Any*): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def startAt(snapshot: typings.firebaseFirestore.distLiteMod.DocumentSnapshot[Any]): typings.firebaseFirestore.distLiteMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def terminate(firestore: typings.firebaseFirestore.distLiteMod.Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(
    reference: typings.firebaseFirestore.distLiteMod.DocumentReference[Any],
    field: String,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(
    reference: typings.firebaseFirestore.distLiteMod.DocumentReference[Any],
    field: typings.firebaseFirestore.distLiteMod.FieldPath,
    value: Any,
    moreFieldsAndValues: Any*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: typings.firebaseFirestore.distLiteMod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  inline def where(fieldPath: typings.firebaseFirestore.distLiteMod.FieldPath, opStr: WhereFilterOp, value: Any): typings.firebaseFirestore.distLiteMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestore.distLiteMod.QueryConstraint]
  
  inline def writeBatch(firestore: typings.firebaseFirestore.distLiteMod.Firestore): typings.firebaseFirestore.distLiteMod.WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteMod.WriteBatch_]
}

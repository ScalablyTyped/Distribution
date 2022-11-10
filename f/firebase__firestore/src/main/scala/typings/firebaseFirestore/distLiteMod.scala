package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.anon.Count
import typings.firebaseFirestore.anon.Latitude
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.anon.Nanoseconds
import typings.firebaseFirestore.firebaseFirestoreStrings.`firestore-lite`
import typings.firebaseFirestore.firebaseFirestoreStrings.collection
import typings.firebaseFirestore.firebaseFirestoreStrings.firestore
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import typings.firebaseFirestore.firebaseFirestoreStrings.query
import typings.firebaseFirestore.firebaseFirestoreStrings.unknown_
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteMod {
  
  @JSImport("@firebase/firestore/dist/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite", "AggregateField")
  @js.native
  open class AggregateField[T] () extends StObject {
    
    /** A type string to uniquely identify instances of this class. */
    var `type`: String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "AggregateQuerySnapshot")
  @js.native
  /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] () extends StObject {
    
    /**
      * Returns the results of the aggregations performed over the underlying
      * query.
      *
      * The keys of the returned object will be the same as those of the
      * `AggregateSpec` object specified to the aggregation method, and the values
      * will be the corresponding aggregation result.
      *
      * @returns The results of the aggregations performed over the underlying
      * query.
      */
    def data(): AggregateSpecData[T] = js.native
    
    /**
      * The underlying query over which the aggregations recorded in this
      * `AggregateQuerySnapshot` were performed.
      */
    val query: Query_[Any] = js.native
    
    /** A type string to uniquely identify instances of this class. */
    val `type`: /* "AggregateQuerySnapshot" */ String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "Bytes")
  @js.native
  /* private */ open class Bytes () extends StObject {
    
    /**
      * Returns true if this `Bytes` object is equal to the provided one.
      *
      * @param other - The `Bytes` object to compare against.
      * @returns true if this `Bytes` object is equal to the provided one.
      */
    def isEqual(other: Bytes): Boolean = js.native
    
    /**
      * Returns the underlying bytes as a Base64-encoded string.
      *
      * @returns The Base64-encoded string created from the `Bytes` object.
      */
    def toBase64(): String = js.native
    
    /**
      * Returns the underlying bytes in a new `Uint8Array`.
      *
      * @returns The Uint8Array created from the `Bytes` object.
      */
    def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Bytes {
    
    @JSImport("@firebase/firestore/dist/lite", "Bytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `Bytes` object from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64 - The Base64 string used to create the `Bytes` object.
      */
    inline def fromBase64String(base64: String): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[Bytes]
    
    /**
      * Creates a new `Bytes` object from the given Uint8Array.
      *
      * @param array - The Uint8Array used to create the `Bytes` object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[Bytes]
  }
  
  @JSImport("@firebase/firestore/dist/lite", "CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] () extends Query_[T] {
    
    /** The collection's identifier. */
    def id: String = js.native
    
    /**
      * A reference to the containing `DocumentReference` if this is a
      * subcollection. If this isn't a subcollection, the reference is null.
      */
    def parent: DocumentReference[DocumentData] | Null = js.native
    
    /**
      * A string representing the path of the referenced collection (relative
      * to the root of the database).
      */
    def path: String = js.native
    
    /** The type of this Firestore reference. */
    @JSName("type")
    val type_CollectionReference: /* "collection" */ String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] () extends StObject {
    
    /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    val converter: FirestoreDataConverter[T] | Null = js.native
    
    /**
      * The {@link Firestore} instance the document is in.
      * This is useful for performing transactions, for example.
      */
    val firestore: Firestore = js.native
    
    /**
      * The document's identifier within its collection.
      */
    def id: String = js.native
    
    /**
      * The collection this `DocumentReference` belongs to.
      */
    def parent: CollectionReference[T] = js.native
    
    /**
      * A string representing the path of the referenced document (relative
      * to the root of the database).
      */
    def path: String = js.native
    
    /** The type of this Firestore reference. */
    val `type`: /* "document" */ String = js.native
    
    /**
      * Removes the current converter.
      *
      * @param converter - `null` removes the current converter.
      * @returns A `DocumentReference<DocumentData>` that does not use a converter.
      */
    def withConverter(converter: Null): DocumentReference[DocumentData] = js.native
    /**
      * Applies a custom data converter to this `DocumentReference`, allowing you
      * to use your own custom model objects with Firestore. When you call {@link
      * @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#getDoc}, etc. with the returned `DocumentReference`
      * instance, the provided converter will convert between Firestore data and
      * your custom type `U`.
      *
      * @param converter - Converts objects to and from Firestore.
      * @returns A `DocumentReference<U>` that uses the provided converter.
      */
    def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] () extends StObject {
    
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
    def exists(): /* is @firebase/firestore.@firebase/firestore/dist/lite.QueryDocumentSnapshot<T> */ Boolean = js.native
    
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
  
  @JSImport("@firebase/firestore/dist/lite", "FieldPath")
  @js.native
  open class FieldPath protected () extends StObject {
    /**
      * Creates a `FieldPath` from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
    
    /**
      * Returns true if this `FieldPath` is equal to the provided one.
      *
      * @param other - The `FieldPath` to compare against.
      * @returns true if this `FieldPath` is equal to the provided one.
      */
    def isEqual(other: FieldPath): Boolean = js.native
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite", "FieldValue")
  @js.native
  /* private */ open class FieldValue () extends StObject {
    
    /** Compares `FieldValue`s for equality. */
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "Firestore")
  @js.native
  /* private */ open class Firestore () extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} associated with this `Firestore` service
      * instance.
      */
    def app: FirebaseApp = js.native
    
    /** Returns a JSON-serializable representation of this `Firestore` instance. */
    def toJSON(): js.Object = js.native
    
    /**
      * Whether it's a Firestore or Firestore Lite instance.
      */
    var `type`: `firestore-lite` | firestore = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "FirestoreError")
  @js.native
  /* private */ open class FirestoreError () extends FirebaseError {
    
    /**
      * The backend error code associated with this error.
      */
    @JSName("code")
    val code_FirestoreError: FirestoreErrorCode = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "GeoPoint")
  @js.native
  open class GeoPoint protected () extends StObject {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
    
    /**
      * Returns true if this `GeoPoint` is equal to the provided one.
      *
      * @param other - The `GeoPoint` to compare against.
      * @returns true if this `GeoPoint` is equal to the provided one.
      */
    def isEqual(other: GeoPoint): Boolean = js.native
    
    /**
      * The latitude of this `GeoPoint` instance.
      */
    def latitude: Double = js.native
    
    /**
      * The longitude of this `GeoPoint` instance.
      */
    def longitude: Double = js.native
    
    /** Returns a JSON-serializable representation of this GeoPoint. */
    def toJSON(): Latitude = js.native
  }
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite", "QueryConstraint")
  @js.native
  open class QueryConstraint () extends StObject {
    
    /** The type of this query constraints */
    val `type`: QueryConstraintType = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "QueryDocumentSnapshot")
  @js.native
  /* protected */ open class QueryDocumentSnapshot[T] () extends DocumentSnapshot[T]
  
  @JSImport("@firebase/firestore/dist/lite", "QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] () extends StObject {
    
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
    val query: Query_[T] = js.native
    
    /** The number of documents in the `QuerySnapshot`. */
    def size: Double = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "Query")
  @js.native
  /* protected */ open class Query_[T] () extends StObject {
    
    /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    val converter: FirestoreDataConverter[T] | Null = js.native
    
    /**
      * The `Firestore` instance for the Firestore database (useful for performing
      * transactions, etc.).
      */
    val firestore: Firestore = js.native
    
    /** The type of this Firestore reference. */
    val `type`: query | collection = js.native
    
    /**
      * Removes the current converter.
      *
      * @param converter - `null` removes the current converter.
      * @returns A `Query<DocumentData>` that does not use a converter.
      */
    def withConverter(converter: Null): Query_[DocumentData] = js.native
    /**
      * Applies a custom data converter to this query, allowing you to use your own
      * custom model objects with Firestore. When you call {@link getDocs} with
      * the returned query, the provided converter will convert between Firestore
      * data and your custom type `U`.
      *
      * @param converter - Converts objects to and from Firestore.
      * @returns A `Query<U>` that uses the provided converter.
      */
    def withConverter[U](converter: FirestoreDataConverter[U]): Query_[U] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "Timestamp")
  @js.native
  open class Timestamp protected () extends StObject {
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
    
    /**
      * Returns true if this `Timestamp` is equal to the provided one.
      *
      * @param other - The `Timestamp` to compare against.
      * @returns true if this `Timestamp` is equal to the provided one.
      */
    def isEqual(other: Timestamp): Boolean = js.native
    
    /**
      * The fractions of a second at nanosecond resolution.*
      */
    val nanoseconds: Double = js.native
    
    /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    val seconds: Double = js.native
    
    /**
      * Converts a `Timestamp` to a JavaScript `Date` object. This conversion
      * causes a loss of precision since `Date` objects only support millisecond
      * precision.
      *
      * @returns JavaScript `Date` object representing the same point in time as
      *     this `Timestamp`, with millisecond precision.
      */
    def toDate(): js.Date = js.native
    
    /** Returns a JSON-serializable representation of this `Timestamp`. */
    def toJSON(): Nanoseconds = js.native
    
    /**
      * Converts a `Timestamp` to a numeric timestamp (in milliseconds since
      * epoch). This operation causes a loss of precision.
      *
      * @returns The point in time corresponding to this timestamp, represented as
      *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
      */
    def toMillis(): Double = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@firebase/firestore/dist/lite", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Timestamp]
  }
  
  @JSImport("@firebase/firestore/dist/lite", "Transaction")
  @js.native
  /* private */ open class Transaction () extends StObject {
    
    /**
      * Deletes the document referred to by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be deleted.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def delete(documentRef: DocumentReference[Any]): this.type = js.native
    
    /**
      * Reads the document referenced by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be read.
      * @returns A `DocumentSnapshot` with the read data.
      */
    def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
    
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      * If you provide `merge` or `mergeFields`, the provided data can be merged
      * into an existing document.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @param options - An object to configure the set behavior.
      * @throws Error - If the provided input is not a valid Firestore document.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): this.type = js.native
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @throws Error - If the provided input is not a valid Firestore document.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): this.type = js.native
    
    /**
      * Updates fields in the document referred to by the provided {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * Nested fields can be updated by providing dot-separated field path
      * strings or by providing `FieldPath` objects.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param field - The first field to update.
      * @param value - The first value.
      * @param moreFieldsAndValues - Additional key/value pairs.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def update(documentRef: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): this.type = js.native
    def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): this.type = js.native
    /**
      * Updates fields in the document referred to by the provided {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param data - An object containing the fields and values with which to
      * update the document. Fields can contain dots to reference nested fields
      * within the document.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): this.type = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite", "WriteBatch")
  @js.native
  /* private */ open class WriteBatch_ () extends StObject {
    
    /**
      * Commits all of the writes in this write batch as a single atomic unit.
      *
      * The result of these writes will only be reflected in document reads that
      * occur after the returned promise resolves. If the client is offline, the
      * write fails. If you would like to see local modifications or buffer writes
      * until the client is online, use the full Firestore SDK.
      *
      * @returns A `Promise` resolved once all of the writes in the batch have been
      * successfully written to the backend as an atomic unit (note that it won't
      * resolve while you're offline).
      */
    def commit(): js.Promise[Unit] = js.native
    
    /**
      * Deletes the document referred to by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be deleted.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def delete(documentRef: DocumentReference[Any]): WriteBatch_ = js.native
    
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      * If you provide `merge` or `mergeFields`, the provided data can be merged
      * into an existing document.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @param options - An object to configure the set behavior.
      * @throws Error - If the provided input is not a valid Firestore document.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): WriteBatch_ = js.native
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): WriteBatch_ = js.native
    
    /**
      * Updates fields in the document referred to by this {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * Nested fields can be update by providing dot-separated field path strings
      * or by providing `FieldPath` objects.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param field - The first field to update.
      * @param value - The first value.
      * @param moreFieldsAndValues - Additional key value pairs.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def update(documentRef: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): WriteBatch_ = js.native
    def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): WriteBatch_ = js.native
    /**
      * Updates fields in the document referred to by the provided {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param data - An object containing the fields and values with which to
      * update the document. Fields can contain dots to reference nested fields
      * within the document.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): WriteBatch_ = js.native
  }
  
  inline def addDoc[T](reference: CollectionReference[T], data: WithFieldValue[T]): js.Promise[DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentReference[T]]]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayRemove(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  inline def arrayUnion(elements: Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  inline def collection(firestore: Firestore, path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  inline def collection(reference: CollectionReference[Any], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  inline def collection(reference: DocumentReference[DocumentData], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: Firestore, collectionId: String): Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query_[DocumentData]]
  
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDoc(reference: DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteField(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")().asInstanceOf[FieldValue]
  
  inline def doc(firestore: Firestore, path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
  inline def doc(reference: DocumentReference[Any], path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
  inline def doc[T](reference: CollectionReference[T], path: String, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
  inline def doc[T](reference: CollectionReference[T], path: Unit, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
  
  inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]
  
  inline def endAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def getCount(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[Count]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[Count]]]
  
  inline def getDoc[T](reference: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]
  
  inline def getDocs[T](query: Query_[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]
  
  inline def getFirestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")().asInstanceOf[Firestore]
  inline def getFirestore(app: FirebaseApp): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  
  inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  inline def initializeFirestore(app: FirebaseApp, settings: Settings): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Firestore]
  
  inline def limit(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def orderBy(fieldPath: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: FieldPath): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def query[T](query: Query_[T], queryConstraints: QueryConstraint*): Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_[T]]
  
  inline def queryEqual[T](left: Query_[T], right: Query_[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](left: CollectionReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: CollectionReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: DocumentReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: DocumentReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def runTransaction[T](firestore: Firestore, updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: Firestore,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]
  
  inline def setDoc[T](reference: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setDoc[T](reference: DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: DocumentSnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: DocumentSnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def snapshotEqual[T](left: QuerySnapshot[T], right: QuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startAfter(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def startAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def terminate(firestore: Firestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def updateDoc(reference: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc(reference: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
  inline def updateDoc[T](reference: DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def writeBatch(firestore: Firestore): WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[WriteBatch_]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T & string as / * template literal string: ${Prefix}.${K} * / string ]:? T[K]}
    }}}
    */
  @js.native
  trait AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] extends StObject
  
  type AggregateFieldType = AggregateField[Double]
  
  type AggregateSpec = StringDictionary[AggregateFieldType]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends @firebase/firestore.@firebase/firestore/dist/lite.AggregateField<infer U>? U : never}
    }}}
    */
  @js.native
  trait AggregateSpecData[T /* <: AggregateSpec */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    V extends std.Record<string, unknown> ? @firebase/firestore.@firebase/firestore/dist/lite.AddPrefixToKeys<K, @firebase/firestore.@firebase/firestore/dist/lite.UpdateData<V>> : never
    }}}
    */
  type ChildUpdateFields[K /* <: String */, V] = AddPrefixToKeys[K, UpdateData[V]]
  
  type DocumentData = /** A mapping between a field and its value. */
  StringDictionary[Any]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.cancelled
    - typings.firebaseFirestore.firebaseFirestoreStrings.unknown_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-found`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition`
    - typings.firebaseFirestore.firebaseFirestoreStrings.aborted
    - typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range`
    - typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented
    - typings.firebaseFirestore.firebaseFirestoreStrings.internal
    - typings.firebaseFirestore.firebaseFirestoreStrings.unavailable
    - typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss`
    - typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated
  */
  trait FirestoreErrorCode extends StObject
  object FirestoreErrorCode {
    
    inline def aborted: typings.firebaseFirestore.firebaseFirestoreStrings.aborted = "aborted".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.aborted]
    
    inline def `already-exists`: typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists`]
    
    inline def cancelled: typings.firebaseFirestore.firebaseFirestoreStrings.cancelled = "cancelled".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.cancelled]
    
    inline def `data-loss`: typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition`]
    
    inline def internal: typings.firebaseFirestore.firebaseFirestoreStrings.internal = "internal".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.internal]
    
    inline def `invalid-argument`: typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument`]
    
    inline def `not-found`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-found`]
    
    inline def `out-of-range`: typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated]
    
    inline def unavailable: typings.firebaseFirestore.firebaseFirestoreStrings.unavailable = "unavailable".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unavailable]
    
    inline def unimplemented: typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented = "unimplemented".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
  
  type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @firebase/firestore.@firebase/firestore/dist/lite.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.desc
    - typings.firebaseFirestore.firebaseFirestoreStrings.asc
  */
  trait OrderByDirection extends StObject
  object OrderByDirection {
    
    inline def asc: typings.firebaseFirestore.firebaseFirestoreStrings.asc = "asc".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.asc]
    
    inline def desc: typings.firebaseFirestore.firebaseFirestoreStrings.desc = "desc".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.desc]
  }
  
  type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @firebase/firestore.@firebase/firestore/dist/lite.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/lite.PartialWithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite.FieldValue} : never */ js.Any)
  
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.where
    - typings.firebaseFirestore.firebaseFirestoreStrings.orderBy
    - typings.firebaseFirestore.firebaseFirestoreStrings.limit
    - typings.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
    - typings.firebaseFirestore.firebaseFirestoreStrings.startAt
    - typings.firebaseFirestore.firebaseFirestoreStrings.startAfter
    - typings.firebaseFirestore.firebaseFirestoreStrings.endAt
    - typings.firebaseFirestore.firebaseFirestoreStrings.endBefore
  */
  trait QueryConstraintType extends StObject
  object QueryConstraintType {
    
    inline def endAt: typings.firebaseFirestore.firebaseFirestoreStrings.endAt = "endAt".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.endAt]
    
    inline def endBefore: typings.firebaseFirestore.firebaseFirestoreStrings.endBefore = "endBefore".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.endBefore]
    
    inline def limit: typings.firebaseFirestore.firebaseFirestoreStrings.limit = "limit".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.limit]
    
    inline def limitToLast: limitToLast_ = "limitToLast".asInstanceOf[limitToLast_]
    
    inline def orderBy: typings.firebaseFirestore.firebaseFirestoreStrings.orderBy = "orderBy".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.orderBy]
    
    inline def startAfter: typings.firebaseFirestore.firebaseFirestoreStrings.startAfter = "startAfter".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.startAfter]
    
    inline def startAt: typings.firebaseFirestore.firebaseFirestoreStrings.startAt = "startAt".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.startAt]
    
    inline def where: typings.firebaseFirestore.firebaseFirestoreStrings.where = "where".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.where]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.anon.Merge
    - typings.firebaseFirestore.anon.`20`
  */
  trait SetOptions extends StObject
  object SetOptions {
    
    inline def `20`(): typings.firebaseFirestore.anon.`20` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseFirestore.anon.`20`]
    }
    
    inline def Merge(): typings.firebaseFirestore.anon.Merge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseFirestore.anon.Merge]
    }
  }
  
  trait Settings extends StObject {
    
    /** The hostname to connect to. */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to skip nested properties that are set to `undefined` during
      * object serialization. If set to `true`, these properties are skipped
      * and not written to Firestore. If set to `false` or omitted, the SDK
      * throws an exception when it encounters properties of type `undefined`.
      */
    var ignoreUndefinedProperties: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to use SSL when connecting. */
    var ssl: js.UndefOr[Boolean] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedPropertiesUndefined: Self = StObject.set(x, "ignoreUndefinedProperties", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait TransactionOptions extends StObject {
    
    /** Maximum number of attempts to commit, after which transaction fails. Default is 5. */
    val maxAttempts: js.UndefOr[Double] = js.undefined
  }
  object TransactionOptions {
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    extension [Self <: TransactionOptions](x: Self) {
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends unknown ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @firebase/firestore.@firebase/firestore/dist/lite.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/lite.UpdateData<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite.FieldValue} & @firebase/firestore.@firebase/firestore/dist/lite.NestedUpdateFields<T> : std.Partial<T>
    }}}
    */
  type UpdateData[T] = T
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
    - typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
    - typings.firebaseFirestore.firebaseFirestoreStrings.in_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`
  */
  trait WhereFilterOp extends StObject
  object WhereFilterOp {
    
    inline def EqualssignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign = "==".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign]
    
    inline def ExclamationmarkEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign]
    
    inline def Greaterthansign: typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign = ">".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign = "<".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign]
    
    inline def `array-contains`: typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains` = "array-contains".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`]
    
    inline def `array-contains-any`: typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any` = "array-contains-any".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`]
    
    inline def in: in_ = "in".asInstanceOf[in_]
    
    inline def `not-in`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-in` = "not-in".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-in`]
  }
  
  type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T extends @firebase/firestore.@firebase/firestore/dist/lite.Primitive ? T : T extends {} ? {[ K in keyof T ]: @firebase/firestore.@firebase/firestore/dist/lite.WithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite.FieldValue} : never */ js.Any)
}

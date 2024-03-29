package typings.googleCloudFirestore

import typings.googleCloudFirestore.FirebaseFirestore.AggregateSpec
import typings.googleCloudFirestore.FirebaseFirestore.AggregateSpecData
import typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus
import typings.googleCloudFirestore.FirebaseFirestore.Settings
import typings.googleCloudFirestore.FirebaseFirestore.WhereFilterOp
import typings.googleCloudFirestore.anon.TypeofFirestoreClient
import typings.googleCloudFirestore.googleCloudFirestoreStrings.create
import typings.googleCloudFirestore.googleCloudFirestoreStrings.delete
import typings.googleCloudFirestore.googleCloudFirestoreStrings.set
import typings.googleCloudFirestore.googleCloudFirestoreStrings.update
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FirebaseFirestore {
    
    @JSGlobal("FirebaseFirestore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FirebaseFirestore.AggregateField")
    @js.native
    /* private */ open class AggregateField[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.AggregateField[T]
    
    @JSGlobal("FirebaseFirestore.AggregateQuery")
    @js.native
    /* private */ open class AggregateQuery[T /* <: AggregateSpec */] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.AggregateQuery[T] {
      
      /**
        * Executes this query.
        *
        * @return A promise that will be resolved with the results of the query.
        */
      /* CompleteClass */
      override def get(): js.Promise[typings.googleCloudFirestore.FirebaseFirestore.AggregateQuerySnapshot[T]] = js.native
      
      /**
        * Compares this object with the given object for equality.
        *
        * This object is considered "equal" to the other object if and only if
        * `other` performs the same aggregations as this `AggregateQuery` and
        * the underlying Query of `other` compares equal to that of this object
        * using `Query.isEqual()`.
        *
        * @param other The object to compare to this object for equality.
        * @return `true` if this object is "equal" to the given object, as
        * defined above, or `false` otherwise.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.AggregateQuery[T]): Boolean = js.native
      
      /** The query whose aggregations will be calculated by this object. */
      /* CompleteClass */
      override val query: typings.googleCloudFirestore.FirebaseFirestore.Query[Any] = js.native
    }
    
    @JSGlobal("FirebaseFirestore.AggregateQuerySnapshot")
    @js.native
    /* private */ open class AggregateQuerySnapshot[T /* <: AggregateSpec */] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.AggregateQuerySnapshot[T] {
      
      /**
        * Returns the results of the aggregations performed over the underlying
        * query.
        *
        * The keys of the returned object will be the same as those of the
        * `AggregateSpec` object specified to the aggregation method, and the
        * values will be the corresponding aggregation result.
        *
        * @returns The results of the aggregations performed over the underlying
        * query.
        */
      /* CompleteClass */
      override def data(): AggregateSpecData[T] = js.native
      
      /**
        * Compares this object with the given object for equality.
        *
        * Two `AggregateQuerySnapshot` instances are considered "equal" if they
        * have the same data and their underlying queries compare "equal" using
        * `AggregateQuery.isEqual()`.
        *
        * @param other The object to compare to this object for equality.
        * @return `true` if this object is "equal" to the given object, as
        * defined above, or `false` otherwise.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.AggregateQuerySnapshot[T]): Boolean = js.native
      
      /** The query that was executed to produce this result. */
      /* CompleteClass */
      override val query: typings.googleCloudFirestore.FirebaseFirestore.AggregateQuery[T] = js.native
      
      /** The time this snapshot was read. */
      /* CompleteClass */
      override val readTime: typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    }
    
    @JSGlobal("FirebaseFirestore.BulkWriter")
    @js.native
    /* private */ open class BulkWriter ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.BulkWriter
    
    @JSGlobal("FirebaseFirestore.BulkWriterError")
    @js.native
    open class BulkWriterError ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.BulkWriterError {
      
      /** The status code of the error. */
      /* CompleteClass */
      override val code: GrpcStatus = js.native
      
      /** The document reference the operation was performed on. */
      /* CompleteClass */
      override val documentRef: typings.googleCloudFirestore.FirebaseFirestore.DocumentReference[Any] = js.native
      
      /** How many times this operation has been attempted unsuccessfully. */
      /* CompleteClass */
      override val failedAttempts: Double = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /** The type of operation performed. */
      /* CompleteClass */
      override val operationType: create | set | update | delete = js.native
    }
    
    @JSGlobal("FirebaseFirestore.BundleBuilder")
    @js.native
    open class BundleBuilder ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.BundleBuilder
    
    @JSGlobal("FirebaseFirestore.CollectionGroup")
    @js.native
    /* private */ open class CollectionGroup[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.CollectionGroup[T]
    
    @JSGlobal("FirebaseFirestore.CollectionReference")
    @js.native
    /* private */ open class CollectionReference[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.CollectionReference[T]
    
    @JSGlobal("FirebaseFirestore.DocumentReference")
    @js.native
    /* private */ open class DocumentReference[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.DocumentReference[T]
    
    @JSGlobal("FirebaseFirestore.DocumentSnapshot")
    @js.native
    /* protected */ open class DocumentSnapshot[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.DocumentSnapshot[T]
    
    @JSGlobal("FirebaseFirestore.FieldPath")
    @js.native
    open class FieldPath protected ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.FieldPath {
      /**
        * Creates a FieldPath from the provided field names. If more than one field
        * name is provided, the path will point to a nested field in a document.
        *
        * @param fieldNames A list of field names.
        */
      def this(fieldNames: String*) = this()
      
      /**
        * Returns true if this `FieldPath` is equal to the provided one.
        *
        * @param other The `FieldPath` to compare against.
        * @return true if this `FieldPath` is equal to the provided one.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.FieldPath): Boolean = js.native
    }
    /* static members */
    object FieldPath {
      
      @JSGlobal("FirebaseFirestore.FieldPath")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a special sentinel FieldPath to refer to the ID of a document.
        * It can be used in queries to sort or filter by the document ID.
        */
      inline def documentId(): typings.googleCloudFirestore.FirebaseFirestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldPath]
    }
    
    @JSGlobal("FirebaseFirestore.FieldValue")
    @js.native
    /* private */ open class FieldValue ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.FieldValue {
      
      /**
        * Returns true if this `FieldValue` is equal to the provided one.
        *
        * @param other The `FieldValue` to compare against.
        * @return true if this `FieldValue` is equal to the provided one.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.FieldValue): Boolean = js.native
    }
    /* static members */
    object FieldValue {
      
      @JSGlobal("FirebaseFirestore.FieldValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to remove the given elements from any array value
        * that already exists on the server. All instances of each element
        * specified will be removed from the array. If the field being modified is
        * not already an array it will be overwritten with an empty array.
        *
        * @param elements The elements to remove from the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      inline def arrayRemove(elements: Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to union the given elements with any array value
        * that already exists on the server. Each specified element that doesn't
        * already exist in the array will be added to the end. If the field being
        * modified is not already an array it will be overwritten with an array
        * containing exactly the specified elements.
        *
        * @param elements The elements to union into the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      inline def arrayUnion(elements: Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a sentinel for use with update() or set() with {merge:true} to
        * mark a field for deletion.
        *
        * @return The FieldValue sentinel for use in a call to set() or update().
        */
      inline def delete(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to increment the field's current value by the given
        * value.
        *
        * If either current field value or the operand uses floating point
        * precision, both values will be interpreted as floating point numbers and
        * all arithmetic will follow IEEE 754 semantics. Otherwise, integer
        * precision is kept and the result is capped between -2^63 and 2^63-1.
        *
        * If the current field value is not of type 'number', or if the field does
        * not yet exist, the transformation will set the field to the given value.
        *
        * @param n The value to increment by.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      inline def increment(n: Double): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a sentinel used with set(), create() or update() to include a
        * server-generated timestamp in the written data.
        *
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      inline def serverTimestamp(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
    }
    
    /* note: abstract class */ @JSGlobal("FirebaseFirestore.Filter")
    @js.native
    open class Filter ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.Filter
    /* static members */
    object Filter {
      
      @JSGlobal("FirebaseFirestore.Filter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new [Filter]{@link Filter} that is a
        * conjunction of the given {@link Filter}s. A conjunction filter includes
        * a document if it satisfies any of the given {@link Filter}s.
        *
        * The returned Filter can be applied to [Query.where()]{@link Query#where},
        * [Filter.or()]{@link Filter#or}, or [Filter.and()]{@link Filter#and}. When
        * applied to a [Query]{@link Query} it requires that documents must satisfy
        * one of the provided {@link Filter}s.
        *
        * @param {...Filter} filters  Optional. The {@link Filter}s
        * for OR operation. These must be created with calls to {@link Filter#where},
        * {@link Filter#or}, or {@link Filter#and}.
        * @returns {Filter} The created {@link Filter}.
        *
        * @example
        * ```
        * let collectionRef = firestore.collection('col');
        *
        * // doc.foo == 'bar' && doc.baz > 0
        * let orFilter = Filter.and(Filter.where('foo', '==', 'bar'), Filter.where('baz', '>', 0));
        *
        * collectionRef.where(orFilter).get().then(querySnapshot => {
        *   querySnapshot.forEach(documentSnapshot => {
        *     console.log(`Found document at ${documentSnapshot.ref.path}`);
        *   });
        * });
        * ```
        */
      inline def and(filters: typings.googleCloudFirestore.FirebaseFirestore.Filter*): typings.googleCloudFirestore.FirebaseFirestore.Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(filters.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Filter]
      
      /**
        * Creates and returns a new [Filter]{@link Filter} that is a
        * disjunction of the given {@link Filter}s. A disjunction filter includes
        * a document if it satisfies any of the given {@link Filter}s.
        *
        * The returned Filter can be applied to [Query.where()]{@link Query#where},
        * [Filter.or()]{@link Filter#or}, or [Filter.and()]{@link Filter#and}. When
        * applied to a [Query]{@link Query} it requires that documents must satisfy
        * one of the provided {@link Filter}s.
        *
        * @param {...Filter} filters  Optional. The {@link Filter}s
        * for OR operation. These must be created with calls to {@link Filter#where},
        * {@link Filter#or}, or {@link Filter#and}.
        * @returns {Filter} The created {@link Filter}.
        *
        * @example
        * ```
        * let collectionRef = firestore.collection('col');
        *
        * // doc.foo == 'bar' || doc.baz > 0
        * let orFilter = Filter.or(Filter.where('foo', '==', 'bar'), Filter.where('baz', '>', 0));
        *
        * collectionRef.where(orFilter).get().then(querySnapshot => {
        *   querySnapshot.forEach(documentSnapshot => {
        *     console.log(`Found document at ${documentSnapshot.ref.path}`);
        *   });
        * });
        * ```
        */
      inline def or(filters: typings.googleCloudFirestore.FirebaseFirestore.Filter*): typings.googleCloudFirestore.FirebaseFirestore.Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(filters.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Filter]
      
      /**
        * Creates and returns a new [Filter]{@link Filter}, which can be
        * applied to [Query.where()]{@link Query#where}, [Filter.or()]{@link Filter#or},
        * or [Filter.and()]{@link Filter#and}. When applied to a [Query]{@link Query}
        * it requires that documents must contain the specified field and that its value should
        * satisfy the relation constraint provided.
        *
        * Returns a new Filter that can be used to constrain the value of a Document property.
        *
        * @param {string|FieldPath} fieldPath The name of a property value to compare.
        * @param {string} opStr A comparison operation in the form of a string
        * (e.g., "<").
        * @param {*} value The value to which to compare the field for inclusion in
        * a query.
        * @returns {Filter} The created Filter.
        *
        * @example
        * ```
        * let collectionRef = firestore.collection('col');
        *
        * collectionRef.where(Filter.where('foo', '==', 'bar')).get().then(querySnapshot => {
        *   querySnapshot.forEach(documentSnapshot => {
        *     console.log(`Found document at ${documentSnapshot.ref.path}`);
        *   });
        * });
        * ```
        */
      inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): typings.googleCloudFirestore.FirebaseFirestore.Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Filter]
      inline def where(
        fieldPath: typings.googleCloudFirestore.FirebaseFirestore.FieldPath,
        opStr: WhereFilterOp,
        value: Any
      ): typings.googleCloudFirestore.FirebaseFirestore.Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Filter]
    }
    
    @JSGlobal("FirebaseFirestore.Firestore")
    @js.native
    /**
      * @param settings Configuration object. See [Firestore Documentation]
      * {@link https://firebase.google.com/docs/firestore/}
      */
    open class Firestore ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.Firestore {
      def this(settings: Settings) = this()
    }
    
    @JSGlobal("FirebaseFirestore.GeoPoint")
    @js.native
    open class GeoPoint protected ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.GeoPoint {
      /**
        * Creates a new immutable GeoPoint object with the provided latitude and
        * longitude values.
        * @param latitude The latitude as number between -90 and 90.
        * @param longitude The longitude as number between -180 and 180.
        */
      def this(latitude: Double, longitude: Double) = this()
      
      /**
        * Returns true if this `GeoPoint` is equal to the provided one.
        *
        * @param other The `GeoPoint` to compare against.
        * @return true if this `GeoPoint` is equal to the provided one.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.GeoPoint): Boolean = js.native
      
      /* CompleteClass */
      override val latitude: Double = js.native
      
      /* CompleteClass */
      override val longitude: Double = js.native
    }
    
    @JSGlobal("FirebaseFirestore.GrpcStatus")
    @js.native
    object GrpcStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus & Double] = js.native
      
      /* 10 */ val ABORTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ABORTED & Double = js.native
      
      /* 6 */ val ALREADY_EXISTS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ALREADY_EXISTS & Double = js.native
      
      /* 1 */ val CANCELLED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.CANCELLED & Double = js.native
      
      /* 15 */ val DATA_LOSS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DATA_LOSS & Double = js.native
      
      /* 4 */ val DEADLINE_EXCEEDED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DEADLINE_EXCEEDED & Double = js.native
      
      /* 9 */ val FAILED_PRECONDITION: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.FAILED_PRECONDITION & Double = js.native
      
      /* 13 */ val INTERNAL: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INTERNAL & Double = js.native
      
      /* 3 */ val INVALID_ARGUMENT: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INVALID_ARGUMENT & Double = js.native
      
      /* 5 */ val NOT_FOUND: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.NOT_FOUND & Double = js.native
      
      /* 0 */ val OK: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OK & Double = js.native
      
      /* 11 */ val OUT_OF_RANGE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OUT_OF_RANGE & Double = js.native
      
      /* 7 */ val PERMISSION_DENIED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.PERMISSION_DENIED & Double = js.native
      
      /* 8 */ val RESOURCE_EXHAUSTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.RESOURCE_EXHAUSTED & Double = js.native
      
      /* 16 */ val UNAUTHENTICATED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAUTHENTICATED & Double = js.native
      
      /* 14 */ val UNAVAILABLE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAVAILABLE & Double = js.native
      
      /* 12 */ val UNIMPLEMENTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNIMPLEMENTED & Double = js.native
      
      /* 2 */ val UNKNOWN: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNKNOWN & Double = js.native
    }
    
    @JSGlobal("FirebaseFirestore.Query")
    @js.native
    /* protected */ open class Query[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.Query[T]
    
    @JSGlobal("FirebaseFirestore.QueryDocumentSnapshot")
    @js.native
    /* private */ open class QueryDocumentSnapshot[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.QueryDocumentSnapshot[T]
    
    @JSGlobal("FirebaseFirestore.QueryPartition")
    @js.native
    /* private */ open class QueryPartition[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.QueryPartition[T]
    
    @JSGlobal("FirebaseFirestore.QuerySnapshot")
    @js.native
    /* private */ open class QuerySnapshot[T] ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.QuerySnapshot[T]
    
    @JSGlobal("FirebaseFirestore.Timestamp")
    @js.native
    open class Timestamp protected ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.Timestamp {
      /**
        * Creates a new timestamp.
        *
        * @param seconds The number of seconds of UTC time since Unix epoch
        * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
        * 9999-12-31T23:59:59Z inclusive.
        * @param nanoseconds The non-negative fractions of a second at nanosecond
        * resolution. Negative second values with fractions must still have
        * non-negative nanoseconds values that count forward in time. Must be from
        * 0 to 999,999,999 inclusive.
        */
      def this(seconds: Double, nanoseconds: Double) = this()
      
      /**
        * Returns true if this `Timestamp` is equal to the provided one.
        *
        * @param other The `Timestamp` to compare against.
        * @return 'true' if this `Timestamp` is equal to the provided one.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.Timestamp): Boolean = js.native
      
      /** The non-negative fractions of a second at nanosecond resolution. */
      /* CompleteClass */
      override val nanoseconds: Double = js.native
      
      /**
        * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
        */
      /* CompleteClass */
      override val seconds: Double = js.native
      
      /**
        * Returns a new `Date` corresponding to this timestamp. This may lose
        * precision.
        *
        * @return JavaScript `Date` object representing the same point in time as
        * this `Timestamp`, with millisecond precision.
        */
      /* CompleteClass */
      override def toDate(): js.Date = js.native
      
      /**
        * Returns the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
        *
        * @return The point in time corresponding to this timestamp, represented as
        * the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
        */
      /* CompleteClass */
      override def toMillis(): Double = js.native
    }
    /* static members */
    object Timestamp {
      
      @JSGlobal("FirebaseFirestore.Timestamp")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new timestamp from the given date.
        *
        * @param date The date to initialize the `Timestamp` from.
        * @return A new `Timestamp` representing the same point in time as the
        * given date.
        */
      inline def fromDate(date: js.Date): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
      
      /**
        * Creates a new timestamp from the given number of milliseconds.
        *
        * @param milliseconds Number of milliseconds since Unix epoch
        * 1970-01-01T00:00:00Z.
        * @return A new `Timestamp` representing the same point in time as the
        * given number of milliseconds.
        */
      inline def fromMillis(milliseconds: Double): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
      
      /**
        * Creates a new timestamp with the current date, with millisecond precision.
        *
        * @return A new `Timestamp` representing the current date.
        */
      inline def now(): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
    }
    
    @JSGlobal("FirebaseFirestore.Transaction")
    @js.native
    /* private */ open class Transaction ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.Transaction
    
    @JSGlobal("FirebaseFirestore.WriteBatch")
    @js.native
    /* private */ open class WriteBatch ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.WriteBatch
    
    @JSGlobal("FirebaseFirestore.WriteResult")
    @js.native
    /* private */ open class WriteResult ()
      extends StObject
         with typings.googleCloudFirestore.FirebaseFirestore.WriteResult {
      
      /**
        * Returns true if this `WriteResult` is equal to the provided one.
        *
        * @param other The `WriteResult` to compare against.
        * @return true if this `WriteResult` is equal to the provided one.
        */
      /* CompleteClass */
      override def isEqual(other: typings.googleCloudFirestore.FirebaseFirestore.WriteResult): Boolean = js.native
      
      /**
        * The write time as set by the Firestore servers.
        */
      /* CompleteClass */
      override val writeTime: typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    }
    
    /**
      * Sets or disables the log function for all active Firestore instances.
      *
      * @param logger A log function that takes a message (such as `console.log`) or
      * `null` to turn off logging.
      */
    inline def setLogFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")().asInstanceOf[Unit]
    inline def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object v1 {
      
      @JSGlobal("FirebaseFirestore.v1")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("FirebaseFirestore.v1.FirestoreAdminClient")
      @js.native
      def FirestoreAdminClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any = js.native
      inline def FirestoreAdminClient_=(
        x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_firestore_admin_client.FirestoreAdminClient */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("FirebaseFirestore.v1.FirestoreClient")
      @js.native
      /**
        * Construct an instance of FirestoreClient.
        *
        * @param {object} [options] - The configuration object.
        * The options accepted by the constructor are described in detail
        * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
        * The common options are:
        * @param {object} [options.credentials] - Credentials object.
        * @param {string} [options.credentials.client_email]
        * @param {string} [options.credentials.private_key]
        * @param {string} [options.email] - Account email address. Required when
        *     using a .pem or .p12 keyFilename.
        * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
        *     .p12 key downloaded from the Google Developers Console. If you provide
        *     a path to a JSON file, the projectId option below is not necessary.
        *     NOTE: .pem and .p12 require you to specify options.email as well.
        * @param {number} [options.port] - The port on which to connect to
        *     the remote host.
        * @param {string} [options.projectId] - The project ID from the Google
        *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
        *     the environment variable GCLOUD_PROJECT for your project ID. If your
        *     app is running in an environment which supports
        *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
        *     your project ID will be detected automatically.
        * @param {string} [options.apiEndpoint] - The domain name of the
        *     API remote host.
        * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
        *     Follows the structure of {@link gapicConfig}.
        * @param {boolean} [options.fallback] - Use HTTP fallback mode.
        *     In fallback mode, a special browser-compatible transport implementation is used
        *     instead of gRPC transport. In browser context (if the `window` object is defined)
        *     the fallback mode is enabled automatically; set `options.fallback` to `false`
        *     if you need to override this behavior.
        */
      open class FirestoreClient ()
        extends typings.googleCloudFirestore.typesV1beta1FirestoreClientMod.FirestoreClient {
        def this(opts: ClientOptions) = this()
      }
      @JSGlobal("FirebaseFirestore.v1.FirestoreClient")
      @js.native
      def FirestoreClient: TypeofFirestoreClient = js.native
      inline def FirestoreClient_=(x: TypeofFirestoreClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
    
    object v1beta1 {
      
      @JSGlobal("FirebaseFirestore.v1beta1")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("FirebaseFirestore.v1beta1.FirestoreClient")
      @js.native
      /**
        * Construct an instance of FirestoreClient.
        *
        * @param {object} [options] - The configuration object.
        * The options accepted by the constructor are described in detail
        * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
        * The common options are:
        * @param {object} [options.credentials] - Credentials object.
        * @param {string} [options.credentials.client_email]
        * @param {string} [options.credentials.private_key]
        * @param {string} [options.email] - Account email address. Required when
        *     using a .pem or .p12 keyFilename.
        * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
        *     .p12 key downloaded from the Google Developers Console. If you provide
        *     a path to a JSON file, the projectId option below is not necessary.
        *     NOTE: .pem and .p12 require you to specify options.email as well.
        * @param {number} [options.port] - The port on which to connect to
        *     the remote host.
        * @param {string} [options.projectId] - The project ID from the Google
        *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
        *     the environment variable GCLOUD_PROJECT for your project ID. If your
        *     app is running in an environment which supports
        *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
        *     your project ID will be detected automatically.
        * @param {string} [options.apiEndpoint] - The domain name of the
        *     API remote host.
        * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
        *     Follows the structure of {@link gapicConfig}.
        * @param {boolean} [options.fallback] - Use HTTP fallback mode.
        *     In fallback mode, a special browser-compatible transport implementation is used
        *     instead of gRPC transport. In browser context (if the `window` object is defined)
        *     the fallback mode is enabled automatically; set `options.fallback` to `false`
        *     if you need to override this behavior.
        */
      open class FirestoreClient ()
        extends typings.googleCloudFirestore.typesV1beta1FirestoreClientMod.FirestoreClient {
        def this(opts: ClientOptions) = this()
      }
      @JSGlobal("FirebaseFirestore.v1beta1.FirestoreClient")
      @js.native
      def FirestoreClient: TypeofFirestoreClient = js.native
      inline def FirestoreClient_=(x: TypeofFirestoreClient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
  }
}

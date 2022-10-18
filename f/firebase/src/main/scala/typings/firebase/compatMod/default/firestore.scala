package typings.firebase.compatMod.default

import typings.firebase.compatMod.firebase.app.App
import typings.firebase.compatMod.firebase.firestore.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestore {
  
  inline def apply(): typings.firebase.compatMod.firebase.firestore.Firestore = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.firebase.compatMod.firebase.firestore.Firestore]
  inline def apply(app: App): typings.firebase.compatMod.firebase.firestore.Firestore = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.Firestore]
  
  @JSImport("firebase/compat", "default.firestore")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat", "default.firestore.Blob")
  @js.native
  /* private */ open class Blob ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.Blob {
    
    /**
      * Returns true if this `Blob` is equal to the provided one.
      *
      * @param other The `Blob` to compare against.
      * @return true if this `Blob` is equal to the provided one.
      */
    /* CompleteClass */
    override def isEqual(other: typings.firebase.compatMod.firebase.firestore.Blob): Boolean = js.native
    
    /**
      * Returns the bytes of a Blob as a Base64-encoded string.
      *
      * @return
      *   The Base64-encoded string created from the Blob object.
      */
    /* CompleteClass */
    override def toBase64(): String = js.native
    
    /**
      * Returns the bytes of a Blob in a new Uint8Array.
      *
      * @return
      *   The Uint8Array created from the Blob object.
      */
    /* CompleteClass */
    override def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Blob {
    
    @JSImport("firebase/compat", "default.firestore.Blob")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Blob from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64
      *   The Base64 string used to create the Blob object.
      */
    inline def fromBase64String(base64: String): typings.firebase.compatMod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.Blob]
    
    /**
      * Creates a new Blob from the given Uint8Array.
      *
      * @param array
      *   The Uint8Array used to create the Blob object.
      */
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebase.compatMod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.Blob]
  }
  
  @JSImport("firebase/compat", "default.firestore.CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: Double = js.native
  
  @JSImport("firebase/compat", "default.firestore.CollectionReference")
  @js.native
  /* private */ open class CollectionReference[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.CollectionReference[T]
  
  @JSImport("firebase/compat", "default.firestore.DocumentReference")
  @js.native
  /* private */ open class DocumentReference[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.DocumentReference[T]
  
  @JSImport("firebase/compat", "default.firestore.DocumentSnapshot")
  @js.native
  /* protected */ open class DocumentSnapshot[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.DocumentSnapshot[T]
  
  @JSImport("firebase/compat", "default.firestore.FieldPath")
  @js.native
  open class FieldPath protected ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.FieldPath {
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
    override def isEqual(other: typings.firebase.compatMod.firebase.firestore.FieldPath): Boolean = js.native
  }
  /* static members */
  object FieldPath {
    
    @JSImport("firebase/compat", "default.firestore.FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a special sentinel `FieldPath` to refer to the ID of a document.
      * It can be used in queries to sort or filter by the document ID.
      */
    inline def documentId(): typings.firebase.compatMod.firebase.firestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldPath]
  }
  
  @JSImport("firebase/compat", "default.firestore.FieldValue")
  @js.native
  /* private */ open class FieldValue ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.FieldValue {
    
    /**
      * Returns true if this `FieldValue` is equal to the provided one.
      *
      * @param other The `FieldValue` to compare against.
      * @return true if this `FieldValue` is equal to the provided one.
      */
    /* CompleteClass */
    override def isEqual(other: typings.firebase.compatMod.firebase.firestore.FieldValue): Boolean = js.native
  }
  /* static members */
  object FieldValue {
    
    @JSImport("firebase/compat", "default.firestore.FieldValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a special value that can be used with `set()` or `update()` that tells
      * the server to remove the given elements from any array value that already
      * exists on the server. All instances of each element specified will be
      * removed from the array. If the field being modified is not already an
      * array it will be overwritten with an empty array.
      *
      * @param elements The elements to remove from the array.
      * @return The FieldValue sentinel for use in a call to `set()` or `update()`.
      */
    inline def arrayRemove(elements: Any*): typings.firebase.compatMod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldValue]
    
    /**
      * Returns a special value that can be used with `set()` or `update()` that tells
      * the server to union the given elements with any array value that already
      * exists on the server. Each specified element that doesn't already exist in
      * the array will be added to the end. If the field being modified is not
      * already an array it will be overwritten with an array containing exactly
      * the specified elements.
      *
      * @param elements The elements to union into the array.
      * @return The FieldValue sentinel for use in a call to `set()` or `update()`.
      */
    inline def arrayUnion(elements: Any*): typings.firebase.compatMod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldValue]
    
    /**
      * Returns a sentinel for use with `update()` to mark a field for deletion.
      */
    inline def delete(): typings.firebase.compatMod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldValue]
    
    /**
      * Returns a special value that can be used with `set()` or `update()` that tells
      * the server to increment the field's current value by the given value.
      *
      * If either the operand or the current field value uses floating point precision,
      * all arithmetic follows IEEE 754 semantics. If both values are integers,
      * values outside of JavaScript's safe number range (`Number.MIN_SAFE_INTEGER` to
      * `Number.MAX_SAFE_INTEGER`) are also subject to precision loss. Furthermore,
      * once processed by the Firestore backend, all integer operations are capped
      * between -2^63 and 2^63-1.
      *
      * If the current field value is not of type `number`, or if the field does not
      * yet exist, the transformation sets the field to the given value.
      *
      * @param n The value to increment by.
      * @return The FieldValue sentinel for use in a call to `set()` or `update()`.
      */
    inline def increment(n: Double): typings.firebase.compatMod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldValue]
    
    /**
      * Returns a sentinel used with `set()` or `update()` to include a
      * server-generated timestamp in the written data.
      */
    inline def serverTimestamp(): typings.firebase.compatMod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebase.compatMod.firebase.firestore.FieldValue]
  }
  
  @JSImport("firebase/compat", "default.firestore.Firestore")
  @js.native
  /* private */ open class Firestore ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.Firestore
  
  @JSImport("firebase/compat", "default.firestore.GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.GeoPoint {
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
    override def isEqual(other: typings.firebase.compatMod.firebase.firestore.GeoPoint): Boolean = js.native
    
    /**
      * The latitude of this GeoPoint instance.
      */
    /* CompleteClass */
    override val latitude: Double = js.native
    
    /**
      * The longitude of this GeoPoint instance.
      */
    /* CompleteClass */
    override val longitude: Double = js.native
  }
  
  @JSImport("firebase/compat", "default.firestore.Query")
  @js.native
  /* protected */ open class Query[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.Query[T]
  
  @JSImport("firebase/compat", "default.firestore.QueryDocumentSnapshot")
  @js.native
  /* private */ open class QueryDocumentSnapshot[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.QueryDocumentSnapshot[T]
  
  @JSImport("firebase/compat", "default.firestore.QuerySnapshot")
  @js.native
  /* private */ open class QuerySnapshot[T] ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.QuerySnapshot[T]
  
  @JSImport("firebase/compat", "default.firestore.Timestamp")
  @js.native
  open class Timestamp protected ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds The number of seconds of UTC time since Unix epoch
      *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      *     9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds The non-negative fractions of a second at nanosecond
      *     resolution. Negative second values with fractions must still have
      *     non-negative nanoseconds values that count forward in time. Must be
      *     from 0 to 999,999,999 inclusive.
      */
    def this(seconds: Double, nanoseconds: Double) = this()
    
    /**
      * Returns true if this `Timestamp` is equal to the provided one.
      *
      * @param other The `Timestamp` to compare against.
      * @return true if this `Timestamp` is equal to the provided one.
      */
    /* CompleteClass */
    override def isEqual(other: typings.firebase.compatMod.firebase.firestore.Timestamp): Boolean = js.native
    
    /* CompleteClass */
    override val nanoseconds: Double = js.native
    
    /* CompleteClass */
    override val seconds: Double = js.native
    
    /**
      * Convert a Timestamp to a JavaScript `Date` object. This conversion causes
      * a loss of precision since `Date` objects only support millisecond precision.
      *
      * @return JavaScript `Date` object representing the same point in time as
      *     this `Timestamp`, with millisecond precision.
      */
    /* CompleteClass */
    override def toDate(): js.Date = js.native
    
    /**
      * Convert a timestamp to a numeric timestamp (in milliseconds since epoch).
      * This operation causes a loss of precision.
      *
      * @return The point in time corresponding to this timestamp, represented as
      *     the number of milliseconds since Unix epoch 1970-01-01T00:00:00Z.
      */
    /* CompleteClass */
    override def toMillis(): Double = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("firebase/compat", "default.firestore.Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date The date to initialize the `Timestamp` from.
      * @return A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebase.compatMod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @return A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebase.compatMod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.compatMod.firebase.firestore.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @return a new timestamp representing the current date.
      */
    inline def now(): typings.firebase.compatMod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebase.compatMod.firebase.firestore.Timestamp]
  }
  
  @JSImport("firebase/compat", "default.firestore.Transaction")
  @js.native
  /* private */ open class Transaction ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.Transaction
  
  @JSImport("firebase/compat", "default.firestore.WriteBatch")
  @js.native
  /* private */ open class WriteBatch ()
    extends StObject
       with typings.firebase.compatMod.firebase.firestore.WriteBatch
  
  inline def setLogLevel(logLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

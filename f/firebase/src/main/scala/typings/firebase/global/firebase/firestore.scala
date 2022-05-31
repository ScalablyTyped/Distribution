package typings.firebase.global.firebase

import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.firestore.LogLevel
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestore {
  
  inline def apply(): typings.firebase.mod.firebase.firestore.Firestore = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.firebase.mod.firebase.firestore.Firestore]
  inline def apply(app: App): typings.firebase.mod.firebase.firestore.Firestore = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Firestore]
  
  @JSGlobal("firebase.firestore")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("firebase.firestore.Blob")
  @js.native
  /* private */ class Blob ()
    extends typings.firebase.mod.default.firestore.Blob
  /* static members */
  object Blob {
    
    @JSGlobal("firebase.firestore.Blob")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Blob from the given Base64 string, converting it to
      * bytes.
      *
      * @param base64
      *   The Base64 string used to create the Blob object.
      */
    inline def fromBase64String(base64: String): typings.firebase.mod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Blob]
    
    /**
      * Creates a new Blob from the given Uint8Array.
      *
      * @param array
      *   The Uint8Array used to create the Blob object.
      */
    inline def fromUint8Array(array: Uint8Array): typings.firebase.mod.firebase.firestore.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Blob]
  }
  
  @JSGlobal("firebase.firestore.CACHE_SIZE_UNLIMITED")
  @js.native
  val CACHE_SIZE_UNLIMITED: Double = js.native
  
  @JSGlobal("firebase.firestore.CollectionReference")
  @js.native
  /* private */ class CollectionReference[T] ()
    extends typings.firebase.mod.default.firestore.CollectionReference[T]
  
  @JSGlobal("firebase.firestore.DocumentReference")
  @js.native
  /* private */ class DocumentReference[T] ()
    extends typings.firebase.mod.default.firestore.DocumentReference[T]
  
  @JSGlobal("firebase.firestore.DocumentSnapshot")
  @js.native
  /* protected */ class DocumentSnapshot[T] ()
    extends typings.firebase.mod.default.firestore.DocumentSnapshot[T]
  
  @JSGlobal("firebase.firestore.FieldPath")
  @js.native
  class FieldPath protected ()
    extends typings.firebase.mod.default.firestore.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  /* static members */
  object FieldPath {
    
    @JSGlobal("firebase.firestore.FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a special sentinel `FieldPath` to refer to the ID of a document.
      * It can be used in queries to sort or filter by the document ID.
      */
    inline def documentId(): typings.firebase.mod.firebase.firestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebase.mod.firebase.firestore.FieldPath]
  }
  
  @JSGlobal("firebase.firestore.FieldValue")
  @js.native
  /* private */ class FieldValue ()
    extends typings.firebase.mod.default.firestore.FieldValue
  /* static members */
  object FieldValue {
    
    @JSGlobal("firebase.firestore.FieldValue")
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
    inline def arrayRemove(elements: js.Any*): typings.firebase.mod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.FieldValue]
    
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
    inline def arrayUnion(elements: js.Any*): typings.firebase.mod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.FieldValue]
    
    /**
      * Returns a sentinel for use with `update()` to mark a field for deletion.
      */
    inline def delete(): typings.firebase.mod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typings.firebase.mod.firebase.firestore.FieldValue]
    
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
    inline def increment(n: Double): typings.firebase.mod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.FieldValue]
    
    /**
      * Returns a sentinel used with `set()` or `update()` to include a
      * server-generated timestamp in the written data.
      */
    inline def serverTimestamp(): typings.firebase.mod.firebase.firestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebase.mod.firebase.firestore.FieldValue]
  }
  
  @JSGlobal("firebase.firestore.Firestore")
  @js.native
  /* private */ class Firestore ()
    extends typings.firebase.mod.default.firestore.Firestore
  
  @JSGlobal("firebase.firestore.GeoPoint")
  @js.native
  class GeoPoint protected ()
    extends typings.firebase.mod.default.firestore.GeoPoint {
    /**
      * Creates a new immutable GeoPoint object with the provided latitude and
      * longitude values.
      * @param latitude The latitude as number between -90 and 90.
      * @param longitude The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSGlobal("firebase.firestore.Query")
  @js.native
  /* protected */ class Query[T] ()
    extends typings.firebase.mod.default.firestore.Query[T]
  
  @JSGlobal("firebase.firestore.QueryDocumentSnapshot")
  @js.native
  /* private */ class QueryDocumentSnapshot[T] ()
    extends typings.firebase.mod.default.firestore.QueryDocumentSnapshot[T]
  
  @JSGlobal("firebase.firestore.QuerySnapshot")
  @js.native
  /* private */ class QuerySnapshot[T] ()
    extends typings.firebase.mod.default.firestore.QuerySnapshot[T]
  
  @JSGlobal("firebase.firestore.Timestamp")
  @js.native
  class Timestamp protected ()
    extends typings.firebase.mod.default.firestore.Timestamp {
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
  }
  /* static members */
  object Timestamp {
    
    @JSGlobal("firebase.firestore.Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date The date to initialize the `Timestamp` from.
      * @return A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: Date): typings.firebase.mod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @return A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebase.mod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @return a new timestamp representing the current date.
      */
    inline def now(): typings.firebase.mod.firebase.firestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebase.mod.firebase.firestore.Timestamp]
  }
  
  @JSGlobal("firebase.firestore.Transaction")
  @js.native
  /* private */ class Transaction ()
    extends typings.firebase.mod.default.firestore.Transaction
  
  @JSGlobal("firebase.firestore.WriteBatch")
  @js.native
  /* private */ class WriteBatch ()
    extends typings.firebase.mod.default.firestore.WriteBatch
  
  inline def setLogLevel(logLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

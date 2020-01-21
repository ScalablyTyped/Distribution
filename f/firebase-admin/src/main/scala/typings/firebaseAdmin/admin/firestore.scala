package typings.firebaseAdmin.admin

import typings.firebaseAdmin.admin.app.App
import typings.googleCloudFirestore.FirebaseFirestore.Settings
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.firestore")
@js.native
object firestore extends js.Object {
  @js.native
  class CollectionReference[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.CollectionReference[T]
  
  @js.native
  class DocumentReference[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.DocumentReference[T]
  
  @js.native
  class DocumentSnapshot[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.DocumentSnapshot[T]
  
  @js.native
  class FieldPath protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.FieldValue
  
  @js.native
  /**
    * @param settings Configuration object. See [Firestore Documentation]
    * {@link https://firebase.google.com/docs/firestore/}
    */
  class Firestore ()
    extends typings.googleCloudFirestore.FirebaseFirestore.Firestore {
    def this(settings: Settings) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.GeoPoint {
    /**
      * Creates a new immutable GeoPoint object with the provided latitude and
      * longitude values.
      * @param latitude The latitude as number between -90 and 90.
      * @param longitude The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Query[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.Query[T]
  
  @js.native
  class QueryDocumentSnapshot[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.QueryDocumentSnapshot[T]
  
  @js.native
  class QuerySnapshot[T] protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.QuerySnapshot[T]
  
  @js.native
  class Timestamp protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.Timestamp {
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
  }
  
  @js.native
  class Transaction protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.Transaction
  
  @js.native
  class WriteBatch protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.WriteBatch
  
  @js.native
  class WriteResult protected ()
    extends typings.googleCloudFirestore.FirebaseFirestore.WriteResult
  
  val v1beta1: js.Any = js.native
  /**
    *
    * @param app A Firebase App instance
    * @returns A [Firestore](https://cloud.google.com/nodejs/docs/reference/firestore/latest/Firestore)
    * instance as defined in the `@google-cloud/firestore` package.
    */
  def apply(): Firestore = js.native
  def apply(app: App): Firestore = js.native
  def setLogFunction(): Unit = js.native
  /**
    * Sets or disables the log function for all active Firestore instances.
    * 
    * @param logger A log function that takes a message (such as `console.log`) or
    * `null` to turn off logging.
    */
  def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = js.native
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Returns a special sentinel FieldPath to refer to the ID of a document.
      * It can be used in queries to sort or filter by the document ID.
      */
    def documentId(): typings.googleCloudFirestore.FirebaseFirestore.FieldPath = js.native
  }
  
  /* static members */
  @js.native
  object FieldValue extends js.Object {
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
    def arrayRemove(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
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
    def arrayUnion(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
    /**
      * Returns a sentinel for use with update() or set() with {merge:true} to
      * mark a field for deletion.
      *
      * @return The FieldValue sentinel for use in a call to set() or update().
      */
    def delete(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
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
    def increment(n: Double): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
    /**
      * Returns a sentinel used with set(), create() or update() to include a
      * server-generated timestamp in the written data.
      *
      * @return The FieldValue sentinel for use in a call to set(), create() or
      * update().
      */
    def serverTimestamp(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date The date to initialize the `Timestamp` from.
      * @return A new `Timestamp` representing the same point in time as the
      * given date.
      */
    def fromDate(date: Date): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds Number of milliseconds since Unix epoch
      * 1970-01-01T00:00:00Z.
      * @return A new `Timestamp` representing the same point in time as the
      * given number of milliseconds.
      */
    def fromMillis(milliseconds: Double): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @return A new `Timestamp` representing the current date.
      */
    def now(): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
  }
  
  @js.native
  object v1 extends js.Object {
    var FirestoreAdminClient: js.Any = js.native
    var FirestoreClient: js.Any = js.native
  }
  
}


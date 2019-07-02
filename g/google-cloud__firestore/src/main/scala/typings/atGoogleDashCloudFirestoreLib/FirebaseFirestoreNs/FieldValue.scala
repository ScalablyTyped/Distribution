package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.FieldValue")
@js.native
class FieldValue protected () extends js.Object {
  /**
    * Returns true if this `FieldValue` is equal to the provided one.
    *
    * @param other The `FieldValue` to compare against.
    * @return true if this `FieldValue` is equal to the provided one.
    */
  def isEqual(other: FieldValue): scala.Boolean = js.native
}

/* static members */
@JSGlobal("FirebaseFirestore.FieldValue")
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
  def arrayRemove(elements: js.Any*): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldValue = js.native
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
  def arrayUnion(elements: js.Any*): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldValue = js.native
  /**
    * Returns a sentinel for use with update() or set() with {merge:true} to
    * mark a field for deletion.
    *
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def delete(): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldValue = js.native
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
  def increment(n: scala.Double): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldValue = js.native
  /**
    * Returns a sentinel used with set(), create() or update() to include a
    * server-generated timestamp in the written data.
    *
    * @return The FieldValue sentinel for use in a call to set(), create() or
    * update().
    */
  def serverTimestamp(): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldValue = js.native
}


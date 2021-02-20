package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "default.firestore.FieldValue")
@js.native
class FieldValue protected () extends StObject {
  
  /**
    * Returns true if this `FieldValue` is equal to the provided one.
    *
    * @param other The `FieldValue` to compare against.
    * @return true if this `FieldValue` is equal to the provided one.
    */
  def isEqual(other: typings.firebase.mod.firebase.firestore.FieldValue): Boolean = js.native
}
/* static members */
object FieldValue {
  
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
  @JSImport("firebase", "default.firestore.FieldValue.arrayRemove")
  @js.native
  def arrayRemove(elements: js.Any*): typings.firebase.mod.firebase.firestore.FieldValue = js.native
  
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
  @JSImport("firebase", "default.firestore.FieldValue.arrayUnion")
  @js.native
  def arrayUnion(elements: js.Any*): typings.firebase.mod.firebase.firestore.FieldValue = js.native
  
  /**
    * Returns a sentinel for use with `update()` to mark a field for deletion.
    */
  @JSImport("firebase", "default.firestore.FieldValue.delete")
  @js.native
  def delete(): typings.firebase.mod.firebase.firestore.FieldValue = js.native
  
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
  @JSImport("firebase", "default.firestore.FieldValue.increment")
  @js.native
  def increment(n: Double): typings.firebase.mod.firebase.firestore.FieldValue = js.native
  
  /**
    * Returns a sentinel used with `set()` or `update()` to include a
    * server-generated timestamp in the written data.
    */
  @JSImport("firebase", "default.firestore.FieldValue.serverTimestamp")
  @js.native
  def serverTimestamp(): typings.firebase.mod.firebase.firestore.FieldValue = js.native
}

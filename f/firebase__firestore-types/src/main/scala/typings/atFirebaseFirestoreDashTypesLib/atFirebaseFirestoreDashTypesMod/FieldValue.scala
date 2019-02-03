package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "FieldValue")
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
@JSImport("@firebase/firestore-types", "FieldValue")
@js.native
object FieldValue extends js.Object {
  /**
    * Returns a special value that can be used with set() or update() that tells
    * the server to remove the given elements from any array value that already
    * exists on the server. All instances of each element specified will be
    * removed from the array. If the field being modified is not already an
    * array it will be overwritten with an empty array.
    *
    * @param elements The elements to remove from the array.
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def arrayRemove(elements: js.Any*): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a special value that can be used with set() or update() that tells
    * the server to union the given elements with any array value that already
    * exists on the server. Each specified element that doesn't already exist in
    * the array will be added to the end. If the field being modified is not
    * already an array it will be overwritten with an array containing exactly
    * the specified elements.
    *
    * @param elements The elements to union into the array.
    * @return The FieldValue sentinel for use in a call to set() or update().
    */
  def arrayUnion(elements: js.Any*): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a sentinel for use with update() to mark a field for deletion.
    */
  def delete(): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
  /**
    * Returns a sentinel used with set() or update() to include a
    * server-generated timestamp in the written data.
    */
  def serverTimestamp(): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FieldValue = js.native
}


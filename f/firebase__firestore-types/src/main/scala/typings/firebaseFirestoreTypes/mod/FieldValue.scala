package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "FieldValue")
@js.native
class FieldValue protected () extends js.Object {
  def isEqual(other: FieldValue): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore-types", "FieldValue")
@js.native
object FieldValue extends js.Object {
  def arrayRemove(elements: js.Any*): FieldValue = js.native
  def arrayUnion(elements: js.Any*): FieldValue = js.native
  def delete(): FieldValue = js.native
  def increment(n: Double): FieldValue = js.native
  def serverTimestamp(): FieldValue = js.native
}


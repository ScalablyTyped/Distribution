package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValue extends js.Object {
  /**
    * Returns true if this `FieldValue` is equal to the provided one.
    *
    * @param other The `FieldValue` to compare against.
    * @return true if this `FieldValue` is equal to the provided one.
    */
  def isEqual(other: FieldValue): scala.Boolean
}

object FieldValue {
  @scala.inline
  def apply(isEqual: js.Function1[FieldValue, scala.Boolean]): FieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.asInstanceOf[FieldValue]
  }
}


package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayValue extends js.Object {
  /** Values in the array. */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}

object ArrayValue {
  @scala.inline
  def apply(values: js.Array[Value] = null): ArrayValue = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ArrayValue]
  }
}


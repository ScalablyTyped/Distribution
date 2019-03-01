package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFilter extends js.Object {
  /** The field to filter by. */
  var field: js.UndefOr[FieldReference] = js.undefined
  /** The operator to filter by. */
  var op: js.UndefOr[java.lang.String] = js.undefined
  /** The value to compare to. */
  var value: js.UndefOr[Value] = js.undefined
}

object FieldFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: java.lang.String = null, value: Value = null): FieldFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (op != null) __obj.updateDynamic("op")(op)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FieldFilter]
  }
}


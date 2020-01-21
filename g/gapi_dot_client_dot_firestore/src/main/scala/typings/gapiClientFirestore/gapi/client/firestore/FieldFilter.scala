package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFilter extends js.Object {
  /** The field to filter by. */
  var field: js.UndefOr[FieldReference] = js.undefined
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.undefined
  /** The value to compare to. */
  var value: js.UndefOr[Value] = js.undefined
}

object FieldFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: String = null, value: Value = null): FieldFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
}


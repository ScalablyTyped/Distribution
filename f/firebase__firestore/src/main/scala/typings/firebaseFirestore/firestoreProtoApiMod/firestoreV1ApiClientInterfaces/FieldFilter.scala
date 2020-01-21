package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.FieldFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFilter extends js.Object {
  var field: js.UndefOr[FieldReference] = js.undefined
  var op: js.UndefOr[FieldFilterOp] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
}

object FieldFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: FieldFilterOp = null, value: Value = null): FieldFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
}


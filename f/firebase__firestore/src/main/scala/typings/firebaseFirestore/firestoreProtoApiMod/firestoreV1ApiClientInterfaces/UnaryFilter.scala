package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.UnaryFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryFilter extends js.Object {
  var field: js.UndefOr[FieldReference] = js.undefined
  var op: js.UndefOr[UnaryFilterOp] = js.undefined
}

object UnaryFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: UnaryFilterOp = null): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryFilter]
  }
}


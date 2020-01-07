package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter with a single operand.
  */
@js.native
trait Schema$UnaryFilter extends js.Object {
  /**
    * The field to which to apply the operator.
    */
  var field: js.UndefOr[Schema$FieldReference] = js.native
  /**
    * The unary operator to apply.
    */
  var op: js.UndefOr[String] = js.native
}

object Schema$UnaryFilter {
  @scala.inline
  def apply(field: Schema$FieldReference = null, op: String = null): Schema$UnaryFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnaryFilter]
  }
}


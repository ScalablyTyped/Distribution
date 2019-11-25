package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryFilter extends js.Object {
  /** The field to which to apply the operator. */
  var field: js.UndefOr[FieldReference] = js.undefined
  /** The unary operator to apply. */
  var op: js.UndefOr[String] = js.undefined
}

object UnaryFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: String = null): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryFilter]
  }
}


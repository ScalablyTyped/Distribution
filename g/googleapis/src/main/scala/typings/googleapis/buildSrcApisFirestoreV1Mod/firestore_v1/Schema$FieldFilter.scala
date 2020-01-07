package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on a specific field.
  */
@js.native
trait Schema$FieldFilter extends js.Object {
  /**
    * The field to filter by.
    */
  var field: js.UndefOr[Schema$FieldReference] = js.native
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * The value to compare to.
    */
  var value: js.UndefOr[Schema$Value] = js.native
}

object Schema$FieldFilter {
  @scala.inline
  def apply(field: Schema$FieldReference = null, op: String = null, value: Schema$Value = null): Schema$FieldFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldFilter]
  }
}


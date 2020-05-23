package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldFilterOpEnum extends js.Object {
  var ARRAY_CONTAINS: FieldFilterOp
  var ARRAY_CONTAINS_ANY: FieldFilterOp
  var EQUAL: FieldFilterOp
  var GREATER_THAN: FieldFilterOp
  var GREATER_THAN_OR_EQUAL: FieldFilterOp
  var IN: FieldFilterOp
  var LESS_THAN: FieldFilterOp
  var LESS_THAN_OR_EQUAL: FieldFilterOp
  var OPERATOR_UNSPECIFIED: FieldFilterOp
  def values(): js.Array[FieldFilterOp]
}

object IFieldFilterOpEnum {
  @scala.inline
  def apply(
    ARRAY_CONTAINS: FieldFilterOp,
    ARRAY_CONTAINS_ANY: FieldFilterOp,
    EQUAL: FieldFilterOp,
    GREATER_THAN: FieldFilterOp,
    GREATER_THAN_OR_EQUAL: FieldFilterOp,
    IN: FieldFilterOp,
    LESS_THAN: FieldFilterOp,
    LESS_THAN_OR_EQUAL: FieldFilterOp,
    OPERATOR_UNSPECIFIED: FieldFilterOp,
    values: () => js.Array[FieldFilterOp]
  ): IFieldFilterOpEnum = {
    val __obj = js.Dynamic.literal(ARRAY_CONTAINS = ARRAY_CONTAINS.asInstanceOf[js.Any], ARRAY_CONTAINS_ANY = ARRAY_CONTAINS_ANY.asInstanceOf[js.Any], EQUAL = EQUAL.asInstanceOf[js.Any], GREATER_THAN = GREATER_THAN.asInstanceOf[js.Any], GREATER_THAN_OR_EQUAL = GREATER_THAN_OR_EQUAL.asInstanceOf[js.Any], IN = IN.asInstanceOf[js.Any], LESS_THAN = LESS_THAN.asInstanceOf[js.Any], LESS_THAN_OR_EQUAL = LESS_THAN_OR_EQUAL.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IFieldFilterOpEnum]
  }
}


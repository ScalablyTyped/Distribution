package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnaryFilterOpEnum extends js.Object {
  var IS_NAN: UnaryFilterOp
  var IS_NULL: UnaryFilterOp
  var OPERATOR_UNSPECIFIED: UnaryFilterOp
  def values(): js.Array[UnaryFilterOp]
}

object IUnaryFilterOpEnum {
  @scala.inline
  def apply(
    IS_NAN: UnaryFilterOp,
    IS_NULL: UnaryFilterOp,
    OPERATOR_UNSPECIFIED: UnaryFilterOp,
    values: () => js.Array[UnaryFilterOp]
  ): IUnaryFilterOpEnum = {
    val __obj = js.Dynamic.literal(IS_NAN = IS_NAN.asInstanceOf[js.Any], IS_NULL = IS_NULL.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IUnaryFilterOpEnum]
  }
}


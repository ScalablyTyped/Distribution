package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeFilterOpEnum extends js.Object {
  var AND: CompositeFilterOp
  var OPERATOR_UNSPECIFIED: CompositeFilterOp
  def values(): js.Array[CompositeFilterOp]
}

object ICompositeFilterOpEnum {
  @scala.inline
  def apply(
    AND: CompositeFilterOp,
    OPERATOR_UNSPECIFIED: CompositeFilterOp,
    values: () => js.Array[CompositeFilterOp]
  ): ICompositeFilterOpEnum = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[ICompositeFilterOpEnum]
  }
}


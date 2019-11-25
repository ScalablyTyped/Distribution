package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * If code == ARRAY, then `array_element_type`
    * is the type of the array elements.
    */
  var arrayElementType: js.UndefOr[Type] = js.undefined
  /** Required. The TypeCode for this type. */
  var code: js.UndefOr[String] = js.undefined
  /**
    * If code == STRUCT, then `struct_type`
    * provides type information for the struct's fields.
    */
  var structType: js.UndefOr[StructType] = js.undefined
}

object Type {
  @scala.inline
  def apply(arrayElementType: Type = null, code: String = null, structType: StructType = null): Type = {
    val __obj = js.Dynamic.literal()
    if (arrayElementType != null) __obj.updateDynamic("arrayElementType")(arrayElementType.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (structType != null) __obj.updateDynamic("structType")(structType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}


package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

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
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If code == STRUCT, then `struct_type`
               * provides type information for the struct's fields.
               */
  var structType: js.UndefOr[StructType] = js.undefined
}


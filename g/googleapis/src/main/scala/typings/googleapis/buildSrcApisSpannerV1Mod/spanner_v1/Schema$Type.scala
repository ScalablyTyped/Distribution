package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
  * table cell or returned from an SQL query.
  */
@js.native
trait Schema$Type extends js.Object {
  /**
    * If code == ARRAY, then `array_element_type` is the type of the array
    * elements.
    */
  var arrayElementType: js.UndefOr[Schema$Type] = js.native
  /**
    * Required. The TypeCode for this type.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * If code == STRUCT, then `struct_type` provides type information for the
    * struct&#39;s fields.
    */
  var structType: js.UndefOr[Schema$StructType] = js.native
}

object Schema$Type {
  @scala.inline
  def apply(arrayElementType: Schema$Type = null, code: String = null, structType: Schema$StructType = null): Schema$Type = {
    val __obj = js.Dynamic.literal()
    if (arrayElementType != null) __obj.updateDynamic("arrayElementType")(arrayElementType.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (structType != null) __obj.updateDynamic("structType")(structType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Type]
  }
}


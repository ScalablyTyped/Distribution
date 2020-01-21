package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of a variable, e.g., a function argument. Examples: INT64:
  * {type_kind=&quot;INT64&quot;} ARRAY&lt;STRING&gt;:
  * {type_kind=&quot;ARRAY&quot;, array_element_type=&quot;STRING&quot;}
  * STRUCT&lt;x STRING, y ARRAY&lt;DATE&gt;&gt;: {type_kind=&quot;STRUCT&quot;,
  * struct_type={fields=[      {name=&quot;x&quot;,
  * type={type_kind=&quot;STRING&quot;}},      {name=&quot;y&quot;,
  * type={type_kind=&quot;ARRAY&quot;, array_element_type=&quot;DATE&quot;}}
  * ]}}
  */
@js.native
trait SchemaStandardSqlDataType extends js.Object {
  /**
    * The type of the array&#39;s elements, if type_kind = &quot;ARRAY&quot;.
    */
  var arrayElementType: js.UndefOr[SchemaStandardSqlDataType] = js.native
  /**
    * The fields of this struct, in order, if type_kind = &quot;STRUCT&quot;.
    */
  var structType: js.UndefOr[SchemaStandardSqlStructType] = js.native
  /**
    * Required. The top level type of this field. Can be any standard SQL data
    * type (e.g., &quot;INT64&quot;, &quot;DATE&quot;, &quot;ARRAY&quot;).
    */
  var typeKind: js.UndefOr[String] = js.native
}

object SchemaStandardSqlDataType {
  @scala.inline
  def apply(
    arrayElementType: SchemaStandardSqlDataType = null,
    structType: SchemaStandardSqlStructType = null,
    typeKind: String = null
  ): SchemaStandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    if (arrayElementType != null) __obj.updateDynamic("arrayElementType")(arrayElementType.asInstanceOf[js.Any])
    if (structType != null) __obj.updateDynamic("structType")(structType.asInstanceOf[js.Any])
    if (typeKind != null) __obj.updateDynamic("typeKind")(typeKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStandardSqlDataType]
  }
}


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
  def apply(): SchemaStandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlDataType]
  }
  @scala.inline
  implicit class SchemaStandardSqlDataTypeOps[Self <: SchemaStandardSqlDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayElementType(value: SchemaStandardSqlDataType): Self = this.set("arrayElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayElementType: Self = this.set("arrayElementType", js.undefined)
    @scala.inline
    def setStructType(value: SchemaStandardSqlStructType): Self = this.set("structType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructType: Self = this.set("structType", js.undefined)
    @scala.inline
    def setTypeKind(value: String): Self = this.set("typeKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeKind: Self = this.set("typeKind", js.undefined)
  }
  
}

